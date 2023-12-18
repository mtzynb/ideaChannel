/**
 * EChargeInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class EChargeInfo  implements java.io.Serializable {
    private String chargeCode;

    private long referenceNumber;

    private int sequenceNumber;

    private String cardSerial;

    private java.math.BigDecimal realAmount;

    private java.util.Calendar purchaseDateTime;

    public EChargeInfo() {
    }

    public EChargeInfo(
           String chargeCode,
           long referenceNumber,
           int sequenceNumber,
           String cardSerial,
           java.math.BigDecimal realAmount,
           java.util.Calendar purchaseDateTime) {
           this.chargeCode = chargeCode;
           this.referenceNumber = referenceNumber;
           this.sequenceNumber = sequenceNumber;
           this.cardSerial = cardSerial;
           this.realAmount = realAmount;
           this.purchaseDateTime = purchaseDateTime;
    }


    /**
     * Gets the chargeCode value for this EChargeInfo.
     * 
     * @return chargeCode
     */
    public String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this EChargeInfo.
     * 
     * @param chargeCode
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the referenceNumber value for this EChargeInfo.
     * 
     * @return referenceNumber
     */
    public long getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this EChargeInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(long referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the sequenceNumber value for this EChargeInfo.
     * 
     * @return sequenceNumber
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }


    /**
     * Sets the sequenceNumber value for this EChargeInfo.
     * 
     * @param sequenceNumber
     */
    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }


    /**
     * Gets the cardSerial value for this EChargeInfo.
     * 
     * @return cardSerial
     */
    public String getCardSerial() {
        return cardSerial;
    }


    /**
     * Sets the cardSerial value for this EChargeInfo.
     * 
     * @param cardSerial
     */
    public void setCardSerial(String cardSerial) {
        this.cardSerial = cardSerial;
    }


    /**
     * Gets the realAmount value for this EChargeInfo.
     * 
     * @return realAmount
     */
    public java.math.BigDecimal getRealAmount() {
        return realAmount;
    }


    /**
     * Sets the realAmount value for this EChargeInfo.
     * 
     * @param realAmount
     */
    public void setRealAmount(java.math.BigDecimal realAmount) {
        this.realAmount = realAmount;
    }


    /**
     * Gets the purchaseDateTime value for this EChargeInfo.
     * 
     * @return purchaseDateTime
     */
    public java.util.Calendar getPurchaseDateTime() {
        return purchaseDateTime;
    }


    /**
     * Sets the purchaseDateTime value for this EChargeInfo.
     * 
     * @param purchaseDateTime
     */
    public void setPurchaseDateTime(java.util.Calendar purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EChargeInfo)) return false;
        EChargeInfo other = (EChargeInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            this.referenceNumber == other.getReferenceNumber() &&
            this.sequenceNumber == other.getSequenceNumber() &&
            ((this.cardSerial==null && other.getCardSerial()==null) || 
             (this.cardSerial!=null &&
              this.cardSerial.equals(other.getCardSerial()))) &&
            ((this.realAmount==null && other.getRealAmount()==null) || 
             (this.realAmount!=null &&
              this.realAmount.equals(other.getRealAmount()))) &&
            ((this.purchaseDateTime==null && other.getPurchaseDateTime()==null) || 
             (this.purchaseDateTime!=null &&
              this.purchaseDateTime.equals(other.getPurchaseDateTime())));
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
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        _hashCode += new Long(getReferenceNumber()).hashCode();
        _hashCode += getSequenceNumber();
        if (getCardSerial() != null) {
            _hashCode += getCardSerial().hashCode();
        }
        if (getRealAmount() != null) {
            _hashCode += getRealAmount().hashCode();
        }
        if (getPurchaseDateTime() != null) {
            _hashCode += getPurchaseDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EChargeInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "EChargeInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardSerial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardSerial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "RealAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "PurchaseDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
