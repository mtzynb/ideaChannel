/**
 * GetOrganizationBonCardsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetOrganizationBonCardsResponse  implements java.io.Serializable {
    private String getOrganizationBonCardsResult;

    public GetOrganizationBonCardsResponse() {
    }

    public GetOrganizationBonCardsResponse(
           String getOrganizationBonCardsResult) {
           this.getOrganizationBonCardsResult = getOrganizationBonCardsResult;
    }


    /**
     * Gets the getOrganizationBonCardsResult value for this GetOrganizationBonCardsResponse.
     * 
     * @return getOrganizationBonCardsResult
     */
    public String getGetOrganizationBonCardsResult() {
        return getOrganizationBonCardsResult;
    }


    /**
     * Sets the getOrganizationBonCardsResult value for this GetOrganizationBonCardsResponse.
     * 
     * @param getOrganizationBonCardsResult
     */
    public void setGetOrganizationBonCardsResult(String getOrganizationBonCardsResult) {
        this.getOrganizationBonCardsResult = getOrganizationBonCardsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetOrganizationBonCardsResponse)) return false;
        GetOrganizationBonCardsResponse other = (GetOrganizationBonCardsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOrganizationBonCardsResult==null && other.getGetOrganizationBonCardsResult()==null) || 
             (this.getOrganizationBonCardsResult!=null &&
              this.getOrganizationBonCardsResult.equals(other.getGetOrganizationBonCardsResult())));
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
        if (getGetOrganizationBonCardsResult() != null) {
            _hashCode += getGetOrganizationBonCardsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetOrganizationBonCardsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetOrganizationBonCardsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOrganizationBonCardsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetOrganizationBonCardsResult"));
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
