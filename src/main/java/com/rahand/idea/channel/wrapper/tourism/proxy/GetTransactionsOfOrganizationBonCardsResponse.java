/**
 * GetTransactionsOfOrganizationBonCardsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetTransactionsOfOrganizationBonCardsResponse  implements java.io.Serializable {
    private String getTransactionsOfOrganizationBonCardsResult;

    public GetTransactionsOfOrganizationBonCardsResponse() {
    }

    public GetTransactionsOfOrganizationBonCardsResponse(
           String getTransactionsOfOrganizationBonCardsResult) {
           this.getTransactionsOfOrganizationBonCardsResult = getTransactionsOfOrganizationBonCardsResult;
    }


    /**
     * Gets the getTransactionsOfOrganizationBonCardsResult value for this GetTransactionsOfOrganizationBonCardsResponse.
     * 
     * @return getTransactionsOfOrganizationBonCardsResult
     */
    public String getGetTransactionsOfOrganizationBonCardsResult() {
        return getTransactionsOfOrganizationBonCardsResult;
    }


    /**
     * Sets the getTransactionsOfOrganizationBonCardsResult value for this GetTransactionsOfOrganizationBonCardsResponse.
     * 
     * @param getTransactionsOfOrganizationBonCardsResult
     */
    public void setGetTransactionsOfOrganizationBonCardsResult(String getTransactionsOfOrganizationBonCardsResult) {
        this.getTransactionsOfOrganizationBonCardsResult = getTransactionsOfOrganizationBonCardsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetTransactionsOfOrganizationBonCardsResponse)) return false;
        GetTransactionsOfOrganizationBonCardsResponse other = (GetTransactionsOfOrganizationBonCardsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTransactionsOfOrganizationBonCardsResult==null && other.getGetTransactionsOfOrganizationBonCardsResult()==null) || 
             (this.getTransactionsOfOrganizationBonCardsResult!=null &&
              this.getTransactionsOfOrganizationBonCardsResult.equals(other.getGetTransactionsOfOrganizationBonCardsResult())));
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
        if (getGetTransactionsOfOrganizationBonCardsResult() != null) {
            _hashCode += getGetTransactionsOfOrganizationBonCardsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionsOfOrganizationBonCardsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetTransactionsOfOrganizationBonCardsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTransactionsOfOrganizationBonCardsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetTransactionsOfOrganizationBonCardsResult"));
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
