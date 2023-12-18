/**
 * OrganizationBonCardsInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class OrganizationBonCardsInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String issueDateTo;

    private String issueDateFrom;

    private int cardState;

    private int firstResult;

    private int maxResult;

    private long organizationCode;

    private String cardNumber;

    public OrganizationBonCardsInput() {
    }

    public OrganizationBonCardsInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String issueDateTo,
           String issueDateFrom,
           int cardState,
           int firstResult,
           int maxResult,
           long organizationCode,
           String cardNumber) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.issueDateTo = issueDateTo;
        this.issueDateFrom = issueDateFrom;
        this.cardState = cardState;
        this.firstResult = firstResult;
        this.maxResult = maxResult;
        this.organizationCode = organizationCode;
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the username value for this OrganizationBonCardsInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this OrganizationBonCardsInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the issueDateTo value for this OrganizationBonCardsInput.
     * 
     * @return issueDateTo
     */
    public String getIssueDateTo() {
        return issueDateTo;
    }


    /**
     * Sets the issueDateTo value for this OrganizationBonCardsInput.
     * 
     * @param issueDateTo
     */
    public void setIssueDateTo(String issueDateTo) {
        this.issueDateTo = issueDateTo;
    }


    /**
     * Gets the issueDateFrom value for this OrganizationBonCardsInput.
     * 
     * @return issueDateFrom
     */
    public String getIssueDateFrom() {
        return issueDateFrom;
    }


    /**
     * Sets the issueDateFrom value for this OrganizationBonCardsInput.
     * 
     * @param issueDateFrom
     */
    public void setIssueDateFrom(String issueDateFrom) {
        this.issueDateFrom = issueDateFrom;
    }


    /**
     * Gets the cardState value for this OrganizationBonCardsInput.
     * 
     * @return cardState
     */
    public int getCardState() {
        return cardState;
    }


    /**
     * Sets the cardState value for this OrganizationBonCardsInput.
     * 
     * @param cardState
     */
    public void setCardState(int cardState) {
        this.cardState = cardState;
    }


    /**
     * Gets the firstResult value for this OrganizationBonCardsInput.
     * 
     * @return firstResult
     */
    public int getFirstResult() {
        return firstResult;
    }


    /**
     * Sets the firstResult value for this OrganizationBonCardsInput.
     * 
     * @param firstResult
     */
    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }


    /**
     * Gets the maxResult value for this OrganizationBonCardsInput.
     * 
     * @return maxResult
     */
    public int getMaxResult() {
        return maxResult;
    }


    /**
     * Sets the maxResult value for this OrganizationBonCardsInput.
     * 
     * @param maxResult
     */
    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }


    /**
     * Gets the organizationCode value for this OrganizationBonCardsInput.
     * 
     * @return organizationCode
     */
    public long getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this OrganizationBonCardsInput.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(long organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the cardNumber value for this OrganizationBonCardsInput.
     * 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this OrganizationBonCardsInput.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrganizationBonCardsInput)) return false;
        OrganizationBonCardsInput other = (OrganizationBonCardsInput) obj;
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
            ((this.issueDateTo==null && other.getIssueDateTo()==null) || 
             (this.issueDateTo!=null &&
              this.issueDateTo.equals(other.getIssueDateTo()))) &&
            ((this.issueDateFrom==null && other.getIssueDateFrom()==null) || 
             (this.issueDateFrom!=null &&
              this.issueDateFrom.equals(other.getIssueDateFrom()))) &&
            this.cardState == other.getCardState() &&
            this.firstResult == other.getFirstResult() &&
            this.maxResult == other.getMaxResult() &&
            this.organizationCode == other.getOrganizationCode() &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber())));
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
        if (getIssueDateTo() != null) {
            _hashCode += getIssueDateTo().hashCode();
        }
        if (getIssueDateFrom() != null) {
            _hashCode += getIssueDateFrom().hashCode();
        }
        _hashCode += getCardState();
        _hashCode += getFirstResult();
        _hashCode += getMaxResult();
        _hashCode += new Long(getOrganizationCode()).hashCode();
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationBonCardsInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationBonCardsInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "IssueDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "IssueDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "FirstResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "MaxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardNumber"));
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
