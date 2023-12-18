/**
 * ChargeOrganizationBonCardsInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class ChargeOrganizationBonCardsInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private long accountCode;

    private String sourceDepositNumber;

    private long organizationCode;

    private String[] cardPANs;

    private String[] amounts;

    public ChargeOrganizationBonCardsInput() {
    }

    public ChargeOrganizationBonCardsInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           long accountCode,
           String sourceDepositNumber,
           long organizationCode,
           String[] cardPANs,
           String[] amounts) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.accountCode = accountCode;
        this.sourceDepositNumber = sourceDepositNumber;
        this.organizationCode = organizationCode;
        this.cardPANs = cardPANs;
        this.amounts = amounts;
    }


    /**
     * Gets the username value for this ChargeOrganizationBonCardsInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ChargeOrganizationBonCardsInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the accountCode value for this ChargeOrganizationBonCardsInput.
     * 
     * @return accountCode
     */
    public long getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this ChargeOrganizationBonCardsInput.
     * 
     * @param accountCode
     */
    public void setAccountCode(long accountCode) {
        this.accountCode = accountCode;
    }


    /**
     * Gets the sourceDepositNumber value for this ChargeOrganizationBonCardsInput.
     * 
     * @return sourceDepositNumber
     */
    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this ChargeOrganizationBonCardsInput.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the organizationCode value for this ChargeOrganizationBonCardsInput.
     * 
     * @return organizationCode
     */
    public long getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this ChargeOrganizationBonCardsInput.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(long organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the cardPANs value for this ChargeOrganizationBonCardsInput.
     * 
     * @return cardPANs
     */
    public String[] getCardPANs() {
        return cardPANs;
    }


    /**
     * Sets the cardPANs value for this ChargeOrganizationBonCardsInput.
     * 
     * @param cardPANs
     */
    public void setCardPANs(String[] cardPANs) {
        this.cardPANs = cardPANs;
    }


    /**
     * Gets the amounts value for this ChargeOrganizationBonCardsInput.
     * 
     * @return amounts
     */
    public String[] getAmounts() {
        return amounts;
    }


    /**
     * Sets the amounts value for this ChargeOrganizationBonCardsInput.
     * 
     * @param amounts
     */
    public void setAmounts(String[] amounts) {
        this.amounts = amounts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChargeOrganizationBonCardsInput)) return false;
        ChargeOrganizationBonCardsInput other = (ChargeOrganizationBonCardsInput) obj;
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
            this.accountCode == other.getAccountCode() &&
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            this.organizationCode == other.getOrganizationCode() &&
            ((this.cardPANs==null && other.getCardPANs()==null) || 
             (this.cardPANs!=null &&
              java.util.Arrays.equals(this.cardPANs, other.getCardPANs()))) &&
            ((this.amounts==null && other.getAmounts()==null) || 
             (this.amounts!=null &&
              java.util.Arrays.equals(this.amounts, other.getAmounts())));
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
        _hashCode += new Long(getAccountCode()).hashCode();
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        _hashCode += new Long(getOrganizationCode()).hashCode();
        if (getCardPANs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardPANs());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCardPANs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeOrganizationBonCardsInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChargeOrganizationBonCardsInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "AccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SourceDepositNumber"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardPANs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardPANs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "string"));
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
