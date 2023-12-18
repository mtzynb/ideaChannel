/**
 * WebServiceUserInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class WebServiceUserInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String clientCustomerNumber;

    private String clientUsername;

    private String clientPublicKey;

    public WebServiceUserInput() {
    }

    public WebServiceUserInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String clientCustomerNumber,
           String clientUsername,
           String clientPublicKey) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.clientCustomerNumber = clientCustomerNumber;
        this.clientUsername = clientUsername;
        this.clientPublicKey = clientPublicKey;
    }


    /**
     * Gets the username value for this WebServiceUserInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this WebServiceUserInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the clientCustomerNumber value for this WebServiceUserInput.
     * 
     * @return clientCustomerNumber
     */
    public String getClientCustomerNumber() {
        return clientCustomerNumber;
    }


    /**
     * Sets the clientCustomerNumber value for this WebServiceUserInput.
     * 
     * @param clientCustomerNumber
     */
    public void setClientCustomerNumber(String clientCustomerNumber) {
        this.clientCustomerNumber = clientCustomerNumber;
    }


    /**
     * Gets the clientUsername value for this WebServiceUserInput.
     * 
     * @return clientUsername
     */
    public String getClientUsername() {
        return clientUsername;
    }


    /**
     * Sets the clientUsername value for this WebServiceUserInput.
     * 
     * @param clientUsername
     */
    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }


    /**
     * Gets the clientPublicKey value for this WebServiceUserInput.
     * 
     * @return clientPublicKey
     */
    public String getClientPublicKey() {
        return clientPublicKey;
    }


    /**
     * Sets the clientPublicKey value for this WebServiceUserInput.
     * 
     * @param clientPublicKey
     */
    public void setClientPublicKey(String clientPublicKey) {
        this.clientPublicKey = clientPublicKey;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WebServiceUserInput)) return false;
        WebServiceUserInput other = (WebServiceUserInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.clientCustomerNumber==null && other.getClientCustomerNumber()==null) || 
             (this.clientCustomerNumber!=null &&
              this.clientCustomerNumber.equals(other.getClientCustomerNumber()))) &&
            ((this.clientUsername==null && other.getClientUsername()==null) || 
             (this.clientUsername!=null &&
              this.clientUsername.equals(other.getClientUsername()))) &&
            ((this.clientPublicKey==null && other.getClientPublicKey()==null) || 
             (this.clientPublicKey!=null &&
              this.clientPublicKey.equals(other.getClientPublicKey())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getClientCustomerNumber() != null) {
            _hashCode += getClientCustomerNumber().hashCode();
        }
        if (getClientUsername() != null) {
            _hashCode += getClientUsername().hashCode();
        }
        if (getClientPublicKey() != null) {
            _hashCode += getClientPublicKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebServiceUserInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "WebServiceUserInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientCustomerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ClientCustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientUsername");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ClientUsername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPublicKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ClientPublicKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
