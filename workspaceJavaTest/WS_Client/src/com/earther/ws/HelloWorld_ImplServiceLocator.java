/**
 * HelloWorld_ImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.earther.ws;

public class HelloWorld_ImplServiceLocator extends org.apache.axis.client.Service implements com.earther.ws.HelloWorld_ImplService {

    public HelloWorld_ImplServiceLocator() {
    }


    public HelloWorld_ImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HelloWorld_ImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorld_ImplPort
    private java.lang.String HelloWorld_ImplPort_address = "http://localhost:9999/ws/hello";

    public java.lang.String getHelloWorld_ImplPortAddress() {
        return HelloWorld_ImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorld_ImplPortWSDDServiceName = "HelloWorld_ImplPort";

    public java.lang.String getHelloWorld_ImplPortWSDDServiceName() {
        return HelloWorld_ImplPortWSDDServiceName;
    }

    public void setHelloWorld_ImplPortWSDDServiceName(java.lang.String name) {
        HelloWorld_ImplPortWSDDServiceName = name;
    }

    public com.earther.ws.HelloWorld_Interface getHelloWorld_ImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorld_ImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorld_ImplPort(endpoint);
    }

    public com.earther.ws.HelloWorld_Interface getHelloWorld_ImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.earther.ws.HelloWorld_ImplPortBindingStub _stub = new com.earther.ws.HelloWorld_ImplPortBindingStub(portAddress, this);
            _stub.setPortName(getHelloWorld_ImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorld_ImplPortEndpointAddress(java.lang.String address) {
        HelloWorld_ImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.earther.ws.HelloWorld_Interface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.earther.ws.HelloWorld_ImplPortBindingStub _stub = new com.earther.ws.HelloWorld_ImplPortBindingStub(new java.net.URL(HelloWorld_ImplPort_address), this);
                _stub.setPortName(getHelloWorld_ImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorld_ImplPort".equals(inputPortName)) {
            return getHelloWorld_ImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.earther.com/", "HelloWorld_ImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.earther.com/", "HelloWorld_ImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorld_ImplPort".equals(portName)) {
            setHelloWorld_ImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
