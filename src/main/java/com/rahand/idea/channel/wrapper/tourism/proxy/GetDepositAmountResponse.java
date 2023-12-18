/**
 * GetDepositAmountResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

import com.rahand.idea.channel.wrapper.tourism.proxy.signature.ActionResult;

public class GetDepositAmountResponse  implements java.io.Serializable {
    private ActionResult getDepositAmountResult;

    public GetDepositAmountResponse() {
    }

    public GetDepositAmountResponse(
           ActionResult getDepositAmountResult) {
           this.getDepositAmountResult = getDepositAmountResult;
    }


    /**
     * Gets the getDepositAmountResult value for this GetDepositAmountResponse.
     * 
     * @return getDepositAmountResult
     */
    public ActionResult getGetDepositAmountResult() {
        return getDepositAmountResult;
    }


    /**
     * Sets the getDepositAmountResult value for this GetDepositAmountResponse.
     * 
     * @param getDepositAmountResult
     */
    public void setGetDepositAmountResult(ActionResult getDepositAmountResult) {
        this.getDepositAmountResult = getDepositAmountResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDepositAmountResponse)) return false;
        GetDepositAmountResponse other = (GetDepositAmountResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDepositAmountResult==null && other.getGetDepositAmountResult()==null) || 
             (this.getDepositAmountResult!=null &&
              this.getDepositAmountResult.equals(other.getGetDepositAmountResult())));
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
        if (getGetDepositAmountResult() != null) {
            _hashCode += getGetDepositAmountResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDepositAmountResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetDepositAmountResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDepositAmountResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetDepositAmountResult"));
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
