/**
 * BaseInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public abstract class BaseInput  implements java.io.Serializable {
    private String brokerId;

    private String timestamp;

    private String inputSignature;

    private String clientAddress;

    private String originalAddress;

    public BaseInput() {
    }

    public BaseInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress) {
           this.brokerId = brokerId;
           this.timestamp = timestamp;
           this.inputSignature = inputSignature;
           this.clientAddress = clientAddress;
           this.originalAddress = originalAddress;
    }


    /**
     * Gets the brokerId value for this BaseInput.
     * 
     * @return brokerId
     */
    public String getBrokerId() {
        return brokerId;
    }


    /**
     * Sets the brokerId value for this BaseInput.
     * 
     * @param brokerId
     */
    public void setBrokerId(String brokerId) {
        this.brokerId = brokerId;
    }


    /**
     * Gets the timestamp value for this BaseInput.
     * 
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this BaseInput.
     * 
     * @param timestamp
     */
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the inputSignature value for this BaseInput.
     * 
     * @return inputSignature
     */
    public String getInputSignature() {
        return inputSignature;
    }


    /**
     * Sets the inputSignature value for this BaseInput.
     * 
     * @param inputSignature
     */
    public void setInputSignature(String inputSignature) {
        this.inputSignature = inputSignature;
    }


    /**
     * Gets the clientAddress value for this BaseInput.
     * 
     * @return clientAddress
     */
    public String getClientAddress() {
        return clientAddress;
    }


    /**
     * Sets the clientAddress value for this BaseInput.
     * 
     * @param clientAddress
     */
    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }


    /**
     * Gets the originalAddress value for this BaseInput.
     * 
     * @return originalAddress
     */
    public String getOriginalAddress() {
        return originalAddress;
    }


    /**
     * Sets the originalAddress value for this BaseInput.
     * 
     * @param originalAddress
     */
    public void setOriginalAddress(String originalAddress) {
        this.originalAddress = originalAddress;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BaseInput)) return false;
        BaseInput other = (BaseInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brokerId==null && other.getBrokerId()==null) || 
             (this.brokerId!=null &&
              this.brokerId.equals(other.getBrokerId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.inputSignature==null && other.getInputSignature()==null) || 
             (this.inputSignature!=null &&
              this.inputSignature.equals(other.getInputSignature()))) &&
            ((this.clientAddress==null && other.getClientAddress()==null) || 
             (this.clientAddress!=null &&
              this.clientAddress.equals(other.getClientAddress()))) &&
            ((this.originalAddress==null && other.getOriginalAddress()==null) || 
             (this.originalAddress!=null &&
              this.originalAddress.equals(other.getOriginalAddress())));
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
        if (getBrokerId() != null) {
            _hashCode += getBrokerId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getInputSignature() != null) {
            _hashCode += getInputSignature().hashCode();
        }
        if (getClientAddress() != null) {
            _hashCode += getClientAddress().hashCode();
        }
        if (getOriginalAddress() != null) {
            _hashCode += getOriginalAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BaseInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brokerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BrokerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputSignature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "InputSignature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ClientAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OriginalAddress"));
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
