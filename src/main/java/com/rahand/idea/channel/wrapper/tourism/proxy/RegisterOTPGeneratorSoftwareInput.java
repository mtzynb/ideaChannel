/**
 * RegisterOTPGeneratorSoftwareInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class RegisterOTPGeneratorSoftwareInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String itemId;

    private int ticketCode;

    private int otpUsageType;

    public RegisterOTPGeneratorSoftwareInput() {
    }

    public RegisterOTPGeneratorSoftwareInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String itemId,
           int ticketCode,
           int otpUsageType) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.itemId = itemId;
        this.ticketCode = ticketCode;
        this.otpUsageType = otpUsageType;
    }


    /**
     * Gets the userName value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the itemId value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the ticketCode value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @return ticketCode
     */
    public int getTicketCode() {
        return ticketCode;
    }


    /**
     * Sets the ticketCode value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @param ticketCode
     */
    public void setTicketCode(int ticketCode) {
        this.ticketCode = ticketCode;
    }


    /**
     * Gets the otpUsageType value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @return otpUsageType
     */
    public int getOtpUsageType() {
        return otpUsageType;
    }


    /**
     * Sets the otpUsageType value for this RegisterOTPGeneratorSoftwareInput.
     * 
     * @param otpUsageType
     */
    public void setOtpUsageType(int otpUsageType) {
        this.otpUsageType = otpUsageType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RegisterOTPGeneratorSoftwareInput)) return false;
        RegisterOTPGeneratorSoftwareInput other = (RegisterOTPGeneratorSoftwareInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            this.ticketCode == other.getTicketCode() &&
            this.otpUsageType == other.getOtpUsageType();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        _hashCode += getTicketCode();
        _hashCode += getOtpUsageType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RegisterOTPGeneratorSoftwareInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "RegisterOTPGeneratorSoftwareInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "TicketCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otpUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OtpUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
