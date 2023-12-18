/**
 * BillNumberGeneratorDocInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class BillNumberGeneratorDocInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String depositNumber;

    private java.math.BigDecimal amount;

    private boolean isDebtor;

    private KeyValue[] billNumberGeneratorKeyValues;

    public BillNumberGeneratorDocInput() {
    }

    public BillNumberGeneratorDocInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String depositNumber,
           java.math.BigDecimal amount,
           boolean isDebtor,
           KeyValue[] billNumberGeneratorKeyValues) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.depositNumber = depositNumber;
        this.amount = amount;
        this.isDebtor = isDebtor;
        this.billNumberGeneratorKeyValues = billNumberGeneratorKeyValues;
    }


    /**
     * Gets the userName value for this BillNumberGeneratorDocInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this BillNumberGeneratorDocInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the depositNumber value for this BillNumberGeneratorDocInput.
     * 
     * @return depositNumber
     */
    public String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this BillNumberGeneratorDocInput.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the amount value for this BillNumberGeneratorDocInput.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillNumberGeneratorDocInput.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the isDebtor value for this BillNumberGeneratorDocInput.
     * 
     * @return isDebtor
     */
    public boolean isIsDebtor() {
        return isDebtor;
    }


    /**
     * Sets the isDebtor value for this BillNumberGeneratorDocInput.
     * 
     * @param isDebtor
     */
    public void setIsDebtor(boolean isDebtor) {
        this.isDebtor = isDebtor;
    }


    /**
     * Gets the billNumberGeneratorKeyValues value for this BillNumberGeneratorDocInput.
     * 
     * @return billNumberGeneratorKeyValues
     */
    public KeyValue[] getBillNumberGeneratorKeyValues() {
        return billNumberGeneratorKeyValues;
    }


    /**
     * Sets the billNumberGeneratorKeyValues value for this BillNumberGeneratorDocInput.
     * 
     * @param billNumberGeneratorKeyValues
     */
    public void setBillNumberGeneratorKeyValues(KeyValue[] billNumberGeneratorKeyValues) {
        this.billNumberGeneratorKeyValues = billNumberGeneratorKeyValues;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillNumberGeneratorDocInput)) return false;
        BillNumberGeneratorDocInput other = (BillNumberGeneratorDocInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            this.isDebtor == other.isIsDebtor() &&
            ((this.billNumberGeneratorKeyValues==null && other.getBillNumberGeneratorKeyValues()==null) || 
             (this.billNumberGeneratorKeyValues!=null &&
              java.util.Arrays.equals(this.billNumberGeneratorKeyValues, other.getBillNumberGeneratorKeyValues())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        _hashCode += (isIsDebtor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBillNumberGeneratorKeyValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillNumberGeneratorKeyValues());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBillNumberGeneratorKeyValues(), i);
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
        new org.apache.axis.description.TypeDesc(BillNumberGeneratorDocInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BillNumberGeneratorDocInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDebtor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "IsDebtor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNumberGeneratorKeyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BillNumberGeneratorKeyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "KeyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "KeyValue"));
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
