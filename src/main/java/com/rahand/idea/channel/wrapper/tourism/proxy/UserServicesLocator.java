/**
 * UserServicesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rahand.idea.channel.wrapper.tourism.proxy;

public class UserServicesLocator extends org.apache.axis.client.Service implements UserServices {

    public UserServicesLocator() {
    }


    public UserServicesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserServicesLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserServicesSoap
    private String UserServicesSoap_address = "http://ibank.tourism-bank.com:8442/webservices/userservices.asmx";

    public String getUserServicesSoapAddress() {
        return UserServicesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String UserServicesSoapWSDDServiceName = "UserServicesSoap";

    public String getUserServicesSoapWSDDServiceName() {
        return UserServicesSoapWSDDServiceName;
    }

    public void setUserServicesSoapWSDDServiceName(String name) {
        UserServicesSoapWSDDServiceName = name;
    }

    public UserServicesSoap getUserServicesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServicesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServicesSoap(endpoint);
    }

    public UserServicesSoap getUserServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            UserServicesSoapStub _stub = new UserServicesSoapStub(portAddress, this);
            _stub.setPortName(getUserServicesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServicesSoapEndpointAddress(String address) {
        UserServicesSoap_address = address;
    }


    // Use to get a proxy class for UserServicesSoap12
    private String UserServicesSoap12_address = "http://ibank.tourism-bank.com:8442/webservices/userservices.asmx";

    public String getUserServicesSoap12Address() {
        return UserServicesSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String UserServicesSoap12WSDDServiceName = "UserServicesSoap12";

    public String getUserServicesSoap12WSDDServiceName() {
        return UserServicesSoap12WSDDServiceName;
    }

    public void setUserServicesSoap12WSDDServiceName(String name) {
        UserServicesSoap12WSDDServiceName = name;
    }

    public UserServicesSoap getUserServicesSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserServicesSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserServicesSoap12(endpoint);
    }

    public UserServicesSoap getUserServicesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            UserServicesSoap12Stub _stub = new UserServicesSoap12Stub(portAddress, this);
            _stub.setPortName(getUserServicesSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserServicesSoap12EndpointAddress(String address) {
        UserServicesSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (UserServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                UserServicesSoapStub _stub = new UserServicesSoapStub(new java.net.URL(UserServicesSoap_address), this);
                _stub.setPortName(getUserServicesSoapWSDDServiceName());
                return _stub;
            }
            if (UserServicesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                UserServicesSoap12Stub _stub = new UserServicesSoap12Stub(new java.net.URL(UserServicesSoap12_address), this);
                _stub.setPortName(getUserServicesSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("UserServicesSoap".equals(inputPortName)) {
            return getUserServicesSoap();
        }
        else if ("UserServicesSoap12".equals(inputPortName)) {
            return getUserServicesSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserServices");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserServicesSoap"));
            ports.add(new javax.xml.namespace.QName("http://ibank.toranj.fanap.co.ir/UserServices", "UserServicesSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("UserServicesSoap".equals(portName)) {
            setUserServicesSoapEndpointAddress(address);
        }
        else 
if ("UserServicesSoap12".equals(portName)) {
            setUserServicesSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
