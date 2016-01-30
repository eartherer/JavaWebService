package com.earther.ws;

public class HelloWorld_InterfaceProxy implements com.earther.ws.HelloWorld_Interface {
  private String _endpoint = null;
  private com.earther.ws.HelloWorld_Interface helloWorld_Interface = null;
  
  public HelloWorld_InterfaceProxy() {
    _initHelloWorld_InterfaceProxy();
  }
  
  public HelloWorld_InterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorld_InterfaceProxy();
  }
  
  private void _initHelloWorld_InterfaceProxy() {
    try {
      helloWorld_Interface = (new com.earther.ws.HelloWorld_ImplServiceLocator()).getHelloWorld_ImplPort();
      if (helloWorld_Interface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld_Interface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld_Interface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld_Interface != null)
      ((javax.xml.rpc.Stub)helloWorld_Interface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.earther.ws.HelloWorld_Interface getHelloWorld_Interface() {
    if (helloWorld_Interface == null)
      _initHelloWorld_InterfaceProxy();
    return helloWorld_Interface;
  }
  
  public java.lang.String getHelloworld(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWorld_Interface == null)
      _initHelloWorld_InterfaceProxy();
    return helloWorld_Interface.getHelloworld(arg0);
  }
  
  
}