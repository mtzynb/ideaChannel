/**
 * InquiryBillPaymentResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class InquiryBillPaymentResponse  implements java.io.Serializable {
    private String inquiryBillPaymentResult;

    public InquiryBillPaymentResponse() {
    }

    public InquiryBillPaymentResponse(
           String inquiryBillPaymentResult) {
           this.inquiryBillPaymentResult = inquiryBillPaymentResult;
    }


    /**
     * Gets the inquiryBillPaymentResult value for this InquiryBillPaymentResponse.
     * 
     * @return inquiryBillPaymentResult
     */
    public String getInquiryBillPaymentResult() {
        return inquiryBillPaymentResult;
    }


    /**
     * Sets the inquiryBillPaymentResult value for this InquiryBillPaymentResponse.
     * 
     * @param inquiryBillPaymentResult
     */
    public void setInquiryBillPaymentResult(String inquiryBillPaymentResult) {
        this.inquiryBillPaymentResult = inquiryBillPaymentResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InquiryBillPaymentResponse)) return false;
        InquiryBillPaymentResponse other = (InquiryBillPaymentResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inquiryBillPaymentResult==null && other.getInquiryBillPaymentResult()==null) || 
             (this.inquiryBillPaymentResult!=null &&
              this.inquiryBillPaymentResult.equals(other.getInquiryBillPaymentResult())));
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
        if (getInquiryBillPaymentResult() != null) {
            _hashCode += getInquiryBillPaymentResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquiryBillPaymentResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">InquiryBillPaymentResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryBillPaymentResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "InquiryBillPaymentResult"));
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
