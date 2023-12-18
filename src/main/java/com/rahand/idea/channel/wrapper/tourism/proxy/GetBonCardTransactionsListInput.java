/**
 * GetBonCardTransactionsListInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class GetBonCardTransactionsListInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String cardNumber;

    private long organizationCode;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.math.BigDecimal startAmount;

    private java.math.BigDecimal endAmount;

    private int[] transactionTypes;

    public GetBonCardTransactionsListInput() {
    }

    public GetBonCardTransactionsListInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String cardNumber,
           long organizationCode,
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
        this.username = username;
        this.cardNumber = cardNumber;
        this.organizationCode = organizationCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.startAmount = startAmount;
        this.endAmount = endAmount;
        this.transactionTypes = transactionTypes;
    }


    /**
     * Gets the username value for this GetBonCardTransactionsListInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this GetBonCardTransactionsListInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the cardNumber value for this GetBonCardTransactionsListInput.
     * 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this GetBonCardTransactionsListInput.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the organizationCode value for this GetBonCardTransactionsListInput.
     * 
     * @return organizationCode
     */
    public long getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this GetBonCardTransactionsListInput.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(long organizationCode) {
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the startDate value for this GetBonCardTransactionsListInput.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetBonCardTransactionsListInput.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this GetBonCardTransactionsListInput.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this GetBonCardTransactionsListInput.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the startAmount value for this GetBonCardTransactionsListInput.
     * 
     * @return startAmount
     */
    public java.math.BigDecimal getStartAmount() {
        return startAmount;
    }


    /**
     * Sets the startAmount value for this GetBonCardTransactionsListInput.
     * 
     * @param startAmount
     */
    public void setStartAmount(java.math.BigDecimal startAmount) {
        this.startAmount = startAmount;
    }


    /**
     * Gets the endAmount value for this GetBonCardTransactionsListInput.
     * 
     * @return endAmount
     */
    public java.math.BigDecimal getEndAmount() {
        return endAmount;
    }


    /**
     * Sets the endAmount value for this GetBonCardTransactionsListInput.
     * 
     * @param endAmount
     */
    public void setEndAmount(java.math.BigDecimal endAmount) {
        this.endAmount = endAmount;
    }


    /**
     * Gets the transactionTypes value for this GetBonCardTransactionsListInput.
     * 
     * @return transactionTypes
     */
    public int[] getTransactionTypes() {
        return transactionTypes;
    }


    /**
     * Sets the transactionTypes value for this GetBonCardTransactionsListInput.
     * 
     * @param transactionTypes
     */
    public void setTransactionTypes(int[] transactionTypes) {
        this.transactionTypes = transactionTypes;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetBonCardTransactionsListInput)) return false;
        GetBonCardTransactionsListInput other = (GetBonCardTransactionsListInput) obj;
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
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            this.organizationCode == other.getOrganizationCode() &&
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        _hashCode += new Long(getOrganizationCode()).hashCode();
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
        new org.apache.axis.description.TypeDesc(GetBonCardTransactionsListInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "GetBonCardTransactionsListInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
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
        elemField.setFieldName("organizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
