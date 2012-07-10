package localhost.userservice_wsdl;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.util.Arrays;

import localhost.userservice_xsd.*;

import org.apache.axis2.AxisFault;
import org.junit.*;

public class ClientUserTest {
	
	public static UserServiceStub stub = null;
	
	@BeforeClass
	public static void setupClass() throws AxisFault {
		stub = new UserServiceStub("http://192.168.0.101:9000/UserService/Service/userservice");
		//stub = new UserServiceStub("http://192.168.0.100:80/soap/server.php");
		//stub = new UserServiceStub("http://192.168.0.100:9000/userservice");
		//stub = new UserServiceStub("http://10.42.43.1:8080/axis2/services/UserService");
		//stub = new UserServiceStub("http://192.168.0.100:9000/METRO_USER_SERVICE/UserServicePortTypeImplService");
		//stub = new UserServiceStub("http://localhost:9000/userservice/userservice");
		//stub = new UserServiceStub("http://localhost:8080/axis2/services/UserService");
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
		assertFalse(UIresponse.getGender());
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
		assertTrue(UCresponse.getResponse());
		assertEquals("hans", UIresponse.getFirstname());
		assertEquals("dampf", UIresponse.getLastname());
		assertTrue(UIresponse.getGender());
		assertEquals(new BigInteger("23"), UIresponse.getAge());
		
		
		// testing CreateUser with an username which is already taken
		// send request and evaluate response
		UCresponse = stub.createUser(UCrequest);
		assertFalse(UCresponse.getResponse());
		
		
		// testing DeleteUser with a non-existing username
		// create request
		UserDeletionRequest UDrequest = new UserDeletionRequest();
		UDrequest.setUsername("boah");
		// send request and evaluate response
		UserDeletionResponse UDresponse = stub.deleteUser(UDrequest);
		assertFalse(UDresponse.getResponse());
		
		
		// testing DeleteUser with existing user
		// create request
		UDrequest.setUsername("hansi");
		// send request and evaluate response
		UDresponse = stub.deleteUser(UDrequest);
		assertTrue(UDresponse.getResponse());
		
		// testing CreateGroup with correct parameters
		// create request
		GroupCreationRequest GCrequest = new GroupCreationRequest();
		GCrequest.setGroupname("helden");
		// send request and evaluate response
		GroupCreationResponse GCresponse = stub.createGroup(GCrequest);
		assertTrue(GCresponse.getResponse());
		
		
		// testing CreateGroup with an already existing groupname
		// send request and evaluate response
		GCresponse = stub.createGroup(GCrequest);
		assertFalse(GCresponse.getResponse());
		
		
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
		assertTrue(GAUresponse.getResponse());
		
		
		// testing GroupDeleteUser with correct parameters
		// create request
		GroupDeleteUserRequest GDUrequest = new GroupDeleteUserRequest();
		GDUrequest.setGroupname("helden");
		GDUrequest.setUsername("tinker");
		// send request and evaluate results
		GroupDeleteUserResponse GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertTrue(GDUresponse.getResponse());
		
		
		// testing GroupAddUser with non-existing user
		GAUrequest.setUsername("whatever");
		GAUresponse = stub.groupAddUser(GAUrequest);
		assertFalse(GAUresponse.getResponse());
		
		
		// testing GroupAddUser with non-existing group
		GAUrequest.setUsername("tinker");
		GAUrequest.setGroupname("whatever");
		GAUresponse = stub.groupAddUser(GAUrequest);
		assertFalse(GAUresponse.getResponse());
		
		
		// testing GroupDeleteUser with non-existing user
		GDUrequest.setUsername("whatever");
		GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertFalse(GDUresponse.getResponse());
		
		
		// testing GroupDeleteUser with non-existing group
		GDUrequest.setUsername("tinker");
		GDUrequest.setGroupname("whatever");
		GDUresponse = stub.groupDeleteUser(GDUrequest);
		assertFalse(GDUresponse.getResponse());
		
		
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
		String[] userlist = { "tinker" };
		assertTrue(Arrays.deepEquals(GIresponse.getUserlist(), userlist));

		
		// testing GetGroupInfo with incorrect parameters
		GIrequest.setGroupname("whatever");
		GIresponse = stub.getGroupInfo(GIrequest);
		assertTrue(GIresponse.getUserlist() == null);
		
		
		// testing DeleteGroup with correct parameters
		GCrequest.setGroupname("baem");
		GroupDeletionRequest GDrequest = new GroupDeletionRequest();
		GroupDeletionResponse GDresponse = new GroupDeletionResponse();
		GDrequest.setGroupname("baem");
		stub.createGroup(GCrequest);
		GDresponse = stub.deleteGroup(GDrequest);
		assertTrue(GDresponse.getResponse());
		
		
		// testing DeleteGroup with incorrect parameters
		GDrequest.setGroupname("whatever");
		GDresponse = stub.deleteGroup(GDrequest);
		assertFalse(GDresponse.getResponse());
		
	}
}
