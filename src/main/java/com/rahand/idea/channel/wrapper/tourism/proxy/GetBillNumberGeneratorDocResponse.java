/**
 * GetBillNumberGeneratorDocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetBillNumberGeneratorDocResponse  implements java.io.Serializable {
    private String getBillNumberGeneratorDocResult;

    public GetBillNumberGeneratorDocResponse() {
    }

    public GetBillNumberGeneratorDocResponse(
           String getBillNumberGeneratorDocResult) {
           this.getBillNumberGeneratorDocResult = getBillNumberGeneratorDocResult;
    }


    /**
     * Gets the getBillNumberGeneratorDocResult value for this GetBillNumberGeneratorDocResponse.
     * 
     * @return getBillNumberGeneratorDocResult
     */
    public String getGetBillNumberGeneratorDocResult() {
        return getBillNumberGeneratorDocResult;
    }


    /**
     * Sets the getBillNumberGeneratorDocResult value for this GetBillNumberGeneratorDocResponse.
     * 
     * @param getBillNumberGeneratorDocResult
     */
    public void setGetBillNumberGeneratorDocResult(String getBillNumberGeneratorDocResult) {
        this.getBillNumberGeneratorDocResult = getBillNumberGeneratorDocResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBillNumberGeneratorDocResponse)) return false;
        GetBillNumberGeneratorDocResponse other = (GetBillNumberGeneratorDocResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBillNumberGeneratorDocResult==null && other.getGetBillNumberGeneratorDocResult()==null) || 
             (this.getBillNumberGeneratorDocResult!=null &&
              this.getBillNumberGeneratorDocResult.equals(other.getGetBillNumberGeneratorDocResult())));
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
        if (getGetBillNumberGeneratorDocResult() != null) {
            _hashCode += getGetBillNumberGeneratorDocResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillNumberGeneratorDocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetBillNumberGeneratorDocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBillNumberGeneratorDocResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetBillNumberGeneratorDocResult"));
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
