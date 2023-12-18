/**
 * SubmissionCheckInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class SubmissionCheckInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String deposit;

    private String chequeNumber;

    private java.math.BigDecimal minAmount;

    private java.math.BigDecimal maxAmount;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private Integer bankCode;

    private Integer chequeStatus;

    private java.util.Calendar startSubmisionDate;

    private java.util.Calendar endSubmissionDate;

    private int rowCount;

    public SubmissionCheckInput() {
    }

    public SubmissionCheckInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String deposit,
           String chequeNumber,
           java.math.BigDecimal minAmount,
           java.math.BigDecimal maxAmount,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           Integer bankCode,
           Integer chequeStatus,
           java.util.Calendar startSubmisionDate,
           java.util.Calendar endSubmissionDate,
           int rowCount) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.deposit = deposit;
        this.chequeNumber = chequeNumber;
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bankCode = bankCode;
        this.chequeStatus = chequeStatus;
        this.startSubmisionDate = startSubmisionDate;
        this.endSubmissionDate = endSubmissionDate;
        this.rowCount = rowCount;
    }


    /**
     * Gets the username value for this SubmissionCheckInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this SubmissionCheckInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the deposit value for this SubmissionCheckInput.
     * 
     * @return deposit
     */
    public String getDeposit() {
        return deposit;
    }


    /**
     * Sets the deposit value for this SubmissionCheckInput.
     * 
     * @param deposit
     */
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }


    /**
     * Gets the chequeNumber value for this SubmissionCheckInput.
     * 
     * @return chequeNumber
     */
    public String getChequeNumber() {
        return chequeNumber;
    }


    /**
     * Sets the chequeNumber value for this SubmissionCheckInput.
     * 
     * @param chequeNumber
     */
    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }


    /**
     * Gets the minAmount value for this SubmissionCheckInput.
     * 
     * @return minAmount
     */
    public java.math.BigDecimal getMinAmount() {
        return minAmount;
    }


    /**
     * Sets the minAmount value for this SubmissionCheckInput.
     * 
     * @param minAmount
     */
    public void setMinAmount(java.math.BigDecimal minAmount) {
        this.minAmount = minAmount;
    }


    /**
     * Gets the maxAmount value for this SubmissionCheckInput.
     * 
     * @return maxAmount
     */
    public java.math.BigDecimal getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this SubmissionCheckInput.
     * 
     * @param maxAmount
     */
    public void setMaxAmount(java.math.BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the startDate value for this SubmissionCheckInput.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SubmissionCheckInput.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this SubmissionCheckInput.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SubmissionCheckInput.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the bankCode value for this SubmissionCheckInput.
     * 
     * @return bankCode
     */
    public Integer getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this SubmissionCheckInput.
     * 
     * @param bankCode
     */
    public void setBankCode(Integer bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the chequeStatus value for this SubmissionCheckInput.
     * 
     * @return chequeStatus
     */
    public Integer getChequeStatus() {
        return chequeStatus;
    }


    /**
     * Sets the chequeStatus value for this SubmissionCheckInput.
     * 
     * @param chequeStatus
     */
    public void setChequeStatus(Integer chequeStatus) {
        this.chequeStatus = chequeStatus;
    }


    /**
     * Gets the startSubmisionDate value for this SubmissionCheckInput.
     * 
     * @return startSubmisionDate
     */
    public java.util.Calendar getStartSubmisionDate() {
        return startSubmisionDate;
    }


    /**
     * Sets the startSubmisionDate value for this SubmissionCheckInput.
     * 
     * @param startSubmisionDate
     */
    public void setStartSubmisionDate(java.util.Calendar startSubmisionDate) {
        this.startSubmisionDate = startSubmisionDate;
    }


    /**
     * Gets the endSubmissionDate value for this SubmissionCheckInput.
     * 
     * @return endSubmissionDate
     */
    public java.util.Calendar getEndSubmissionDate() {
        return endSubmissionDate;
    }


    /**
     * Sets the endSubmissionDate value for this SubmissionCheckInput.
     * 
     * @param endSubmissionDate
     */
    public void setEndSubmissionDate(java.util.Calendar endSubmissionDate) {
        this.endSubmissionDate = endSubmissionDate;
    }


    /**
     * Gets the rowCount value for this SubmissionCheckInput.
     * 
     * @return rowCount
     */
    public int getRowCount() {
        return rowCount;
    }


    /**
     * Sets the rowCount value for this SubmissionCheckInput.
     * 
     * @param rowCount
     */
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubmissionCheckInput)) return false;
        SubmissionCheckInput other = (SubmissionCheckInput) obj;
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
            ((this.deposit==null && other.getDeposit()==null) || 
             (this.deposit!=null &&
              this.deposit.equals(other.getDeposit()))) &&
            ((this.chequeNumber==null && other.getChequeNumber()==null) || 
             (this.chequeNumber!=null &&
              this.chequeNumber.equals(other.getChequeNumber()))) &&
            ((this.minAmount==null && other.getMinAmount()==null) || 
             (this.minAmount!=null &&
              this.minAmount.equals(other.getMinAmount()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.chequeStatus==null && other.getChequeStatus()==null) || 
             (this.chequeStatus!=null &&
              this.chequeStatus.equals(other.getChequeStatus()))) &&
            ((this.startSubmisionDate==null && other.getStartSubmisionDate()==null) || 
             (this.startSubmisionDate!=null &&
              this.startSubmisionDate.equals(other.getStartSubmisionDate()))) &&
            ((this.endSubmissionDate==null && other.getEndSubmissionDate()==null) || 
             (this.endSubmissionDate!=null &&
              this.endSubmissionDate.equals(other.getEndSubmissionDate()))) &&
            this.rowCount == other.getRowCount();
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
        if (getDeposit() != null) {
            _hashCode += getDeposit().hashCode();
        }
        if (getChequeNumber() != null) {
            _hashCode += getChequeNumber().hashCode();
        }
        if (getMinAmount() != null) {
            _hashCode += getMinAmount().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getChequeStatus() != null) {
            _hashCode += getChequeStatus().hashCode();
        }
        if (getStartSubmisionDate() != null) {
            _hashCode += getStartSubmisionDate().hashCode();
        }
        if (getEndSubmissionDate() != null) {
            _hashCode += getEndSubmissionDate().hashCode();
        }
        _hashCode += getRowCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubmissionCheckInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "SubmissionCheckInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deposit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Deposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChequeNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "MinAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "MaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChequeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startSubmisionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "StartSubmisionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endSubmissionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "EndSubmissionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "RowCount"));
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
