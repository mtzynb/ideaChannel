/**
 * GetDepositInfoByCardNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetDepositInfoByCardNumberResponse  implements java.io.Serializable {
    private String getDepositInfoByCardNumberResult;

    public GetDepositInfoByCardNumberResponse() {
    }

    public GetDepositInfoByCardNumberResponse(
           String getDepositInfoByCardNumberResult) {
           this.getDepositInfoByCardNumberResult = getDepositInfoByCardNumberResult;
    }


    /**
     * Gets the getDepositInfoByCardNumberResult value for this GetDepositInfoByCardNumberResponse.
     * 
     * @return getDepositInfoByCardNumberResult
     */
    public String getGetDepositInfoByCardNumberResult() {
        return getDepositInfoByCardNumberResult;
    }


    /**
     * Sets the getDepositInfoByCardNumberResult value for this GetDepositInfoByCardNumberResponse.
     * 
     * @param getDepositInfoByCardNumberResult
     */
    public void setGetDepositInfoByCardNumberResult(String getDepositInfoByCardNumberResult) {
        this.getDepositInfoByCardNumberResult = getDepositInfoByCardNumberResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDepositInfoByCardNumberResponse)) return false;
        GetDepositInfoByCardNumberResponse other = (GetDepositInfoByCardNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDepositInfoByCardNumberResult==null && other.getGetDepositInfoByCardNumberResult()==null) || 
             (this.getDepositInfoByCardNumberResult!=null &&
              this.getDepositInfoByCardNumberResult.equals(other.getGetDepositInfoByCardNumberResult())));
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
        if (getGetDepositInfoByCardNumberResult() != null) {
            _hashCode += getGetDepositInfoByCardNumberResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDepositInfoByCardNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">GetDepositInfoByCardNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDepositInfoByCardNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetDepositInfoByCardNumberResult"));
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
