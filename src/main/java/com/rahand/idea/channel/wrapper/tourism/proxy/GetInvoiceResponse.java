/**
 * GetInvoiceResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

import com.rahand.idea.channel.wrapper.tourism.proxy.signature.ActionResult;

public class GetInvoiceResponse  implements java.io.Serializable {
    private ActionResult getInvoiceResult;

    public GetInvoiceResponse() {
    }

    public GetInvoiceResponse(
           ActionResult getInvoiceResult) {
           this.getInvoiceResult = getInvoiceResult;
    }


    /**
     * Gets the getInvoiceResult value for this GetInvoiceResponse.
     * 
     * @return getInvoiceResult
     */
    public ActionResult getGetInvoiceResult() {
        return getInvoiceResult;
    }


    /**
     * Sets the getInvoiceResult value for this GetInvoiceResponse.
     * 
     * @param getInvoiceResult
     */
    public void setGetInvoiceResult(ActionResult getInvoiceResult) {
        this.getInvoiceResult = getInvoiceResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetInvoiceResponse)) return false;
        GetInvoiceResponse other = (GetInvoiceResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getInvoiceResult==null && other.getGetInvoiceResult()==null) || 
             (this.getInvoiceResult!=null &&
              this.getInvoiceResult.equals(other.getGetInvoiceResult())));
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
        if (getGetInvoiceResult() != null) {
            _hashCode += getGetInvoiceResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInvoiceResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetInvoiceResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInvoiceResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetInvoiceResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "ActionResult"));
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
