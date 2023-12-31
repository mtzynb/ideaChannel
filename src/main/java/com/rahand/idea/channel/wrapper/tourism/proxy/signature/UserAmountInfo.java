/**
 * UserAmountInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy.signature;

public class UserAmountInfo  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private String currencySwiftCode;

    private int currencyISOCode;

    private String currencyName;

    public UserAmountInfo() {
    }

    public UserAmountInfo(
           java.math.BigDecimal amount,
           String currencySwiftCode,
           int currencyISOCode,
           String currencyName) {
           this.amount = amount;
           this.currencySwiftCode = currencySwiftCode;
           this.currencyISOCode = currencyISOCode;
           this.currencyName = currencyName;
    }


    /**
     * Gets the amount value for this UserAmountInfo.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UserAmountInfo.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencySwiftCode value for this UserAmountInfo.
     * 
     * @return currencySwiftCode
     */
    public String getCurrencySwiftCode() {
        return currencySwiftCode;
    }


    /**
     * Sets the currencySwiftCode value for this UserAmountInfo.
     * 
     * @param currencySwiftCode
     */
    public void setCurrencySwiftCode(String currencySwiftCode) {
        this.currencySwiftCode = currencySwiftCode;
    }


    /**
     * Gets the currencyISOCode value for this UserAmountInfo.
     * 
     * @return currencyISOCode
     */
    public int getCurrencyISOCode() {
        return currencyISOCode;
    }


    /**
     * Sets the currencyISOCode value for this UserAmountInfo.
     * 
     * @param currencyISOCode
     */
    public void setCurrencyISOCode(int currencyISOCode) {
        this.currencyISOCode = currencyISOCode;
    }


    /**
     * Gets the currencyName value for this UserAmountInfo.
     * 
     * @return currencyName
     */
    public String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this UserAmountInfo.
     * 
     * @param currencyName
     */
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserAmountInfo)) return false;
        UserAmountInfo other = (UserAmountInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencySwiftCode==null && other.getCurrencySwiftCode()==null) || 
             (this.currencySwiftCode!=null &&
              this.currencySwiftCode.equals(other.getCurrencySwiftCode()))) &&
            this.currencyISOCode == other.getCurrencyISOCode() &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencySwiftCode() != null) {
            _hashCode += getCurrencySwiftCode().hashCode();
        }
        _hashCode += getCurrencyISOCode();
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserAmountInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserAmountInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencySwiftCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "CurrencySwiftCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "CurrencyISOCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "CurrencyName"));
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
