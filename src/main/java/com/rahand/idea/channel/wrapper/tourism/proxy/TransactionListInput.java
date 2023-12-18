/**
 * TransactionListInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class TransactionListInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String cardNumber;

    private String depositNumber;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.math.BigDecimal startAmount;

    private java.math.BigDecimal endAmount;

    private int[] transactionTypes;

    public TransactionListInput() {
    }

    public TransactionListInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String cardNumber,
           String depositNumber,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.math.BigDecimal startAmount,
           java.math.BigDecimal endAmount,
           int[] transactionTypes) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.cardNumber = cardNumber;
        this.depositNumber = depositNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startAmount = startAmount;
        this.endAmount = endAmount;
        this.transactionTypes = transactionTypes;
    }


    /**
     * Gets the userName value for this TransactionListInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this TransactionListInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the cardNumber value for this TransactionListInput.
     * 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this TransactionListInput.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the depositNumber value for this TransactionListInput.
     * 
     * @return depositNumber
     */
    public String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this TransactionListInput.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the startDate value for this TransactionListInput.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionListInput.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TransactionListInput.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionListInput.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startAmount value for this TransactionListInput.
     * 
     * @return startAmount
     */
    public java.math.BigDecimal getStartAmount() {
        return startAmount;
    }


    /**
     * Sets the startAmount value for this TransactionListInput.
     * 
     * @param startAmount
     */
    public void setStartAmount(java.math.BigDecimal startAmount) {
        this.startAmount = startAmount;
    }


    /**
     * Gets the endAmount value for this TransactionListInput.
     * 
     * @return endAmount
     */
    public java.math.BigDecimal getEndAmount() {
        return endAmount;
    }


    /**
     * Sets the endAmount value for this TransactionListInput.
     * 
     * @param endAmount
     */
    public void setEndAmount(java.math.BigDecimal endAmount) {
        this.endAmount = endAmount;
    }


    /**
     * Gets the transactionTypes value for this TransactionListInput.
     * 
     * @return transactionTypes
     */
    public int[] getTransactionTypes() {
        return transactionTypes;
    }


    /**
     * Sets the transactionTypes value for this TransactionListInput.
     * 
     * @param transactionTypes
     */
    public void setTransactionTypes(int[] transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransactionListInput)) return false;
        TransactionListInput other = (TransactionListInput) obj;
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
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.startAmount==null && other.getStartAmount()==null) || 
             (this.startAmount!=null &&
              this.startAmount.equals(other.getStartAmount()))) &&
            ((this.endAmount==null && other.getEndAmount()==null) || 
             (this.endAmount!=null &&
              this.endAmount.equals(other.getEndAmount()))) &&
            ((this.transactionTypes==null && other.getTransactionTypes()==null) || 
             (this.transactionTypes!=null &&
              java.util.Arrays.equals(this.transactionTypes, other.getTransactionTypes())));
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
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getStartAmount() != null) {
            _hashCode += getStartAmount().hashCode();
        }
        if (getEndAmount() != null) {
            _hashCode += getEndAmount().hashCode();
        }
        if (getTransactionTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionTypes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTransactionTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionListInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "TransactionListInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CardNumber"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "StartAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "EndAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "TransactionTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "int"));
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
