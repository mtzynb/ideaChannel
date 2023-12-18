/**
 * OrganizationBonCardStateInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class OrganizationBonCardStateInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String cardPAN;

    private long organizationCode;

    public OrganizationBonCardStateInput() {
    }

    public OrganizationBonCardStateInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String cardPAN,
           long organizationCode) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.cardPAN = cardPAN;
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the username value for this OrganizationBonCardStateInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this OrganizationBonCardStateInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the cardPAN value for this OrganizationBonCardStateInput.
     * 
     * @return cardPAN
     */
    public String getCardPAN() {
        return cardPAN;
    }


    /**
     * Sets the cardPAN value for this OrganizationBonCardStateInput.
     * 
     * @param cardPAN
     */
    public void setCardPAN(String cardPAN) {
        this.cardPAN = cardPAN;
    }


    /**
     * Gets the organizationCode value for this OrganizationBonCardStateInput.
     * 
     * @return organizationCode
     */
    public long getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this OrganizationBonCardStateInput.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(long organizationCode) {
        this.organizationCode = organizationCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrganizationBonCardStateInput)) return false;
        OrganizationBonCardStateInput other = (OrganizationBonCardStateInput) obj;
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
            ((this.cardPAN==null && other.getCardPAN()==null) || 
             (this.cardPAN!=null &&
              this.cardPAN.equals(other.getCardPAN()))) &&
            this.organizationCode == other.getOrganizationCode();
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
        if (getCardPAN() != null) {
            _hashCode += getCardPAN().hashCode();
        }
        _hashCode += new Long(getOrganizationCode()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationBonCardStateInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationBonCardStateInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardPAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
