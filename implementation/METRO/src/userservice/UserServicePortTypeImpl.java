package userservice;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jws.WebService;

@WebService(endpointInterface="userservice.UserServicePortType")
public class UserServicePortTypeImpl implements UserServicePortType {
	
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
	private static final CopyOnWriteArrayList<User> users = new CopyOnWriteArrayList<User>();
	
	/** List containing all groups */
	private static final CopyOnWriteArrayList<Group> groups = new CopyOnWriteArrayList<Group>();

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
	 * #### SERVICE METHODS ####
	 */
	
	@Override
	public GroupCreationResponse createGroup(GroupCreationRequest body) {
		GroupCreationResponse response = new GroupCreationResponse();
		response.setResponse(addGroup(body.getGroupname()));
		return response;
	}

	@Override
	public UserCreationResponse createUser(UserCreationRequest body) {
		UserCreationResponse response = new UserCreationResponse();
		response.setResponse(addUser(body.getUsername(), body.getFirstname(), body.getLastname(), body.getAge().intValue(), body.isGender()));
		return response;
	}

	@Override
	public GroupDeletionResponse deleteGroup(GroupDeletionRequest body) {
		GroupDeletionResponse response = new GroupDeletionResponse();
		response.setResponse(removeGroup(body.getGroupname()));
		return response;
	}

	@Override
	public UserDeletionResponse deleteUser(UserDeletionRequest body) {
		UserDeletionResponse response = new UserDeletionResponse();
		response.setResponse(removeUser(body.getUsername()));
		return response;
	}

	@Override
	public GroupInfoResponse getGroupInfo(GroupInfoRequest body) {
		GroupInfoResponse response = new GroupInfoResponse();
		Group group = getGroup(body.getGroupname());
		if (group == null) {
			response.getUserlist();
			return response;
		}
		response.getUserlist();
		for (User user : group.getUsers()) {
			response.getUserlist().add(user.getUsername());
		}
		return response;
	}

	@Override
	public UserInfo getUserInfo(UserInfoRequest body) {
		User user = getUser(body.getUsername());
		if (user == null) {
			UserInfo empty = new UserInfo();
			empty.setFirstname("null");
			empty.setLastname("null");
			empty.setGender(false);
			empty.setAge(BigInteger.valueOf(1));
			return empty;
		} else {
			UserInfo response = new UserInfo();
			response.setFirstname(user.getFirstname());
			response.setLastname(user.getLastname());
			response.setGender(user.getGender());
			response.setAge(BigInteger.valueOf(user.getAge()));
			return response;
		}
	}

	@Override
	public GroupAddUserResponse groupAddUser(GroupAddUserRequest body) {
		GroupAddUserResponse response = new GroupAddUserResponse();
		response.setResponse(addUserToGroup(body.getUsername(), body.getGroupname()));
		return response;
	}

	@Override
	public GroupDeleteUserResponse groupDeleteUser(GroupDeleteUserRequest body) {
		GroupDeleteUserResponse response = new GroupDeleteUserResponse();
		response.setResponse(removeUserFromGroup(body.getUsername(), body.getGroupname()));
		return response;
	}

}
