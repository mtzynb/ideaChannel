/**
 * BatchTransferPayaInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class BatchTransferPayaInput  extends BaseInput implements java.io.Serializable {
    private String sourceDepositNumber;

    private String userName;

    private String fileUniqueIdentifier;

    private String transferMoneyBillNumber;

    private BatchPayaItemInfo[] batchPayaItemInfos;

    private Short centralBankTransferDetailType;

    public BatchTransferPayaInput() {
    }

    public BatchTransferPayaInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String sourceDepositNumber,
           String userName,
           String fileUniqueIdentifier,
           String transferMoneyBillNumber,
           BatchPayaItemInfo[] batchPayaItemInfos,
           Short centralBankTransferDetailType) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.sourceDepositNumber = sourceDepositNumber;
        this.userName = userName;
        this.fileUniqueIdentifier = fileUniqueIdentifier;
        this.transferMoneyBillNumber = transferMoneyBillNumber;
        this.batchPayaItemInfos = batchPayaItemInfos;
        this.centralBankTransferDetailType = centralBankTransferDetailType;
    }


    /**
     * Gets the sourceDepositNumber value for this BatchTransferPayaInput.
     * 
     * @return sourceDepositNumber
     */
    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this BatchTransferPayaInput.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the userName value for this BatchTransferPayaInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this BatchTransferPayaInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the fileUniqueIdentifier value for this BatchTransferPayaInput.
     * 
     * @return fileUniqueIdentifier
     */
    public String getFileUniqueIdentifier() {
        return fileUniqueIdentifier;
    }


    /**
     * Sets the fileUniqueIdentifier value for this BatchTransferPayaInput.
     * 
     * @param fileUniqueIdentifier
     */
    public void setFileUniqueIdentifier(String fileUniqueIdentifier) {
        this.fileUniqueIdentifier = fileUniqueIdentifier;
    }


    /**
     * Gets the transferMoneyBillNumber value for this BatchTransferPayaInput.
     * 
     * @return transferMoneyBillNumber
     */
    public String getTransferMoneyBillNumber() {
        return transferMoneyBillNumber;
    }


    /**
     * Sets the transferMoneyBillNumber value for this BatchTransferPayaInput.
     * 
     * @param transferMoneyBillNumber
     */
    public void setTransferMoneyBillNumber(String transferMoneyBillNumber) {
        this.transferMoneyBillNumber = transferMoneyBillNumber;
    }


    /**
     * Gets the batchPayaItemInfos value for this BatchTransferPayaInput.
     * 
     * @return batchPayaItemInfos
     */
    public BatchPayaItemInfo[] getBatchPayaItemInfos() {
        return batchPayaItemInfos;
    }


    /**
     * Sets the batchPayaItemInfos value for this BatchTransferPayaInput.
     * 
     * @param batchPayaItemInfos
     */
    public void setBatchPayaItemInfos(BatchPayaItemInfo[] batchPayaItemInfos) {
        this.batchPayaItemInfos = batchPayaItemInfos;
    }


    /**
     * Gets the centralBankTransferDetailType value for this BatchTransferPayaInput.
     * 
     * @return centralBankTransferDetailType
     */
    public Short getCentralBankTransferDetailType() {
        return centralBankTransferDetailType;
    }


    /**
     * Sets the centralBankTransferDetailType value for this BatchTransferPayaInput.
     * 
     * @param centralBankTransferDetailType
     */
    public void setCentralBankTransferDetailType(Short centralBankTransferDetailType) {
        this.centralBankTransferDetailType = centralBankTransferDetailType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchTransferPayaInput)) return false;
        BatchTransferPayaInput other = (BatchTransferPayaInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.fileUniqueIdentifier==null && other.getFileUniqueIdentifier()==null) || 
             (this.fileUniqueIdentifier!=null &&
              this.fileUniqueIdentifier.equals(other.getFileUniqueIdentifier()))) &&
            ((this.transferMoneyBillNumber==null && other.getTransferMoneyBillNumber()==null) || 
             (this.transferMoneyBillNumber!=null &&
              this.transferMoneyBillNumber.equals(other.getTransferMoneyBillNumber()))) &&
            ((this.batchPayaItemInfos==null && other.getBatchPayaItemInfos()==null) || 
             (this.batchPayaItemInfos!=null &&
              java.util.Arrays.equals(this.batchPayaItemInfos, other.getBatchPayaItemInfos()))) &&
            ((this.centralBankTransferDetailType==null && other.getCentralBankTransferDetailType()==null) || 
             (this.centralBankTransferDetailType!=null &&
              this.centralBankTransferDetailType.equals(other.getCentralBankTransferDetailType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFileUniqueIdentifier() != null) {
            _hashCode += getFileUniqueIdentifier().hashCode();
        }
        if (getTransferMoneyBillNumber() != null) {
            _hashCode += getTransferMoneyBillNumber().hashCode();
        }
        if (getBatchPayaItemInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchPayaItemInfos());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBatchPayaItemInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCentralBankTransferDetailType() != null) {
            _hashCode += getCentralBankTransferDetailType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchTransferPayaInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferPayaInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileUniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "FileUniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferMoneyBillNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "TransferMoneyBillNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchPayaItemInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchPayaItemInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchPayaItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchPayaItemInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralBankTransferDetailType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CentralBankTransferDetailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
