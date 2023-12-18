package com.rahand.idea.channel.wrapper.tourism.encryption;

import com.rahand.idea.channel.config.TourismConfig;
import com.rahand.idea.channel.exception.ApiErrorResponse;
import com.rahand.idea.channel.exception.CustomWebClientException;
import com.rahand.idea.channel.util.LogUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.xml.bind.DatatypeConverter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.time.LocalDateTime;
import java.util.Base64;

@Service
public class TourismEncryption {

    @Autowired
    private TourismConfig tourismConfig;

    private  Logger logger = LogUtils.getLogger();

    public String signRequest(String requestJson)  {

        String signature = "";

       try {
           Document xmlPrivateKey = loadXmlFile(tourismConfig.getPrivateKey());
           String pemPublicKey = XmlKeyToPemKey(xmlPrivateKey);
           PKCS8EncodedKeySpec pkcs8 = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(pemPublicKey));
           KeyFactory keyFactory = KeyFactory.getInstance("RSA");
           PrivateKey privateKey = keyFactory.generatePrivate(pkcs8);
           MessageDigest sha1 = MessageDigest.getInstance("SHA1");
           byte[] digest = sha1.digest((requestJson).getBytes());
           Cipher cipher = Cipher.getInstance("RSA");
           cipher.init(Cipher.ENCRYPT_MODE, privateKey);
           signature = Base64.getEncoder().encodeToString(cipher.doFinal(digest));

       } catch (NoSuchPaddingException | IllegalBlockSizeException | InvalidKeyException | InvalidKeySpecException | NoSuchAlgorithmException | BadPaddingException e) {
           logger.error("Error in Tourism Encryption Service : " + e.getMessage());
           throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                   new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
       }

        return signature;
    }

    private String XmlKeyToPemKey(Document xmlKey) {

        String pemKey = "";
        int keyType = 0;
        final int PRIVATE_KEY = 1;
        final int PUBLIC_KEY = 2;
        final String[] PRIVATE_KEY_XML_NODES = {"Modulus", "Exponent", "P", "Q", "DP", "DQ", "InverseQ", "D"};
        final String[] PUBLIC_KEY_XML_NODES = {"Modulus", "Exponent"};
        Node root = xmlKey.getFirstChild();
        NodeList children = root.getChildNodes();

        if (!root.getNodeName().equals("RSAKeyValue")) {
            keyType = 0;
        }

        if (children.getLength() == PUBLIC_KEY_XML_NODES.length) {
            keyType = PUBLIC_KEY;
        } else if (children.getLength() == PRIVATE_KEY_XML_NODES.length) {
            keyType = PRIVATE_KEY;
        }

        String[] wantedNodes = {};
        if (keyType == PRIVATE_KEY) {
            wantedNodes = PRIVATE_KEY_XML_NODES;
        } else {
            wantedNodes = PUBLIC_KEY_XML_NODES;
        }
        for (int j = 0; j < wantedNodes.length; j++) {
            String wantedNode = wantedNodes[j];
            boolean found = false;
            for (int i = 0; i < children.getLength(); i++) {
                if (children.item(i).getNodeName().equals(wantedNode)) {
                    found = true;
                    break;
                }
            }
            if (!found) {

            }
        }

        if (keyType == PRIVATE_KEY) {
            BigInteger modulus = null, exponent = null, primeP = null, primeQ = null,
                    primeExponentP = null, primeExponentQ = null,
                    crtCoefficient = null, privateExponent = null;

            for (int i = 0; i < children.getLength(); i++) {

                Node node = children.item(i);
                String textValue = node.getTextContent();
                if (node.getNodeName().equals("Modulus")) {
                    modulus = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("Exponent")) {
                    exponent = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("P")) {
                    primeP = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("Q")) {
                    primeQ = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("DP")) {
                    primeExponentP = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("DQ")) {
                    primeExponentQ = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("InverseQ")) {
                    crtCoefficient = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("D")) {
                    privateExponent = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                }
            }

            try {
                RSAPrivateCrtKeySpec keySpec = new RSAPrivateCrtKeySpec(
                        modulus, exponent, privateExponent, primeP, primeQ,
                        primeExponentP, primeExponentQ, crtCoefficient);

                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                PrivateKey key = keyFactory.generatePrivate(keySpec);
                pemKey = DatatypeConverter.printBase64Binary(key.getEncoded());

            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                logger.error("Error in Tourism Encryption Service : " + e.getMessage());
                throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
            }

        } else if (keyType == PUBLIC_KEY) {

            BigInteger modulus = null, exponent = null;
            for (int i = 0; i < children.getLength(); i++) {

                Node node = children.item(i);
                String textValue = node.getTextContent();
                if (node.getNodeName().equals("Modulus")) {
                    modulus = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                } else if (node.getNodeName().equals("Exponent")) {
                    exponent = new BigInteger(DatatypeConverter.parseBase64Binary(textValue));
                }
            }

            try {

                RSAPublicKeySpec keySpec = new RSAPublicKeySpec(modulus, exponent);
                KeyFactory keyFactory = KeyFactory.getInstance("RSA");
                PublicKey key = keyFactory.generatePublic(keySpec);
                pemKey = DatatypeConverter.printBase64Binary(key.getEncoded());

            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                logger.error("Error in Tourism Encryption Service : " + e.getMessage());
                throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                        new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
            }
        } else if (keyType == 0) {

        }

        return pemKey;
    }

    private Document loadXmlFile(String xmlFileString) {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlFileString));
            document = builder.parse(is);

        } catch (ParserConfigurationException | IOException | SAXException e) {
            logger.error("Error in Tourism Encryption Service : " + e.getMessage());
            throw new CustomWebClientException(HttpStatus.INTERNAL_SERVER_ERROR,
                    new ApiErrorResponse(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR, "INTERNAL SERVER ERROR : " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.value()));
        }
        return document;
    }
}
