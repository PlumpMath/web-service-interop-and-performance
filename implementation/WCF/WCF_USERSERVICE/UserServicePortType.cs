namespace WCF_USERSERVICE
{
    using System.Collections;
    using System;

    /* User data model */
    public class User
    {
        public string username;
        public string firstname;
        public string lastname;
        public bool gender;
        public int age;
    }

    /* Group data model */
    public class Group
    {
        public string groupname;
        public ArrayList users = new ArrayList();
    }
    
    /* Service implementation */
    [System.ServiceModel.ServiceBehaviorAttribute(InstanceContextMode=System.ServiceModel.InstanceContextMode.PerCall, ConcurrencyMode=System.ServiceModel.ConcurrencyMode.Single)]
    public class UserServicePortType : IUserServicePortType
    {
        static private ArrayList users = new ArrayList();
        static private ArrayList groups = new ArrayList();
        
        public virtual GetUserInfoResponse GetUserInfo(GetUserInfoRequest request)
        {
            User user = FindUser(request.UserInfoRequest.username);
            GetUserInfoResponse response = new GetUserInfoResponse();
            response.UserInfo = new UserInfo();
            if (null == user)
            {
                response.UserInfo.firstname = "null";
                response.UserInfo.lastname = "null";
                response.UserInfo.gender = false;
                response.UserInfo.age = "1";
                return response;
            }

            response.UserInfo.firstname = user.firstname;
            response.UserInfo.lastname = user.lastname;
            response.UserInfo.gender = user.gender;
            response.UserInfo.age = user.age.ToString();
            return response;
        }
        
        public virtual DeleteUserResponse DeleteUser(DeleteUserRequest request)
        {
            bool result = RemoveUser(request.UserDeletionRequest.username);
            DeleteUserResponse response = new DeleteUserResponse();
            response.UserDeletionResponse = new UserDeletionResponse();
            response.UserDeletionResponse.response = result;
            return response;
        }
        
        public virtual CreateUserResponse CreateUser(CreateUserRequest request)
        {
            UserCreationRequest rq = request.UserCreationRequest;
            bool result = AddUser(rq.username, rq.firstname, rq.lastname, rq.gender, Convert.ToInt32(rq.age));

            CreateUserResponse response = new CreateUserResponse();
            response.UserCreationResponse = new UserCreationResponse();
            response.UserCreationResponse.response = result;
            return response;
        }
        
        public virtual CreateGroupResponse CreateGroup(CreateGroupRequest request)
        {
            bool result = AddGroup(request.GroupCreationRequest.groupname);
            CreateGroupResponse response = new CreateGroupResponse();
            response.GroupCreationResponse = new GroupCreationResponse();
            response.GroupCreationResponse.response = result;
            return response;
        }
        
        public virtual DeleteGroupResponse DeleteGroup(DeleteGroupRequest request)
        {
            bool result = RemoveGroup(request.GroupDeletionRequest.groupname);
            DeleteGroupResponse response = new DeleteGroupResponse();
            response.GroupDeletionResponse = new GroupDeletionResponse();
            response.GroupDeletionResponse.response = result;
            return response;
        }
        
        public virtual GroupAddUserResponse1 GroupAddUser(GroupAddUserRequest1 request)
        {
            bool result = AddUserToGroup(request.GroupAddUserRequest.username, request.GroupAddUserRequest.groupname);
            GroupAddUserResponse1 response = new GroupAddUserResponse1();
            response.GroupAddUserResponse = new GroupAddUserResponse();
            response.GroupAddUserResponse.response = result;
            return response;
        }
        
        public virtual GroupDeleteUserResponse1 GroupDeleteUser(GroupDeleteUserRequest1 request)
        {
            bool result = RemoveUserFromGroup(request.GroupDeleteUserRequest.username, request.GroupDeleteUserRequest.groupname);
            GroupDeleteUserResponse1 response = new GroupDeleteUserResponse1();
            response.GroupDeleteUserResponse = new GroupDeleteUserResponse();
            response.GroupDeleteUserResponse.response = result;
            return response;
        }
        
        public virtual GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request)
        {
            ArrayList result;
            Group group = FindGroup(request.GroupInfoRequest.groupname);
            if (null == group)
            {
                result = new ArrayList();
            }
            else
            {
                result = group.users;
            }

            string[] users = new string[result.Count];
            int i = 0;
            foreach (User user in result)
            {
                users[i++] = user.username;
            }
            GetGroupInfoResponse response = new GetGroupInfoResponse(users);
            return response;
        }

        public bool AddUser(string username, string firstname, string lastname, bool gender, int age)
        {
            if (FindUser(username) != null)
            {
                return false;
            }

            User user = new User();
            user.username = username;
            user.firstname = firstname;
            user.lastname = lastname;
            user.gender = gender;
            user.age = age;
            users.Add(user);

            return true;
        }

        public bool RemoveUser(string username)
        {
            User user = FindUser(username);
            if (null == user)
            {
                return false;
            }
            users.Remove(user);
            return true;
        }

        public bool AddGroup(string groupname)
        {
            Group group = FindGroup(groupname);
            if (group != null)
            {
                return false;
            }

            Group newGroup = new Group();
            newGroup.groupname = groupname;
            groups.Add(newGroup);
            return true;
        }

        public bool RemoveGroup(string groupname)
        {
            Group group = FindGroup(groupname);
            if (group == null)
            {
                return false;
            }

            groups.Remove(group);
            return true;
        }

        public bool AddUserToGroup(string username, string groupname)
        {
            Group group = FindGroup(groupname);
            if (null == group)
            {
                return false;
            }

            User user = FindUser(username);
            if (null == user)
            {
                return false;
            }

            if (group.users.Contains(user))
            {
                return false;
            }

            group.users.Add(user);
            return true;
        }

        public bool RemoveUserFromGroup(string username, string groupname)
        {
            Group group = FindGroup(groupname);
            if (null == group)
            {
                return false;
            }

            User user = FindUser(username);
            if (null == user)
            {
                return false;
            }

            if (!group.users.Contains(user))
            {
                return false;
            }

            group.users.Remove(user);
            return true;
        }

        public User FindUser(string username)
        {
            foreach(User user in users) {
                if (username == user.username) {
                    return user;
                }
            }
            return null;
        }

        public Group FindGroup(string groupname)
        {
            foreach(Group group in groups) {
                if (group.groupname == groupname) {
                    return group;
                }
            }
            return null;
        }
    }
}
