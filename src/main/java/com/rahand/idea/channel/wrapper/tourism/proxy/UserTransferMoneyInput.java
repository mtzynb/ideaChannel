/**
 * UserTransferMoneyInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class UserTransferMoneyInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String sourceDepositNumber;

    private String sourceSheba;

    private String destDepositNumber;

    private String destSheba;

    private String destBankCode;

    private String destFirstName;

    private String destLastName;

    private String amount;

    private String sourceComment;

    private String destComment;

    private String paymentId;

    private Short centralBankTransferDetailType;

    public UserTransferMoneyInput() {
    }

    public UserTransferMoneyInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String sourceDepositNumber,
           String sourceSheba,
           String destDepositNumber,
           String destSheba,
           String destBankCode,
           String destFirstName,
           String destLastName,
           String amount,
           String sourceComment,
           String destComment,
           String paymentId,
           Short centralBankTransferDetailType) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.sourceDepositNumber = sourceDepositNumber;
        this.sourceSheba = sourceSheba;
        this.destDepositNumber = destDepositNumber;
        this.destSheba = destSheba;
        this.destBankCode = destBankCode;
        this.destFirstName = destFirstName;
        this.destLastName = destLastName;
        this.amount = amount;
        this.sourceComment = sourceComment;
        this.destComment = destComment;
        this.paymentId = paymentId;
        this.centralBankTransferDetailType = centralBankTransferDetailType;
    }


    /**
     * Gets the username value for this UserTransferMoneyInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserTransferMoneyInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the sourceDepositNumber value for this UserTransferMoneyInput.
     * 
     * @return sourceDepositNumber
     */
    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }


    /**
     * Sets the sourceDepositNumber value for this UserTransferMoneyInput.
     * 
     * @param sourceDepositNumber
     */
    public void setSourceDepositNumber(String sourceDepositNumber) {
        this.sourceDepositNumber = sourceDepositNumber;
    }


    /**
     * Gets the sourceSheba value for this UserTransferMoneyInput.
     * 
     * @return sourceSheba
     */
    public String getSourceSheba() {
        return sourceSheba;
    }


    /**
     * Sets the sourceSheba value for this UserTransferMoneyInput.
     * 
     * @param sourceSheba
     */
    public void setSourceSheba(String sourceSheba) {
        this.sourceSheba = sourceSheba;
    }


    /**
     * Gets the destDepositNumber value for this UserTransferMoneyInput.
     * 
     * @return destDepositNumber
     */
    public String getDestDepositNumber() {
        return destDepositNumber;
    }


    /**
     * Sets the destDepositNumber value for this UserTransferMoneyInput.
     * 
     * @param destDepositNumber
     */
    public void setDestDepositNumber(String destDepositNumber) {
        this.destDepositNumber = destDepositNumber;
    }


    /**
     * Gets the destSheba value for this UserTransferMoneyInput.
     * 
     * @return destSheba
     */
    public String getDestSheba() {
        return destSheba;
    }


    /**
     * Sets the destSheba value for this UserTransferMoneyInput.
     * 
     * @param destSheba
     */
    public void setDestSheba(String destSheba) {
        this.destSheba = destSheba;
    }


    /**
     * Gets the destBankCode value for this UserTransferMoneyInput.
     * 
     * @return destBankCode
     */
    public String getDestBankCode() {
        return destBankCode;
    }


    /**
     * Sets the destBankCode value for this UserTransferMoneyInput.
     * 
     * @param destBankCode
     */
    public void setDestBankCode(String destBankCode) {
        this.destBankCode = destBankCode;
    }


    /**
     * Gets the destFirstName value for this UserTransferMoneyInput.
     * 
     * @return destFirstName
     */
    public String getDestFirstName() {
        return destFirstName;
    }


    /**
     * Sets the destFirstName value for this UserTransferMoneyInput.
     * 
     * @param destFirstName
     */
    public void setDestFirstName(String destFirstName) {
        this.destFirstName = destFirstName;
    }


    /**
     * Gets the destLastName value for this UserTransferMoneyInput.
     * 
     * @return destLastName
     */
    public String getDestLastName() {
        return destLastName;
    }


    /**
     * Sets the destLastName value for this UserTransferMoneyInput.
     * 
     * @param destLastName
     */
    public void setDestLastName(String destLastName) {
        this.destLastName = destLastName;
    }


    /**
     * Gets the amount value for this UserTransferMoneyInput.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UserTransferMoneyInput.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the sourceComment value for this UserTransferMoneyInput.
     * 
     * @return sourceComment
     */
    public String getSourceComment() {
        return sourceComment;
    }


    /**
     * Sets the sourceComment value for this UserTransferMoneyInput.
     * 
     * @param sourceComment
     */
    public void setSourceComment(String sourceComment) {
        this.sourceComment = sourceComment;
    }


    /**
     * Gets the destComment value for this UserTransferMoneyInput.
     * 
     * @return destComment
     */
    public String getDestComment() {
        return destComment;
    }


    /**
     * Sets the destComment value for this UserTransferMoneyInput.
     * 
     * @param destComment
     */
    public void setDestComment(String destComment) {
        this.destComment = destComment;
    }


    /**
     * Gets the paymentId value for this UserTransferMoneyInput.
     * 
     * @return paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }


    /**
     * Sets the paymentId value for this UserTransferMoneyInput.
     * 
     * @param paymentId
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }


    /**
     * Gets the centralBankTransferDetailType value for this UserTransferMoneyInput.
     * 
     * @return centralBankTransferDetailType
     */
    public Short getCentralBankTransferDetailType() {
        return centralBankTransferDetailType;
    }


    /**
     * Sets the centralBankTransferDetailType value for this UserTransferMoneyInput.
     * 
     * @param centralBankTransferDetailType
     */
    public void setCentralBankTransferDetailType(Short centralBankTransferDetailType) {
        this.centralBankTransferDetailType = centralBankTransferDetailType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserTransferMoneyInput)) return false;
        UserTransferMoneyInput other = (UserTransferMoneyInput) obj;
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
            ((this.sourceDepositNumber==null && other.getSourceDepositNumber()==null) || 
             (this.sourceDepositNumber!=null &&
              this.sourceDepositNumber.equals(other.getSourceDepositNumber()))) &&
            ((this.sourceSheba==null && other.getSourceSheba()==null) || 
             (this.sourceSheba!=null &&
              this.sourceSheba.equals(other.getSourceSheba()))) &&
            ((this.destDepositNumber==null && other.getDestDepositNumber()==null) || 
             (this.destDepositNumber!=null &&
              this.destDepositNumber.equals(other.getDestDepositNumber()))) &&
            ((this.destSheba==null && other.getDestSheba()==null) || 
             (this.destSheba!=null &&
              this.destSheba.equals(other.getDestSheba()))) &&
            ((this.destBankCode==null && other.getDestBankCode()==null) || 
             (this.destBankCode!=null &&
              this.destBankCode.equals(other.getDestBankCode()))) &&
            ((this.destFirstName==null && other.getDestFirstName()==null) || 
             (this.destFirstName!=null &&
              this.destFirstName.equals(other.getDestFirstName()))) &&
            ((this.destLastName==null && other.getDestLastName()==null) || 
             (this.destLastName!=null &&
              this.destLastName.equals(other.getDestLastName()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.sourceComment==null && other.getSourceComment()==null) || 
             (this.sourceComment!=null &&
              this.sourceComment.equals(other.getSourceComment()))) &&
            ((this.destComment==null && other.getDestComment()==null) || 
             (this.destComment!=null &&
              this.destComment.equals(other.getDestComment()))) &&
            ((this.paymentId==null && other.getPaymentId()==null) || 
             (this.paymentId!=null &&
              this.paymentId.equals(other.getPaymentId()))) &&
            ((this.centralBankTransferDetailType==null && other.getCentralBankTransferDetailType()==null) || 
             (this.centralBankTransferDetailType!=null &&
              this.centralBankTransferDetailType.equals(other.getCentralBankTransferDetailType())));
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
        if (getSourceDepositNumber() != null) {
            _hashCode += getSourceDepositNumber().hashCode();
        }
        if (getSourceSheba() != null) {
            _hashCode += getSourceSheba().hashCode();
        }
        if (getDestDepositNumber() != null) {
            _hashCode += getDestDepositNumber().hashCode();
        }
        if (getDestSheba() != null) {
            _hashCode += getDestSheba().hashCode();
        }
        if (getDestBankCode() != null) {
            _hashCode += getDestBankCode().hashCode();
        }
        if (getDestFirstName() != null) {
            _hashCode += getDestFirstName().hashCode();
        }
        if (getDestLastName() != null) {
            _hashCode += getDestLastName().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getSourceComment() != null) {
            _hashCode += getSourceComment().hashCode();
        }
        if (getDestComment() != null) {
            _hashCode += getDestComment().hashCode();
        }
        if (getPaymentId() != null) {
            _hashCode += getPaymentId().hashCode();
        }
        if (getCentralBankTransferDetailType() != null) {
            _hashCode += getCentralBankTransferDetailType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserTransferMoneyInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserTransferMoneyInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SourceDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceSheba");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SourceSheba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destDepositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestDepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destSheba");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestSheba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destBankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestBankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DestLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SourceComment"));
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
        elemField.setFieldName("paymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "PaymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralBankTransferDetailType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CentralBankTransferDetailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
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
