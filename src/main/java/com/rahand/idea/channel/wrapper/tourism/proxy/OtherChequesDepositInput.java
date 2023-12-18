/**
 * OtherChequesDepositInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class OtherChequesDepositInput  extends BaseInput implements java.io.Serializable {
    private String userName;

    private OtherChequesDepositItemInfo[] chequesDepositItemInfos;

    public OtherChequesDepositInput() {
    }

    public OtherChequesDepositInput(
           String brokerId,
           String timestamp,
           String inputSignature,
           String clientAddress,
           String originalAddress,
           String userName,
           OtherChequesDepositItemInfo[] chequesDepositItemInfos) {
        super(
            brokerId,
            timestamp,
            inputSignature,
            clientAddress,
            originalAddress);
        this.userName = userName;
        this.chequesDepositItemInfos = chequesDepositItemInfos;
    }


    /**
     * Gets the userName value for this OtherChequesDepositInput.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this OtherChequesDepositInput.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }


    /**
     * Gets the chequesDepositItemInfos value for this OtherChequesDepositInput.
     * 
     * @return chequesDepositItemInfos
     */
    public OtherChequesDepositItemInfo[] getChequesDepositItemInfos() {
        return chequesDepositItemInfos;
    }


    /**
     * Sets the chequesDepositItemInfos value for this OtherChequesDepositInput.
     * 
     * @param chequesDepositItemInfos
     */
    public void setChequesDepositItemInfos(OtherChequesDepositItemInfo[] chequesDepositItemInfos) {
        this.chequesDepositItemInfos = chequesDepositItemInfos;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OtherChequesDepositInput)) return false;
        OtherChequesDepositInput other = (OtherChequesDepositInput) obj;
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
            ((this.chequesDepositItemInfos==null && other.getChequesDepositItemInfos()==null) || 
             (this.chequesDepositItemInfos!=null &&
              java.util.Arrays.equals(this.chequesDepositItemInfos, other.getChequesDepositItemInfos())));
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
        if (getChequesDepositItemInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChequesDepositItemInfos());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChequesDepositItemInfos(), i);
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
        new org.apache.axis.description.TypeDesc(OtherChequesDepositInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OtherChequesDepositInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chequesDepositItemInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "ChequesDepositItemInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OtherChequesDepositItemInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "OtherChequesDepositItemInfo"));
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
