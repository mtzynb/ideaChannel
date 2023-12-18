/**
 * CoreBatchTransferPayaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class CoreBatchTransferPayaResponse  implements java.io.Serializable {
    private String coreBatchTransferPayaResult;

    public CoreBatchTransferPayaResponse() {
    }

    public CoreBatchTransferPayaResponse(
           String coreBatchTransferPayaResult) {
           this.coreBatchTransferPayaResult = coreBatchTransferPayaResult;
    }


    /**
     * Gets the coreBatchTransferPayaResult value for this CoreBatchTransferPayaResponse.
     * 
     * @return coreBatchTransferPayaResult
     */
    public String getCoreBatchTransferPayaResult() {
        return coreBatchTransferPayaResult;
    }


    /**
     * Sets the coreBatchTransferPayaResult value for this CoreBatchTransferPayaResponse.
     * 
     * @param coreBatchTransferPayaResult
     */
    public void setCoreBatchTransferPayaResult(String coreBatchTransferPayaResult) {
        this.coreBatchTransferPayaResult = coreBatchTransferPayaResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CoreBatchTransferPayaResponse)) return false;
        CoreBatchTransferPayaResponse other = (CoreBatchTransferPayaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coreBatchTransferPayaResult==null && other.getCoreBatchTransferPayaResult()==null) || 
             (this.coreBatchTransferPayaResult!=null &&
              this.coreBatchTransferPayaResult.equals(other.getCoreBatchTransferPayaResult())));
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
        if (getCoreBatchTransferPayaResult() != null) {
            _hashCode += getCoreBatchTransferPayaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CoreBatchTransferPayaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">CoreBatchTransferPayaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreBatchTransferPayaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CoreBatchTransferPayaResult"));
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
