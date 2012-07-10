/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package localhost.userservice_wsdl;

import java.math.BigInteger;
import java.util.ArrayList;

import localhost.userservice_xsd.GroupAddUserResponse;
import localhost.userservice_xsd.GroupCreationResponse;
import localhost.userservice_xsd.GroupDeleteUserResponse;
import localhost.userservice_xsd.GroupDeletionResponse;
import localhost.userservice_xsd.GroupInfoResponse;
import localhost.userservice_xsd.UserCreationResponse;
import localhost.userservice_xsd.UserDeletionResponse;
import localhost.userservice_xsd.UserInfo;

/**
 * UserServiceSkeleton java skeleton for the axisService
 */
public class UserServiceSkeleton {

	
	/*
	 * ### Model ###
	 */

	/**
	 * Simple user model
	 */
	static private class User {
		final String username, firstname, lastname;
		final int age;
		final boolean gender;

		public User(String username, String firstname, String lastname, int age, boolean gender) {
			this.username = username;
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			this.gender = gender;
		}

		public String getUsername() {
			return username;
		}

		public String getFirstname() {
			return firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public int getAge() {
			return age;
		}

		public boolean getGender() {
			return gender;
		}

		@Override
		public int hashCode() {
			return username.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof User)) {
				return super.equals(obj);
			}
			return username.equals(((User) obj).getUsername());
		}
	}

	/**
	 * Simple group model
	 */
	static private class Group {
		private final String groupname;
		private final ArrayList<User> users = new ArrayList<User>();

		public Group(String groupname) {
			this.groupname = groupname;
		}

		public String getGroupName() {
			return groupname;
		}

		public ArrayList<User> getUsers() {
			return users;
		}

		@Override
		public int hashCode() {
			return groupname.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Group)) {
				return super.equals(obj);
			}
			return groupname.equals(((Group) obj).getGroupName());
		}
	}

	/*
	 * ### CONTROL ###
	 */

	/** List containing all users */
	public static final ArrayList<User> users = new ArrayList<User>();
	
	/** List containing all groups */
	public static final ArrayList<Group> groups = new ArrayList<Group>();

	/**
	 * @param username the username of the user to find
	 * @return the user with the given username
	 */
	private User getUser(String username) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	/**
	 * @param groupname the group name of the group to find
	 * @return the group with the given group name
	 */
	private Group getGroup(String groupname) {
		for (Group group : groups) {
			if (group.getGroupName().equals(groupname)) {
				return group;
			}
		}
		return null;
	}

	/**
	 * Creates a new user.
	 * 
	 * @param username the username of the new user
	 * @param firstname the firstname of the new user
	 * @param lastname the lastname of the new user
	 * @param age the age of the new user
	 * @param gender the gender of the new user
	 * @return <code>true</code> if the user could be created, <code>false</code> if an user with this name already exists
	 */
	private boolean addUser(String username, String firstname, String lastname, int age, boolean gender) {
		if (null == getUser(username)) {
			users.add(new User(username, firstname, lastname, age, gender));
			return true;
		}
		return false;
	}

	/**
	 * Creates a new group.
	 * 
	 * @param groupname the name of the group to create
	 * @return <code>true</code> if the group could be created, <code>false</code> if a group with this name already exists
	 */
	private boolean addGroup(String groupname) {
		if (null == getGroup(groupname)) {
			groups.add(new Group(groupname));
			return true;
		}
		return false;
	}

	/**
	 * Adds the user with the given username to the specified group
	 * 
	 * @param username the username of the user to add to the group
	 * @param groupname the group name of the group to add the user to
	 * @return <code>true</code> if both the user and the group exist and if the user was not already member of the group, otherwise <code>false</code>
	 */
	private boolean addUserToGroup(String username, String groupname) {
		User user = null;
		if (null == (user = getUser(username))) {
			// User does not exist.
			return false;
		}
		Group group = null;
		if (null == (group = getGroup(groupname))) {
			// Group does not exist.
			return false;
		}
		if (group.getUsers().contains(user)) {
			// Group contains user already.
			return false;
		}

		// Add user to group.
		group.getUsers().add(user);
		return true;
	}

	/**
	 * Removes a user from a group.
	 * 
	 * @param username the username of the user to remove
	 * @param groupname the name of the group to remove the user from
	 * @return <code>true</code> if the user was removed from the group, <code>false</code> if the group did not contain the user
	 */
	private boolean removeUserFromGroup(String username, String groupname) {
		User user = null;
		if (null == (user = getUser(username))) {
			// User does not exist.
			return false;
		}
		Group group = null;
		if (null == (group = getGroup(groupname))) {
			// Group does not exist.
			return false;
		}
		// Remove from user.
		return group.getUsers().remove(user);
	}

	/**
	 * Deletes a user.
	 * 
	 * @param username the username of the user to delete
	 * @return <code>true</code> if the user could be deleted, <code>false</code> if there is no user with the specified name
	 */
	private boolean removeUser(String username) {
		User user = null;
		if (null == (user = getUser(username))) {
			// User does not exits.
			return false;
		}
		// Remove user from groups.
		for (Group group : groups) {
			group.getUsers().remove(user);
		}
		// Remove user from users.
		return users.remove(user);
	}

	/**
	 * Deletes a group.
	 * 
	 * @param groupname the name of the group to delete
	 * @return <code>true</code> if the group was found and deleted
	 */
	private boolean removeGroup(String groupname) {
		Group group = null;
		if (null == (group = getGroup(groupname))) {
			// Group does not exist.
			return false;
		}
		// Remove group.
		return groups.remove(group);
	}
	
	/*
	 * ### SERVICE METHODS ###
	 */

	/**
	 * Auto generated method signature
	 * 
	 * @param groupDeletionRequest
	 * @return groupDeletionResponse
	 */

	public localhost.userservice_xsd.GroupDeletionResponse deleteGroup(
			localhost.userservice_xsd.GroupDeletionRequest groupDeletionRequest) {
		GroupDeletionResponse response = new GroupDeletionResponse();
		response.setResponse(removeGroup(groupDeletionRequest.getGroupname()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param userCreationRequest
	 * @return userCreationResponse
	 */

	public localhost.userservice_xsd.UserCreationResponse createUser(
			localhost.userservice_xsd.UserCreationRequest userCreationRequest) {
		UserCreationResponse response = new UserCreationResponse();
		response.setResponse(addUser(userCreationRequest.getUsername(), 
										userCreationRequest.getFirstname(), 
										userCreationRequest.getLastname(), 
										userCreationRequest.getAge().intValue(), 
										userCreationRequest.getGender()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param groupInfoRequest
	 * @return groupInfoResponse
	 */

	public localhost.userservice_xsd.GroupInfoResponse getGroupInfo(
			localhost.userservice_xsd.GroupInfoRequest groupInfoRequest) {
		GroupInfoResponse response = new GroupInfoResponse();
		Group group = getGroup(groupInfoRequest.getGroupname());
		if (group == null) {
			return response;
		}
		ArrayList<String> userlist = new ArrayList<String>();
		for(User user : group.getUsers()) {
			userlist.add(user.getUsername());
		}
		String[] users = new String[userlist.size()];
		userlist.toArray(users);
		response.setUserlist(users);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param groupCreationRequest
	 * @return groupCreationResponse
	 */

	public localhost.userservice_xsd.GroupCreationResponse createGroup(
			localhost.userservice_xsd.GroupCreationRequest groupCreationRequest) {
		GroupCreationResponse response = new GroupCreationResponse();
		response.setResponse(addGroup(groupCreationRequest.getGroupname()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param userInfoRequest
	 * @return userInfo
	 */

	public localhost.userservice_xsd.UserInfo getUserInfo(
			localhost.userservice_xsd.UserInfoRequest userInfoRequest) {
		User user = getUser(userInfoRequest.getUsername());
		if (user == null) {
			UserInfo empty = new UserInfo();
			empty.setFirstname("null");
			empty.setLastname("null");
			empty.setGender(false);
			empty.setAge(BigInteger.valueOf(1));
			return empty;
		} else {
			UserInfo userInfo = new UserInfo();
			userInfo.setFirstname(user.getFirstname());
			userInfo.setLastname(user.getLastname());
			userInfo.setGender(user.getGender());
			userInfo.setAge(BigInteger.valueOf(user.getAge()));
			return userInfo;
		}
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param groupAddUserRequest
	 * @return groupAddUserResponse
	 */

	public localhost.userservice_xsd.GroupAddUserResponse groupAddUser(
			localhost.userservice_xsd.GroupAddUserRequest groupAddUserRequest) {
		GroupAddUserResponse response = new GroupAddUserResponse();
		response.setResponse(addUserToGroup(groupAddUserRequest.getUsername(), groupAddUserRequest.getGroupname()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param groupDeleteUserRequest
	 * @return groupDeleteUserResponse
	 */

	public localhost.userservice_xsd.GroupDeleteUserResponse groupDeleteUser(
			localhost.userservice_xsd.GroupDeleteUserRequest groupDeleteUserRequest) {
		GroupDeleteUserResponse response = new GroupDeleteUserResponse();
		response.setResponse(removeUserFromGroup(groupDeleteUserRequest.getUsername(), groupDeleteUserRequest.getGroupname()));
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param userDeletionRequest
	 * @return userDeletionResponse
	 */

	public localhost.userservice_xsd.UserDeletionResponse deleteUser(
			localhost.userservice_xsd.UserDeletionRequest userDeletionRequest) {
		UserDeletionResponse response = new UserDeletionResponse();
		response.setResponse(removeUser(userDeletionRequest.getUsername()));
		return response;
	}

}

