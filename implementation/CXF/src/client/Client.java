package client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import server.UserInfo;
import server.UserInfoRequest;
import server.UserServicePortType;

public class Client {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(UserServicePortType.class);
		factory.setAddress("http://localhost:9000/userservice");
		// factory.setAddress("http://192.168.0.105:8080/axis2/services/UserService");
		// factory.setAddress("http://192.168.0.106:8000/UserService/UserService");
		UserServicePortType client = (UserServicePortType) factory.create();
		
		UserInfoRequest request = new UserInfoRequest();
		request.setUsername("test");
		UserInfo reply = client.getUserInfo(request);
		System.out.println("Server said: " + reply.getFirstname());
		System.out.println("Server said: " + reply.getLastname());
		System.out.println("Server said: " + reply.isGender());
		System.exit(0);
	}
}
