/**
 * UserDepositAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy.signature;

public class UserDepositAmount  implements java.io.Serializable {
    private String depositNumber;

    private UserAmountInfo[] amounts;

    private UserAmountInfo[] withdrawableAmounts;

    public UserDepositAmount() {
    }

    public UserDepositAmount(
           String depositNumber,
           UserAmountInfo[] amounts,
           UserAmountInfo[] withdrawableAmounts) {
           this.depositNumber = depositNumber;
           this.amounts = amounts;
           this.withdrawableAmounts = withdrawableAmounts;
    }


    /**
     * Gets the depositNumber value for this UserDepositAmount.
     * 
     * @return depositNumber
     */
    public String getDepositNumber() {
        return depositNumber;
    }


    /**
     * Sets the depositNumber value for this UserDepositAmount.
     * 
     * @param depositNumber
     */
    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }


    /**
     * Gets the amounts value for this UserDepositAmount.
     * 
     * @return amounts
     */
    public UserAmountInfo[] getAmounts() {
        return amounts;
    }


    /**
     * Sets the amounts value for this UserDepositAmount.
     * 
     * @param amounts
     */
    public void setAmounts(UserAmountInfo[] amounts) {
        this.amounts = amounts;
    }


    /**
     * Gets the withdrawableAmounts value for this UserDepositAmount.
     * 
     * @return withdrawableAmounts
     */
    public UserAmountInfo[] getWithdrawableAmounts() {
        return withdrawableAmounts;
    }


    /**
     * Sets the withdrawableAmounts value for this UserDepositAmount.
     * 
     * @param withdrawableAmounts
     */
    public void setWithdrawableAmounts(UserAmountInfo[] withdrawableAmounts) {
        this.withdrawableAmounts = withdrawableAmounts;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UserDepositAmount)) return false;
        UserDepositAmount other = (UserDepositAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.depositNumber==null && other.getDepositNumber()==null) || 
             (this.depositNumber!=null &&
              this.depositNumber.equals(other.getDepositNumber()))) &&
            ((this.amounts==null && other.getAmounts()==null) || 
             (this.amounts!=null &&
              java.util.Arrays.equals(this.amounts, other.getAmounts()))) &&
            ((this.withdrawableAmounts==null && other.getWithdrawableAmounts()==null) || 
             (this.withdrawableAmounts!=null &&
              java.util.Arrays.equals(this.withdrawableAmounts, other.getWithdrawableAmounts())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDepositNumber() != null) {
            _hashCode += getDepositNumber().hashCode();
        }
        if (getAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAmounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWithdrawableAmounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWithdrawableAmounts());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWithdrawableAmounts(), i);
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
        new org.apache.axis.description.TypeDesc(UserDepositAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserDepositAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "DepositNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "Amounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserAmountInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawableAmounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "WithdrawableAmounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserAmountInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.fanap.ir/SignatureService", "UserAmountInfo"));
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
