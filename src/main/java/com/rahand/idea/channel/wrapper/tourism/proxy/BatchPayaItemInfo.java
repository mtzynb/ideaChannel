/**
 * BatchPayaItemInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class BatchPayaItemInfo  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private String beneficiaryFullName;

    private String description;

    private String destShebaNumber;

    private String billNumber;

    private String inquiryName;

    public BatchPayaItemInfo() {
    }

    public BatchPayaItemInfo(
           java.math.BigDecimal amount,
           String beneficiaryFullName,
           String description,
           String destShebaNumber,
           String billNumber,
           String inquiryName) {
           this.amount = amount;
           this.beneficiaryFullName = beneficiaryFullName;
           this.description = description;
           this.destShebaNumber = destShebaNumber;
           this.billNumber = billNumber;
           this.inquiryName = inquiryName;
    }


    /**
     * Gets the amount value for this BatchPayaItemInfo.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BatchPayaItemInfo.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the beneficiaryFullName value for this BatchPayaItemInfo.
     * 
     * @return beneficiaryFullName
     */
    public String getBeneficiaryFullName() {
        return beneficiaryFullName;
    }


    /**
     * Sets the beneficiaryFullName value for this BatchPayaItemInfo.
     * 
     * @param beneficiaryFullName
     */
    public void setBeneficiaryFullName(String beneficiaryFullName) {
        this.beneficiaryFullName = beneficiaryFullName;
    }


    /**
     * Gets the description value for this BatchPayaItemInfo.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BatchPayaItemInfo.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the destShebaNumber value for this BatchPayaItemInfo.
     * 
     * @return destShebaNumber
     */
    public String getDestShebaNumber() {
        return destShebaNumber;
    }


    /**
     * Sets the destShebaNumber value for this BatchPayaItemInfo.
     * 
     * @param destShebaNumber
     */
    public void setDestShebaNumber(String destShebaNumber) {
        this.destShebaNumber = destShebaNumber;
    }


    /**
     * Gets the billNumber value for this BatchPayaItemInfo.
     * 
     * @return billNumber
     */
    public String getBillNumber() {
        return billNumber;
    }


    /**
     * Sets the billNumber value for this BatchPayaItemInfo.
     * 
     * @param billNumber
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }


    /**
     * Gets the inquiryName value for this BatchPayaItemInfo.
     * 
     * @return inquiryName
     */
    public String getInquiryName() {
        return inquiryName;
    }


    /**
     * Sets the inquiryName value for this BatchPayaItemInfo.
     * 
     * @param inquiryName
     */
    public void setInquiryName(String inquiryName) {
        this.inquiryName = inquiryName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchPayaItemInfo)) return false;
        BatchPayaItemInfo other = (BatchPayaItemInfo) obj;
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
            ((this.beneficiaryFullName==null && other.getBeneficiaryFullName()==null) || 
             (this.beneficiaryFullName!=null &&
              this.beneficiaryFullName.equals(other.getBeneficiaryFullName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.destShebaNumber==null && other.getDestShebaNumber()==null) || 
             (this.destShebaNumber!=null &&
              this.destShebaNumber.equals(other.getDestShebaNumber()))) &&
            ((this.billNumber==null && other.getBillNumber()==null) || 
             (this.billNumber!=null &&
              this.billNumber.equals(other.getBillNumber()))) &&
            ((this.inquiryName==null && other.getInquiryName()==null) || 
             (this.inquiryName!=null &&
              this.inquiryName.equals(other.getInquiryName())));
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
        if (getBeneficiaryFullName() != null) {
            _hashCode += getBeneficiaryFullName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDestShebaNumber() != null) {
            _hashCode += getDestShebaNumber().hashCode();
        }
        if (getBillNumber() != null) {
            _hashCode += getBillNumber().hashCode();
        }
        if (getInquiryName() != null) {
            _hashCode += getInquiryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchPayaItemInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchPayaItemInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beneficiaryFullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BeneficiaryFullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destShebaNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestShebaNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BillNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "InquiryName"));
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
