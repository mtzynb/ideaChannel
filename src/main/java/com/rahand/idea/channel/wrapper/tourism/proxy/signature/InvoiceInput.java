/**
 * InvoiceInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy.signature;

public class InvoiceInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private String depositNumber;

    private String sheba;

    private String count;

    private String startDate;

    private String endDate;

    private String firstIndex;

    private Boolean isAscendingByDate;

    private boolean isContainTimeFilter;

    public InvoiceInput() {
    }

    public InvoiceInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           String depositNumber,
           String sheba,
           String count,
           String startDate,
           String endDate,
           String firstIndex,
           Boolean isAscendingByDate,
           boolean isContainTimeFilter) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.depositNumber = depositNumber;
        this.sheba = sheba;
        this.count = count;
        this.startDate = startDate;
        this.endDate = endDate;
        this.firstIndex = firstIndex;
        this.isAscendingByDate = isAscendingByDate;
        this.isContainTimeFilter = isContainTimeFilter;
    }


    /**
     * Gets the username value for this InvoiceInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this InvoiceInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the depositNumber value for this InvoiceInput.
     * 
     * @return depositNumber
     */
    public String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this InvoiceInput.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the sheba value for this InvoiceInput.
     * 
     * @return sheba
     */
    public String getSheba() {
        return sheba;
    }


    /**
     * Sets the sheba value for this InvoiceInput.
     * 
     * @param sheba
     */
    public void setSheba(String sheba) {
        this.sheba = sheba;
    }


    /**
     * Gets the count value for this InvoiceInput.
     * 
     * @return count
     */
    public String getCount() {
        return count;
    }


    /**
     * Sets the count value for this InvoiceInput.
     * 
     * @param count
     */
    public void setCount(String count) {
        this.count = count;
    }


    /**
     * Gets the startDate value for this InvoiceInput.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this InvoiceInput.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this InvoiceInput.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this InvoiceInput.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the firstIndex value for this InvoiceInput.
     * 
     * @return firstIndex
     */
    public String getFirstIndex() {
        return firstIndex;
    }


    /**
     * Sets the firstIndex value for this InvoiceInput.
     * 
     * @param firstIndex
     */
    public void setFirstIndex(String firstIndex) {
        this.firstIndex = firstIndex;
    }


    /**
     * Gets the isAscendingByDate value for this InvoiceInput.
     * 
     * @return isAscendingByDate
     */
    public Boolean getIsAscendingByDate() {
        return isAscendingByDate;
    }


    /**
     * Sets the isAscendingByDate value for this InvoiceInput.
     * 
     * @param isAscendingByDate
     */
    public void setIsAscendingByDate(Boolean isAscendingByDate) {
        this.isAscendingByDate = isAscendingByDate;
    }


    /**
     * Gets the isContainTimeFilter value for this InvoiceInput.
     * 
     * @return isContainTimeFilter
     */
    public boolean isIsContainTimeFilter() {
        return isContainTimeFilter;
    }


    /**
     * Sets the isContainTimeFilter value for this InvoiceInput.
     * 
     * @param isContainTimeFilter
     */
    public void setIsContainTimeFilter(boolean isContainTimeFilter) {
        this.isContainTimeFilter = isContainTimeFilter;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InvoiceInput)) return false;
        InvoiceInput other = (InvoiceInput) obj;
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
            ((this.sheba==null && other.getSheba()==null) || 
             (this.sheba!=null &&
              this.sheba.equals(other.getSheba()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.firstIndex==null && other.getFirstIndex()==null) || 
             (this.firstIndex!=null &&
              this.firstIndex.equals(other.getFirstIndex()))) &&
            ((this.isAscendingByDate==null && other.getIsAscendingByDate()==null) || 
             (this.isAscendingByDate!=null &&
              this.isAscendingByDate.equals(other.getIsAscendingByDate()))) &&
            this.isContainTimeFilter == other.isIsContainTimeFilter();
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
        if (getSheba() != null) {
            _hashCode += getSheba().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFirstIndex() != null) {
            _hashCode += getFirstIndex().hashCode();
        }
        if (getIsAscendingByDate() != null) {
            _hashCode += getIsAscendingByDate().hashCode();
        }
        _hashCode += (isIsContainTimeFilter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "InvoiceInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "DepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sheba");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "Sheba"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "FirstIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAscendingByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "IsAscendingByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isContainTimeFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "IsContainTimeFilter"));
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
