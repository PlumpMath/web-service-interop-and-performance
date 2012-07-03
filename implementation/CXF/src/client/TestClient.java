package client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.Arrays;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.BeforeClass;
import org.junit.Test;

import server.GroupAddUserRequest;
import server.GroupAddUserResponse;
import server.GroupCreationRequest;
import server.GroupCreationResponse;
import server.GroupDeleteUserRequest;
import server.GroupDeleteUserResponse;
import server.GroupDeletionRequest;
import server.GroupDeletionResponse;
import server.GroupInfoRequest;
import server.GroupInfoResponse;
import server.UserCreationRequest;
import server.UserCreationResponse;
import server.UserDeletionRequest;
import server.UserDeletionResponse;
import server.UserInfo;
import server.UserInfoRequest;
import server.UserServicePortType;

public class TestClient {
	
	public static UserServicePortType stub = null;
	
	@BeforeClass
	public static void setupClass() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.getInInterceptors().add(new LoggingInInterceptor());
		factory.getOutInterceptors().add(new LoggingOutInterceptor());
		factory.setServiceClass(UserServicePortType.class);
		// factory.setAddress("http://localhost:8080/axis2/services/UserService");
		// factory.setAddress("http://192.168.0.100:8080/METRO_USER_SERVICE/UserServicePortTypeImplService");
		// factory.setAddress("http://192.168.0.100/soap/server.php");
		// factory.setAddress("http://192.168.0.100:9000/userservice");
		factory.setAddress("http://192.168.0.101:9000/UserService/Service/userservice");
		stub = (UserServicePortType) factory.create();

	}
	
	@Test
	public void testAll() throws RemoteException {
		// testing GetUser with false parameters
		// create request
		UserInfoRequest UIrequest = new UserInfoRequest();
		UIrequest.setUsername("otto");
		// send request and evaluate response
		UserInfo UIresponse = stub.getUserInfo(UIrequest);
		assertEquals(UIresponse.getFirstname(), "null");
		assertEquals(UIresponse.getLastname(), "null");
		assertFalse(UIresponse.isGender());
		assertEquals(UIresponse.getAge(), new BigInteger("1"));
		
		// testing GetUser and CreateUser with correct parameters
		// create the user
		UserCreationRequest UCrequest = new UserCreationRequest();
		UserCreationResponse UCresponse = new UserCreationResponse();
		UCrequest.setUsername("hansi");
		UCrequest.setFirstname("hans");
		UCrequest.setLastname("dampf");
		UCrequest.setGender(true);
		UCrequest.setAge(new BigInteger("23"));
		// create request
		UIrequest.setUsername("hansi");
		//send request and evaluate response
		UCresponse = stub.createUser(UCrequest);
		UIresponse = stub.getUserInfo(UIrequest);
		assertTrue(UCresponse.isResponse());
		assertEquals("hans", UIresponse.getFirstname());
		assertEquals("dampf", UIresponse.getLastname());
		assertTrue(UIresponse.isGender());
		assertEquals(new BigInteger("23"), UIresponse.getAge());
		
		
		// testing CreateUser with an username which is already taken
		// send request and evaluate response
		UCresponse = stub.createUser(UCrequest);
		assertFalse(UCresponse.isResponse());
		
		
		// testing DeleteUser with a non-existing username
		// create request
		UserDeletionRequest UDrequest = new UserDeletionRequest();
		UDrequest.setUsername("boah");
		// send request and evaluate response
		UserDeletionResponse UDresponse = stub.deleteUser(UDrequest);
		assertFalse(UDresponse.isResponse());
		
		
		// testing DeleteUser with existing user
		// create request
		UDrequest.setUsername("hansi");
		// send request and evaluate response
		UDresponse = stub.deleteUser(UDrequest);
		assertTrue(UDresponse.isResponse());
		
		// testing CreateGroup with correct parameters
		// create request
		GroupCreationRequest GCrequest = new GroupCreationRequest();
		GCrequest.setGroupname("helden");
		// send request and evaluate response
		GroupCreationResponse GCresponse = stub.createGroup(GCrequest);
		assertTrue(GCresponse.isResponse());
		
		
		// testing CreateGroup with an already existing groupname
		// send request and evaluate response
		GCresponse = stub.createGroup(GCrequest);
		assertFalse(GCresponse.isResponse());
		
		
		// testing GroupAddUser with correct parameters
		// create the needed user
		UCrequest.setUsername("tinker");
		UCrequest.setFirstname("hammer");
		UCrequest.setLastname("storm");
		UCrequest.setGender(true);
		UCrequest.setAge(new BigInteger("30"));
		stub.createUser(UCrequest);
		// create request
		GroupAddUserRequest GAUrequest = new GroupAddUserRequest();
		GAUrequest.setUsername("tinker");
		GAUrequest.setGroupname("helden");
		// send request and evaluate response
		GroupAddUserResponse GAUresponse = new GroupAddUserResponse();
		GAUresponse = stub.groupAddUser(GAUrequest);
		assertTrue(GAUresponse.isResponse());
		
		
		// testing GroupDeleteUser with correct parameters
		// create request
		GroupDeleteUserRequest GDUrequest = new GroupDeleteUserRequest();
		GDUrequest.setGroupname("helden");
		GDUrequest.setUsername("tinker");
		// send request and evaluate results
		GroupDeleteUserResponse GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertTrue(GDUresponse.isResponse());
		
		
		// testing GroupAddUser with non-existing user
		GAUrequest.setUsername("whatever");
		GAUresponse = stub.groupAddUser(GAUrequest);
		assertFalse(GAUresponse.isResponse());
		
		
		// testing GroupAddUser with non-existing group
		GAUrequest.setUsername("tinker");
		GAUrequest.setGroupname("whatever");
		GAUresponse = stub.groupAddUser(GAUrequest);
		assertFalse(GAUresponse.isResponse());
		
		
		// testing GroupDeleteUser with non-existing user
		GDUrequest.setUsername("whatever");
		GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertFalse(GDUresponse.isResponse());
		
		
		// testing GroupDeleteUser with non-existing group
		GDUrequest.setUsername("tinker");
		GDUrequest.setGroupname("whatever");
		GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertFalse(GDUresponse.isResponse());
		
		
		// testing GetGroupInfo with correct parameters
		// creating user
		stub.createUser(UCrequest);
		// adding user to group
		GAUrequest.setUsername("tinker");
		GAUrequest.setGroupname("helden");
		stub.groupAddUser(GAUrequest);
		// create request
		GroupInfoRequest GIrequest = new GroupInfoRequest();
		GIrequest.setGroupname("helden");
		// send request and evaluate results
		GroupInfoResponse GIresponse = stub.getGroupInfo(GIrequest);
		assertTrue(GIresponse.getUserlist().size() == 1 && GIresponse.getUserlist().contains("tinker"));

		
		// testing GetGroupInfo with incorrect parameters
		GIrequest.setGroupname("whatever");
		GIresponse = stub.getGroupInfo(GIrequest);
		assertTrue((GIresponse.getUserlist() == null) || (GIresponse.getUserlist().size() == 0));
		
		
		// testing DeleteGroup with correct parameters
		GCrequest.setGroupname("baem");
		GroupDeletionRequest GDrequest = new GroupDeletionRequest();
		GroupDeletionResponse GDresponse = new GroupDeletionResponse();
		GDrequest.setGroupname("baem");
		stub.createGroup(GCrequest);
		GDresponse = stub.deleteGroup(GDrequest);
		assertTrue(GDresponse.isResponse());
		
		
		// testing DeleteGroup with incorrect parameters
		GDrequest.setGroupname("whatever");
		GDresponse = stub.deleteGroup(GDrequest);
		assertFalse(GDresponse.isResponse());
		
	}
}
