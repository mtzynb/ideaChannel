/**
 * MatchNationalIdWithMobileResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class MatchNationalIdWithMobileResponse  implements java.io.Serializable {
    private String matchNationalIdWithMobileResult;

    public MatchNationalIdWithMobileResponse() {
    }

    public MatchNationalIdWithMobileResponse(
           String matchNationalIdWithMobileResult) {
           this.matchNationalIdWithMobileResult = matchNationalIdWithMobileResult;
    }


    /**
     * Gets the matchNationalIdWithMobileResult value for this MatchNationalIdWithMobileResponse.
     * 
     * @return matchNationalIdWithMobileResult
     */
    public String getMatchNationalIdWithMobileResult() {
        return matchNationalIdWithMobileResult;
    }


    /**
     * Sets the matchNationalIdWithMobileResult value for this MatchNationalIdWithMobileResponse.
     * 
     * @param matchNationalIdWithMobileResult
     */
    public void setMatchNationalIdWithMobileResult(String matchNationalIdWithMobileResult) {
        this.matchNationalIdWithMobileResult = matchNationalIdWithMobileResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MatchNationalIdWithMobileResponse)) return false;
        MatchNationalIdWithMobileResponse other = (MatchNationalIdWithMobileResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.matchNationalIdWithMobileResult==null && other.getMatchNationalIdWithMobileResult()==null) || 
             (this.matchNationalIdWithMobileResult!=null &&
              this.matchNationalIdWithMobileResult.equals(other.getMatchNationalIdWithMobileResult())));
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
        if (getMatchNationalIdWithMobileResult() != null) {
            _hashCode += getMatchNationalIdWithMobileResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatchNationalIdWithMobileResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">MatchNationalIdWithMobileResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchNationalIdWithMobileResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "MatchNationalIdWithMobileResult"));
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
