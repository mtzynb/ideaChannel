/**
 * ConfirmCustomerInfoInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class ConfirmCustomerInfoInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String depositNumber;

    private String customerNumber;

    private String identificationNumber;

    private boolean checkLegalCustomerWithNationalCode;

    public ConfirmCustomerInfoInput() {
    }

    public ConfirmCustomerInfoInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String depositNumber,
           String customerNumber,
           String identificationNumber,
           boolean checkLegalCustomerWithNationalCode) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.depositNumber = depositNumber;
        this.customerNumber = customerNumber;
        this.identificationNumber = identificationNumber;
        this.checkLegalCustomerWithNationalCode = checkLegalCustomerWithNationalCode;
    }


    /**
     * Gets the username value for this ConfirmCustomerInfoInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this ConfirmCustomerInfoInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the depositNumber value for this ConfirmCustomerInfoInput.
     * 
     * @return depositNumber
     */
    public String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this ConfirmCustomerInfoInput.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the customerNumber value for this ConfirmCustomerInfoInput.
     * 
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }


    /**
     * Sets the customerNumber value for this ConfirmCustomerInfoInput.
     * 
     * @param customerNumber
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }


    /**
     * Gets the identificationNumber value for this ConfirmCustomerInfoInput.
     * 
     * @return identificationNumber
     */
    public String getIdentificationNumber() {
        return identificationNumber;
    }


    /**
     * Sets the identificationNumber value for this ConfirmCustomerInfoInput.
     * 
     * @param identificationNumber
     */
    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }


    /**
     * Gets the checkLegalCustomerWithNationalCode value for this ConfirmCustomerInfoInput.
     * 
     * @return checkLegalCustomerWithNationalCode
     */
    public boolean isCheckLegalCustomerWithNationalCode() {
        return checkLegalCustomerWithNationalCode;
    }


    /**
     * Sets the checkLegalCustomerWithNationalCode value for this ConfirmCustomerInfoInput.
     * 
     * @param checkLegalCustomerWithNationalCode
     */
    public void setCheckLegalCustomerWithNationalCode(boolean checkLegalCustomerWithNationalCode) {
        this.checkLegalCustomerWithNationalCode = checkLegalCustomerWithNationalCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConfirmCustomerInfoInput)) return false;
        ConfirmCustomerInfoInput other = (ConfirmCustomerInfoInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.customerNumber==null && other.getCustomerNumber()==null) || 
             (this.customerNumber!=null &&
              this.customerNumber.equals(other.getCustomerNumber()))) &&
            ((this.identificationNumber==null && other.getIdentificationNumber()==null) || 
             (this.identificationNumber!=null &&
              this.identificationNumber.equals(other.getIdentificationNumber()))) &&
            this.checkLegalCustomerWithNationalCode == other.isCheckLegalCustomerWithNationalCode();
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getCustomerNumber() != null) {
            _hashCode += getCustomerNumber().hashCode();
        }
        if (getIdentificationNumber() != null) {
            _hashCode += getIdentificationNumber().hashCode();
        }
        _hashCode += (isCheckLegalCustomerWithNationalCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmCustomerInfoInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ConfirmCustomerInfoInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CustomerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "IdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkLegalCustomerWithNationalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CheckLegalCustomerWithNationalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
