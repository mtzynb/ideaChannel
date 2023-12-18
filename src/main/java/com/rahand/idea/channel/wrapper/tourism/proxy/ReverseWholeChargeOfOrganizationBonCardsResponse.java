/**
 * ReverseWholeChargeOfOrganizationBonCardsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class ReverseWholeChargeOfOrganizationBonCardsResponse  implements java.io.Serializable {
    private String reverseWholeChargeOfOrganizationBonCardsResult;

    public ReverseWholeChargeOfOrganizationBonCardsResponse() {
    }

    public ReverseWholeChargeOfOrganizationBonCardsResponse(
           String reverseWholeChargeOfOrganizationBonCardsResult) {
           this.reverseWholeChargeOfOrganizationBonCardsResult = reverseWholeChargeOfOrganizationBonCardsResult;
    }


    /**
     * Gets the reverseWholeChargeOfOrganizationBonCardsResult value for this ReverseWholeChargeOfOrganizationBonCardsResponse.
     * 
     * @return reverseWholeChargeOfOrganizationBonCardsResult
     */
    public String getReverseWholeChargeOfOrganizationBonCardsResult() {
        return reverseWholeChargeOfOrganizationBonCardsResult;
    }


    /**
     * Sets the reverseWholeChargeOfOrganizationBonCardsResult value for this ReverseWholeChargeOfOrganizationBonCardsResponse.
     * 
     * @param reverseWholeChargeOfOrganizationBonCardsResult
     */
    public void setReverseWholeChargeOfOrganizationBonCardsResult(String reverseWholeChargeOfOrganizationBonCardsResult) {
        this.reverseWholeChargeOfOrganizationBonCardsResult = reverseWholeChargeOfOrganizationBonCardsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReverseWholeChargeOfOrganizationBonCardsResponse)) return false;
        ReverseWholeChargeOfOrganizationBonCardsResponse other = (ReverseWholeChargeOfOrganizationBonCardsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverseWholeChargeOfOrganizationBonCardsResult==null && other.getReverseWholeChargeOfOrganizationBonCardsResult()==null) || 
             (this.reverseWholeChargeOfOrganizationBonCardsResult!=null &&
              this.reverseWholeChargeOfOrganizationBonCardsResult.equals(other.getReverseWholeChargeOfOrganizationBonCardsResult())));
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
        if (getReverseWholeChargeOfOrganizationBonCardsResult() != null) {
            _hashCode += getReverseWholeChargeOfOrganizationBonCardsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseWholeChargeOfOrganizationBonCardsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">ReverseWholeChargeOfOrganizationBonCardsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseWholeChargeOfOrganizationBonCardsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ReverseWholeChargeOfOrganizationBonCardsResult"));
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
