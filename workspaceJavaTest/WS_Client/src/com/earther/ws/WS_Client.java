package com.earther.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import javax.xml.ws.Service;

public class WS_Client {

	public static void main(String[] args) throws MalformedURLException, ServiceException, RemoteException {
		// TODO Auto-generated method stub
		 try {
			URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		    QName qname = new QName("http://ws.earther.com/", "HelloWorld_ImplService");
		 
		        Service service = Service.create(url, qname);
		 
		        HelloWorld_Interface hello = service.getPort(HelloWorld_Interface.class);
		 
		       
					System.out.println(hello.getHelloworld("mkyong"));
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
//		HelloWorld_ImplServiceLocator SL = new HelloWorld_ImplServiceLocator();
//		HelloWorld_Interface port = SL.getHelloWorld_ImplPort();
//		String returnStr = port.getHelloworld("Earther");
//		System.out.println(returnStr);    
	}

}
