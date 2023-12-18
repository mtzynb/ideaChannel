/**
 * BatchTransferMoneyInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class BatchTransferMoneyInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private String amount;

    private String documentTitle;

    private String currencyIsoCode;

    private java.util.Calendar transferDate;

    private BatchTransferItemInfo[] batchTransferItems;

    public BatchTransferMoneyInput() {
    }

    public BatchTransferMoneyInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           String amount,
           String documentTitle,
           String currencyIsoCode,
           java.util.Calendar transferDate,
           BatchTransferItemInfo[] batchTransferItems) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.amount = amount;
        this.documentTitle = documentTitle;
        this.currencyIsoCode = currencyIsoCode;
        this.transferDate = transferDate;
        this.batchTransferItems = batchTransferItems;
    }


    /**
     * Gets the userName value for this BatchTransferMoneyInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this BatchTransferMoneyInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the amount value for this BatchTransferMoneyInput.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BatchTransferMoneyInput.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the documentTitle value for this BatchTransferMoneyInput.
     * 
     * @return documentTitle
     */
    public String getDocumentTitle() {
        return documentTitle;
    }


    /**
     * Sets the documentTitle value for this BatchTransferMoneyInput.
     * 
     * @param documentTitle
     */
    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }


    /**
     * Gets the currencyIsoCode value for this BatchTransferMoneyInput.
     * 
     * @return currencyIsoCode
     */
    public String getCurrencyIsoCode() {
        return currencyIsoCode;
    }


    /**
     * Sets the currencyIsoCode value for this BatchTransferMoneyInput.
     * 
     * @param currencyIsoCode
     */
    public void setCurrencyIsoCode(String currencyIsoCode) {
        this.currencyIsoCode = currencyIsoCode;
    }


    /**
     * Gets the transferDate value for this BatchTransferMoneyInput.
     * 
     * @return transferDate
     */
    public java.util.Calendar getTransferDate() {
        return transferDate;
    }


    /**
     * Sets the transferDate value for this BatchTransferMoneyInput.
     * 
     * @param transferDate
     */
    public void setTransferDate(java.util.Calendar transferDate) {
        this.transferDate = transferDate;
    }


    /**
     * Gets the batchTransferItems value for this BatchTransferMoneyInput.
     * 
     * @return batchTransferItems
     */
    public BatchTransferItemInfo[] getBatchTransferItems() {
        return batchTransferItems;
    }


    /**
     * Sets the batchTransferItems value for this BatchTransferMoneyInput.
     * 
     * @param batchTransferItems
     */
    public void setBatchTransferItems(BatchTransferItemInfo[] batchTransferItems) {
        this.batchTransferItems = batchTransferItems;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchTransferMoneyInput)) return false;
        BatchTransferMoneyInput other = (BatchTransferMoneyInput) obj;
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
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.documentTitle==null && other.getDocumentTitle()==null) || 
             (this.documentTitle!=null &&
              this.documentTitle.equals(other.getDocumentTitle()))) &&
            ((this.currencyIsoCode==null && other.getCurrencyIsoCode()==null) || 
             (this.currencyIsoCode!=null &&
              this.currencyIsoCode.equals(other.getCurrencyIsoCode()))) &&
            ((this.transferDate==null && other.getTransferDate()==null) || 
             (this.transferDate!=null &&
              this.transferDate.equals(other.getTransferDate()))) &&
            ((this.batchTransferItems==null && other.getBatchTransferItems()==null) || 
             (this.batchTransferItems!=null &&
              java.util.Arrays.equals(this.batchTransferItems, other.getBatchTransferItems())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDocumentTitle() != null) {
            _hashCode += getDocumentTitle().hashCode();
        }
        if (getCurrencyIsoCode() != null) {
            _hashCode += getCurrencyIsoCode().hashCode();
        }
        if (getTransferDate() != null) {
            _hashCode += getTransferDate().hashCode();
        }
        if (getBatchTransferItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatchTransferItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBatchTransferItems(), i);
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
        new org.apache.axis.description.TypeDesc(BatchTransferMoneyInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferMoneyInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
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
        elemField.setFieldName("documentTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "DocumentTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyIsoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "CurrencyIsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "TransferDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchTransferItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "BatchTransferItemInfo"));
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
