/**
 * GetBonCardOrganizationAccountsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetBonCardOrganizationAccountsResponse  implements java.io.Serializable {
    private String getBonCardOrganizationAccountsResult;

    public GetBonCardOrganizationAccountsResponse() {
    }

    public GetBonCardOrganizationAccountsResponse(
           String getBonCardOrganizationAccountsResult) {
           this.getBonCardOrganizationAccountsResult = getBonCardOrganizationAccountsResult;
    }


    /**
     * Gets the getBonCardOrganizationAccountsResult value for this GetBonCardOrganizationAccountsResponse.
     * 
     * @return getBonCardOrganizationAccountsResult
     */
    public String getGetBonCardOrganizationAccountsResult() {
        return getBonCardOrganizationAccountsResult;
    }


    /**
     * Sets the getBonCardOrganizationAccountsResult value for this GetBonCardOrganizationAccountsResponse.
     * 
     * @param getBonCardOrganizationAccountsResult
     */
    public void setGetBonCardOrganizationAccountsResult(String getBonCardOrganizationAccountsResult) {
        this.getBonCardOrganizationAccountsResult = getBonCardOrganizationAccountsResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBonCardOrganizationAccountsResponse)) return false;
        GetBonCardOrganizationAccountsResponse other = (GetBonCardOrganizationAccountsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBonCardOrganizationAccountsResult==null && other.getGetBonCardOrganizationAccountsResult()==null) || 
             (this.getBonCardOrganizationAccountsResult!=null &&
              this.getBonCardOrganizationAccountsResult.equals(other.getGetBonCardOrganizationAccountsResult())));
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
        if (getGetBonCardOrganizationAccountsResult() != null) {
            _hashCode += getGetBonCardOrganizationAccountsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBonCardOrganizationAccountsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetBonCardOrganizationAccountsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBonCardOrganizationAccountsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetBonCardOrganizationAccountsResult"));
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
