/**
 * CardInformationInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class CardInformationInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String srcCardNumber;

    private String destCardNumber;

    private String email;

    private String pin2;

    private String cvv2;

    private Integer expireMonth;

    private Integer expireYear;

    private java.math.BigDecimal amount;

    private String phoneNumber;

    private String jsonData;

    public CardInformationInput() {
    }

    public CardInformationInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String srcCardNumber,
           String destCardNumber,
           String email,
           String pin2,
           String cvv2,
           Integer expireMonth,
           Integer expireYear,
           java.math.BigDecimal amount,
           String phoneNumber,
           String jsonData) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.srcCardNumber = srcCardNumber;
        this.destCardNumber = destCardNumber;
        this.email = email;
        this.pin2 = pin2;
        this.cvv2 = cvv2;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.amount = amount;
        this.phoneNumber = phoneNumber;
        this.jsonData = jsonData;
    }


    /**
     * Gets the userName value for this CardInformationInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CardInformationInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the srcCardNumber value for this CardInformationInput.
     * 
     * @return srcCardNumber
     */
    public String getSrcCardNumber() {
        return srcCardNumber;
    }


    /**
     * Sets the srcCardNumber value for this CardInformationInput.
     * 
     * @param srcCardNumber
     */
    public void setSrcCardNumber(String srcCardNumber) {
        this.srcCardNumber = srcCardNumber;
    }


    /**
     * Gets the destCardNumber value for this CardInformationInput.
     * 
     * @return destCardNumber
     */
    public String getDestCardNumber() {
        return destCardNumber;
    }


    /**
     * Sets the destCardNumber value for this CardInformationInput.
     * 
     * @param destCardNumber
     */
    public void setDestCardNumber(String destCardNumber) {
        this.destCardNumber = destCardNumber;
    }


    /**
     * Gets the email value for this CardInformationInput.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CardInformationInput.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the pin2 value for this CardInformationInput.
     * 
     * @return pin2
     */
    public String getPin2() {
        return pin2;
    }


    /**
     * Sets the pin2 value for this CardInformationInput.
     * 
     * @param pin2
     */
    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }


    /**
     * Gets the cvv2 value for this CardInformationInput.
     * 
     * @return cvv2
     */
    public String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this CardInformationInput.
     * 
     * @param cvv2
     */
    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expireMonth value for this CardInformationInput.
     * 
     * @return expireMonth
     */
    public Integer getExpireMonth() {
        return expireMonth;
    }


    /**
     * Sets the expireMonth value for this CardInformationInput.
     * 
     * @param expireMonth
     */
    public void setExpireMonth(Integer expireMonth) {
        this.expireMonth = expireMonth;
    }


    /**
     * Gets the expireYear value for this CardInformationInput.
     * 
     * @return expireYear
     */
    public Integer getExpireYear() {
        return expireYear;
    }


    /**
     * Sets the expireYear value for this CardInformationInput.
     * 
     * @param expireYear
     */
    public void setExpireYear(Integer expireYear) {
        this.expireYear = expireYear;
    }


    /**
     * Gets the amount value for this CardInformationInput.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardInformationInput.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the phoneNumber value for this CardInformationInput.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CardInformationInput.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the jsonData value for this CardInformationInput.
     * 
     * @return jsonData
     */
    public String getJsonData() {
        return jsonData;
    }


    /**
     * Sets the jsonData value for this CardInformationInput.
     * 
     * @param jsonData
     */
    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CardInformationInput)) return false;
        CardInformationInput other = (CardInformationInput) obj;
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
            ((this.srcCardNumber==null && other.getSrcCardNumber()==null) || 
             (this.srcCardNumber!=null &&
              this.srcCardNumber.equals(other.getSrcCardNumber()))) &&
            ((this.destCardNumber==null && other.getDestCardNumber()==null) || 
             (this.destCardNumber!=null &&
              this.destCardNumber.equals(other.getDestCardNumber()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.pin2==null && other.getPin2()==null) || 
             (this.pin2!=null &&
              this.pin2.equals(other.getPin2()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            ((this.expireMonth==null && other.getExpireMonth()==null) || 
             (this.expireMonth!=null &&
              this.expireMonth.equals(other.getExpireMonth()))) &&
            ((this.expireYear==null && other.getExpireYear()==null) || 
             (this.expireYear!=null &&
              this.expireYear.equals(other.getExpireYear()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.jsonData==null && other.getJsonData()==null) || 
             (this.jsonData!=null &&
              this.jsonData.equals(other.getJsonData())));
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
        if (getSrcCardNumber() != null) {
            _hashCode += getSrcCardNumber().hashCode();
        }
        if (getDestCardNumber() != null) {
            _hashCode += getDestCardNumber().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPin2() != null) {
            _hashCode += getPin2().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        if (getExpireMonth() != null) {
            _hashCode += getExpireMonth().hashCode();
        }
        if (getExpireYear() != null) {
            _hashCode += getExpireYear().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getJsonData() != null) {
            _hashCode += getJsonData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardInformationInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardInformationInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SrcCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pin2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Pin2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Cvv2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ExpireMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ExpireYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsonData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "JsonData"));
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
