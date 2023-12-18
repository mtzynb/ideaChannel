/**
 * OrganizationChargeReportInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class OrganizationChargeReportInput  extends BaseInput implements java.io.Serializable {
    private String username;

    private long accountCode;

    private String chargeDateFrom;

    private String chargeDateTo;

    private int firstResult;

    private int maxResult;

    private long organizationCode;

    public OrganizationChargeReportInput() {
    }

    public OrganizationChargeReportInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String username,
           long accountCode,
           String chargeDateFrom,
           String chargeDateTo,
           int firstResult,
           int maxResult,
           long organizationCode) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.username = username;
        this.accountCode = accountCode;
        this.chargeDateFrom = chargeDateFrom;
        this.chargeDateTo = chargeDateTo;
        this.firstResult = firstResult;
        this.maxResult = maxResult;
        this.organizationCode = organizationCode;
    }


    /**
     * Gets the username value for this OrganizationChargeReportInput.
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this OrganizationChargeReportInput.
     * 
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Gets the accountCode value for this OrganizationChargeReportInput.
     * 
     * @return accountCode
     */
    public long getAccountCode() {
        return accountCode;
    }


    /**
     * Sets the accountCode value for this OrganizationChargeReportInput.
     * 
     * @param accountCode
     */
    public void setAccountCode(long accountCode) {
        this.accountCode = accountCode;
    }


    /**
     * Gets the chargeDateFrom value for this OrganizationChargeReportInput.
     * 
     * @return chargeDateFrom
     */
    public String getChargeDateFrom() {
        return chargeDateFrom;
    }


    /**
     * Sets the chargeDateFrom value for this OrganizationChargeReportInput.
     * 
     * @param chargeDateFrom
     */
    public void setChargeDateFrom(String chargeDateFrom) {
        this.chargeDateFrom = chargeDateFrom;
    }


    /**
     * Gets the chargeDateTo value for this OrganizationChargeReportInput.
     * 
     * @return chargeDateTo
     */
    public String getChargeDateTo() {
        return chargeDateTo;
    }


    /**
     * Sets the chargeDateTo value for this OrganizationChargeReportInput.
     * 
     * @param chargeDateTo
     */
    public void setChargeDateTo(String chargeDateTo) {
        this.chargeDateTo = chargeDateTo;
    }


    /**
     * Gets the firstResult value for this OrganizationChargeReportInput.
     * 
     * @return firstResult
     */
    public int getFirstResult() {
        return firstResult;
    }


    /**
     * Sets the firstResult value for this OrganizationChargeReportInput.
     * 
     * @param firstResult
     */
    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }


    /**
     * Gets the maxResult value for this OrganizationChargeReportInput.
     * 
     * @return maxResult
     */
    public int getMaxResult() {
        return maxResult;
    }


    /**
     * Sets the maxResult value for this OrganizationChargeReportInput.
     * 
     * @param maxResult
     */
    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }


    /**
     * Gets the organizationCode value for this OrganizationChargeReportInput.
     * 
     * @return organizationCode
     */
    public long getOrganizationCode() {
        return organizationCode;
    }


    /**
     * Sets the organizationCode value for this OrganizationChargeReportInput.
     * 
     * @param organizationCode
     */
    public void setOrganizationCode(long organizationCode) {
        this.organizationCode = organizationCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrganizationChargeReportInput)) return false;
        OrganizationChargeReportInput other = (OrganizationChargeReportInput) obj;
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
            this.accountCode == other.getAccountCode() &&
            ((this.chargeDateFrom==null && other.getChargeDateFrom()==null) || 
             (this.chargeDateFrom!=null &&
              this.chargeDateFrom.equals(other.getChargeDateFrom()))) &&
            ((this.chargeDateTo==null && other.getChargeDateTo()==null) || 
             (this.chargeDateTo!=null &&
              this.chargeDateTo.equals(other.getChargeDateTo()))) &&
            this.firstResult == other.getFirstResult() &&
            this.maxResult == other.getMaxResult() &&
            this.organizationCode == other.getOrganizationCode();
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
        _hashCode += new Long(getAccountCode()).hashCode();
        if (getChargeDateFrom() != null) {
            _hashCode += getChargeDateFrom().hashCode();
        }
        if (getChargeDateTo() != null) {
            _hashCode += getChargeDateTo().hashCode();
        }
        _hashCode += getFirstResult();
        _hashCode += getMaxResult();
        _hashCode += new Long(getOrganizationCode()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrganizationChargeReportInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationChargeReportInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "AccountCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDateFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChargeDateFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeDateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChargeDateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "FirstResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "MaxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OrganizationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
