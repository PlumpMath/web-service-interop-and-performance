using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace WCF_CLIENT
{
    class Program
    {
        static void Main(string[] args)
        {
            // Create client.
            UserServicePortTypeClient client = new UserServicePortTypeClient();

            /*
             * CREATE USER
             */
            UserCreationRequest userCreationRequest = new UserCreationRequest();
            userCreationRequest.username = "user";
            userCreationRequest.firstname = "Max";
            userCreationRequest.lastname = "Mustermann";
            userCreationRequest.gender = false;
            userCreationRequest.age = "38";
            UserCreationResponse userCreationResponse = client.CreateUser(userCreationRequest);
            if (!userCreationResponse.response)
            {
                Console.WriteLine("ERROR  : user creation request failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: user creation request succeeded");
            }

            /*
             * CREATE GROUP
             */
            GroupCreationRequest groupCreationRequest = new GroupCreationRequest();
            groupCreationRequest.groupname = "testers";
            GroupCreationResponse groupCreationResponse = client.CreateGroup(groupCreationRequest);
            if (!groupCreationResponse.response)
            {
                Console.WriteLine("ERROR  : group creation request failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: group creation request succeeded");
            }

            /*
             * ADD USER TO GROUP
             */
            GroupAddUserRequest groupAddUserRequest = new GroupAddUserRequest();
            groupAddUserRequest.username = "user";
            groupAddUserRequest.groupname = "testers";
            GroupAddUserResponse groupAddUserResponse = client.GroupAddUser(groupAddUserRequest);
            if (!groupAddUserResponse.response)
            {
                Console.WriteLine("ERROR  : adding user to group failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: adding user to group succeeded");
            }

            /*
             * GET USER INFO
             */
            UserInfoRequest userInfoRequest = new UserInfoRequest();
            userInfoRequest.username = "user";
            UserInfo userInfoResponse = client.GetUserInfo(userInfoRequest);
            if (userInfoResponse.firstname != "Max" ||
                userInfoResponse.lastname != "Mustermann" ||
                userInfoResponse.gender != false ||
                userInfoResponse.age != "38")
            {
                Console.WriteLine("ERROR  : getting user info failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: getting user info succeeded");
            }

            /*
             * GET GROUP INFO
             */
            GroupInfoRequest groupInfoRequest = new GroupInfoRequest();
            groupInfoRequest.groupname = "testers";
            string[] groupInfoResponse = client.GetGroupInfo(groupInfoRequest);
            if (groupInfoResponse.Length != 1 ||
                groupInfoResponse[0] != "user")
            {
                Console.WriteLine("ERROR  : getting group info failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: getting group info succeeded");
            }

            /*
             * REMOVE USER FROM GROUP
             */
            GroupDeleteUserRequest groupDeleteUserRequest = new GroupDeleteUserRequest();
            groupDeleteUserRequest.username = "user";
            groupDeleteUserRequest.groupname = "testers";
            GroupDeleteUserResponse groupDeleteUserResponse = client.GroupDeleteUser(groupDeleteUserRequest);
            if (!groupDeleteUserResponse.response)
            {
                Console.WriteLine("ERROR  : deleting user from group failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: deleting user from group succeeded");
            }

            /*
             * DELETE USER
             */
            UserDeletionRequest userDeletionRequest = new UserDeletionRequest();
            userDeletionRequest.username = "user";
            UserDeletionResponse userDeletionResponse = client.DeleteUser(userDeletionRequest);
            if (!userDeletionResponse.response)
            {
                Console.WriteLine("ERROR  : deleting user failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: deleting user succeeded");
            }

            /*
             * DELETE GROUP
             */
            GroupDeletionRequest groupDeletionRequest = new GroupDeletionRequest();
            groupDeletionRequest.groupname = "testers";
            GroupDeletionResponse groupDeletionResponse = client.DeleteGroup(groupDeletionRequest);
            if (!groupDeletionResponse.response)
            {
                Console.WriteLine("ERROR  : deleting group failed");
                Console.ReadLine();
            }
            else
            {
                Console.WriteLine("SUCCESS: deleting group succeeded");
                Console.ReadLine();
            }
        }
    }
}
