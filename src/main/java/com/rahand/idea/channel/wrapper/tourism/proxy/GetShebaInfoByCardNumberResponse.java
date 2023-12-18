/**
 * GetShebaInfoByCardNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetShebaInfoByCardNumberResponse  implements java.io.Serializable {
    private String getShebaInfoByCardNumberResult;

    public GetShebaInfoByCardNumberResponse() {
    }

    public GetShebaInfoByCardNumberResponse(
           String getShebaInfoByCardNumberResult) {
           this.getShebaInfoByCardNumberResult = getShebaInfoByCardNumberResult;
    }


    /**
     * Gets the getShebaInfoByCardNumberResult value for this GetShebaInfoByCardNumberResponse.
     * 
     * @return getShebaInfoByCardNumberResult
     */
    public String getGetShebaInfoByCardNumberResult() {
        return getShebaInfoByCardNumberResult;
    }


    /**
     * Sets the getShebaInfoByCardNumberResult value for this GetShebaInfoByCardNumberResponse.
     * 
     * @param getShebaInfoByCardNumberResult
     */
    public void setGetShebaInfoByCardNumberResult(String getShebaInfoByCardNumberResult) {
        this.getShebaInfoByCardNumberResult = getShebaInfoByCardNumberResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetShebaInfoByCardNumberResponse)) return false;
        GetShebaInfoByCardNumberResponse other = (GetShebaInfoByCardNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getShebaInfoByCardNumberResult==null && other.getGetShebaInfoByCardNumberResult()==null) || 
             (this.getShebaInfoByCardNumberResult!=null &&
              this.getShebaInfoByCardNumberResult.equals(other.getGetShebaInfoByCardNumberResult())));
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
        if (getGetShebaInfoByCardNumberResult() != null) {
            _hashCode += getGetShebaInfoByCardNumberResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetShebaInfoByCardNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetShebaInfoByCardNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getShebaInfoByCardNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetShebaInfoByCardNumberResult"));
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
