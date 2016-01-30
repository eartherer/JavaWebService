import javax.xml.ws.Endpoint;

import com.earther.ws.HelloWorld_Impl;

public class Publisher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorld_Impl());
	}

}
