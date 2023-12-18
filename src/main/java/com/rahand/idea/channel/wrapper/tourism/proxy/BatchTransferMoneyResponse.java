/**
 * BatchTransferMoneyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class BatchTransferMoneyResponse  implements java.io.Serializable {
    private String batchTransferMoneyResult;

    public BatchTransferMoneyResponse() {
    }

    public BatchTransferMoneyResponse(
           String batchTransferMoneyResult) {
           this.batchTransferMoneyResult = batchTransferMoneyResult;
    }


    /**
     * Gets the batchTransferMoneyResult value for this BatchTransferMoneyResponse.
     * 
     * @return batchTransferMoneyResult
     */
    public String getBatchTransferMoneyResult() {
        return batchTransferMoneyResult;
    }


    /**
     * Sets the batchTransferMoneyResult value for this BatchTransferMoneyResponse.
     * 
     * @param batchTransferMoneyResult
     */
    public void setBatchTransferMoneyResult(String batchTransferMoneyResult) {
        this.batchTransferMoneyResult = batchTransferMoneyResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchTransferMoneyResponse)) return false;
        BatchTransferMoneyResponse other = (BatchTransferMoneyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchTransferMoneyResult==null && other.getBatchTransferMoneyResult()==null) || 
             (this.batchTransferMoneyResult!=null &&
              this.batchTransferMoneyResult.equals(other.getBatchTransferMoneyResult())));
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
        if (getBatchTransferMoneyResult() != null) {
            _hashCode += getBatchTransferMoneyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchTransferMoneyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", ">BatchTransferMoneyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchTransferMoneyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferMoneyResult"));
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
