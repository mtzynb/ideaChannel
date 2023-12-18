/**
 * CardToCardTransferInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class CardToCardTransferInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String srcCardNumber;

    private String srcDepositNumber;

    private String password;

    private String cvv2;

    private int expireMonth;

    private int expireYear;

    private String destCardNumber;

    private java.math.BigDecimal amount;

    private String email;

    private String phoneNumber;

    private long authorizationCode;

    private String cardName;

    private String srcComment;

    private String destComment;

    private boolean withReferenceNumber;

    private String jsonData;

    public CardToCardTransferInput() {
    }

    public CardToCardTransferInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String srcCardNumber,
           String srcDepositNumber,
           String password,
           String cvv2,
           int expireMonth,
           int expireYear,
           String destCardNumber,
           java.math.BigDecimal amount,
           String email,
           String phoneNumber,
           long authorizationCode,
           String cardName,
           String srcComment,
           String destComment,
           boolean withReferenceNumber,
           String jsonData) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.srcCardNumber = srcCardNumber;
        this.srcDepositNumber = srcDepositNumber;
        this.password = password;
        this.cvv2 = cvv2;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.destCardNumber = destCardNumber;
        this.amount = amount;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.authorizationCode = authorizationCode;
        this.cardName = cardName;
        this.srcComment = srcComment;
        this.destComment = destComment;
        this.withReferenceNumber = withReferenceNumber;
        this.jsonData = jsonData;
    }


    /**
     * Gets the userName value for this CardToCardTransferInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this CardToCardTransferInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the srcCardNumber value for this CardToCardTransferInput.
     * 
     * @return srcCardNumber
     */
    public String getSrcCardNumber() {
        return srcCardNumber;
    }


    /**
     * Sets the srcCardNumber value for this CardToCardTransferInput.
     * 
     * @param srcCardNumber
     */
    public void setSrcCardNumber(String srcCardNumber) {
        this.srcCardNumber = srcCardNumber;
    }


    /**
     * Gets the srcDepositNumber value for this CardToCardTransferInput.
     * 
     * @return srcDepositNumber
     */
    public String getSrcDepositNumber() {
        return srcDepositNumber;
    }


    /**
     * Sets the srcDepositNumber value for this CardToCardTransferInput.
     * 
     * @param srcDepositNumber
     */
    public void setSrcDepositNumber(String srcDepositNumber) {
        this.srcDepositNumber = srcDepositNumber;
    }


    /**
     * Gets the password value for this CardToCardTransferInput.
     * 
     * @return password
     */
    public String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this CardToCardTransferInput.
     * 
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }


    /**
     * Gets the cvv2 value for this CardToCardTransferInput.
     * 
     * @return cvv2
     */
    public String getCvv2() {
        return cvv2;
    }


    /**
     * Sets the cvv2 value for this CardToCardTransferInput.
     * 
     * @param cvv2
     */
    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }


    /**
     * Gets the expireMonth value for this CardToCardTransferInput.
     * 
     * @return expireMonth
     */
    public int getExpireMonth() {
        return expireMonth;
    }


    /**
     * Sets the expireMonth value for this CardToCardTransferInput.
     * 
     * @param expireMonth
     */
    public void setExpireMonth(int expireMonth) {
        this.expireMonth = expireMonth;
    }


    /**
     * Gets the expireYear value for this CardToCardTransferInput.
     * 
     * @return expireYear
     */
    public int getExpireYear() {
        return expireYear;
    }


    /**
     * Sets the expireYear value for this CardToCardTransferInput.
     * 
     * @param expireYear
     */
    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }


    /**
     * Gets the destCardNumber value for this CardToCardTransferInput.
     * 
     * @return destCardNumber
     */
    public String getDestCardNumber() {
        return destCardNumber;
    }


    /**
     * Sets the destCardNumber value for this CardToCardTransferInput.
     * 
     * @param destCardNumber
     */
    public void setDestCardNumber(String destCardNumber) {
        this.destCardNumber = destCardNumber;
    }


    /**
     * Gets the amount value for this CardToCardTransferInput.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CardToCardTransferInput.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the email value for this CardToCardTransferInput.
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CardToCardTransferInput.
     * 
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the phoneNumber value for this CardToCardTransferInput.
     * 
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this CardToCardTransferInput.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the authorizationCode value for this CardToCardTransferInput.
     * 
     * @return authorizationCode
     */
    public long getAuthorizationCode() {
        return authorizationCode;
    }


    /**
     * Sets the authorizationCode value for this CardToCardTransferInput.
     * 
     * @param authorizationCode
     */
    public void setAuthorizationCode(long authorizationCode) {
        this.authorizationCode = authorizationCode;
    }


    /**
     * Gets the cardName value for this CardToCardTransferInput.
     * 
     * @return cardName
     */
    public String getCardName() {
        return cardName;
    }


    /**
     * Sets the cardName value for this CardToCardTransferInput.
     * 
     * @param cardName
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }


    /**
     * Gets the srcComment value for this CardToCardTransferInput.
     * 
     * @return srcComment
     */
    public String getSrcComment() {
        return srcComment;
    }


    /**
     * Sets the srcComment value for this CardToCardTransferInput.
     * 
     * @param srcComment
     */
    public void setSrcComment(String srcComment) {
        this.srcComment = srcComment;
    }


    /**
     * Gets the destComment value for this CardToCardTransferInput.
     * 
     * @return destComment
     */
    public String getDestComment() {
        return destComment;
    }


    /**
     * Sets the destComment value for this CardToCardTransferInput.
     * 
     * @param destComment
     */
    public void setDestComment(String destComment) {
        this.destComment = destComment;
    }


    /**
     * Gets the withReferenceNumber value for this CardToCardTransferInput.
     * 
     * @return withReferenceNumber
     */
    public boolean isWithReferenceNumber() {
        return withReferenceNumber;
    }


    /**
     * Sets the withReferenceNumber value for this CardToCardTransferInput.
     * 
     * @param withReferenceNumber
     */
    public void setWithReferenceNumber(boolean withReferenceNumber) {
        this.withReferenceNumber = withReferenceNumber;
    }


    /**
     * Gets the jsonData value for this CardToCardTransferInput.
     * 
     * @return jsonData
     */
    public String getJsonData() {
        return jsonData;
    }


    /**
     * Sets the jsonData value for this CardToCardTransferInput.
     * 
     * @param jsonData
     */
    public void setJsonData(String jsonData) {
        this.jsonData = jsonData;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CardToCardTransferInput)) return false;
        CardToCardTransferInput other = (CardToCardTransferInput) obj;
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
            ((this.srcDepositNumber==null && other.getSrcDepositNumber()==null) || 
             (this.srcDepositNumber!=null &&
              this.srcDepositNumber.equals(other.getSrcDepositNumber()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.cvv2==null && other.getCvv2()==null) || 
             (this.cvv2!=null &&
              this.cvv2.equals(other.getCvv2()))) &&
            this.expireMonth == other.getExpireMonth() &&
            this.expireYear == other.getExpireYear() &&
            ((this.destCardNumber==null && other.getDestCardNumber()==null) || 
             (this.destCardNumber!=null &&
              this.destCardNumber.equals(other.getDestCardNumber()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            this.authorizationCode == other.getAuthorizationCode() &&
            ((this.cardName==null && other.getCardName()==null) || 
             (this.cardName!=null &&
              this.cardName.equals(other.getCardName()))) &&
            ((this.srcComment==null && other.getSrcComment()==null) || 
             (this.srcComment!=null &&
              this.srcComment.equals(other.getSrcComment()))) &&
            ((this.destComment==null && other.getDestComment()==null) || 
             (this.destComment!=null &&
              this.destComment.equals(other.getDestComment()))) &&
            this.withReferenceNumber == other.isWithReferenceNumber() &&
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
        if (getSrcDepositNumber() != null) {
            _hashCode += getSrcDepositNumber().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getCvv2() != null) {
            _hashCode += getCvv2().hashCode();
        }
        _hashCode += getExpireMonth();
        _hashCode += getExpireYear();
        if (getDestCardNumber() != null) {
            _hashCode += getDestCardNumber().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        _hashCode += new Long(getAuthorizationCode()).hashCode();
        if (getCardName() != null) {
            _hashCode += getCardName().hashCode();
        }
        if (getSrcComment() != null) {
            _hashCode += getSrcComment().hashCode();
        }
        if (getDestComment() != null) {
            _hashCode += getDestComment().hashCode();
        }
        _hashCode += (isWithReferenceNumber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getJsonData() != null) {
            _hashCode += getJsonData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardToCardTransferInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardToCardTransferInput"));
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
        elemField.setFieldName("srcDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SrcDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Password"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ExpireYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "AuthorizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SrcComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "WithReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
