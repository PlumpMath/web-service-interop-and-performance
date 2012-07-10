package localhost.userservice_wsdl;

import java.rmi.RemoteException;

import localhost.userservice_xsd.UserInfo;
import localhost.userservice_xsd.UserInfoRequest;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;


public class UserServiceClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserServiceStub stub = null;
		try {
			//stub = new UserServiceStub("http://localhost:8080/axis2/services/UserService");
			stub = new UserServiceStub("http://192.168.0.100:9000/userservice");		
			
			//stub._getServiceClient().getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP11Constants.SOAP_ENVELOPE_NAMESPACE_URI); 
			//stub._getServiceClient().getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);			

		} catch (AxisFault e) {
			e.printStackTrace();
			return;
		}

		// GET USER INFO
		// MAKE REQUEST
		UserInfoRequest request = new UserInfoRequest();
		request.setUsername("bla");
		// EXPECT RESPONSE
		UserInfo response = null;
		try {
			response = stub.getUserInfo(request);
		} catch (RemoteException e) {
			e.printStackTrace();
			return;
		}		
		System.out.println("First name: " + response.getFirstname());
		System.out.println("Last name: " + response.getLastname());
		System.out.println("Gender: " + (response.getGender() ? "male" : "female"));
		System.out.println("Age: " + response.getAge());
		
	}
}
