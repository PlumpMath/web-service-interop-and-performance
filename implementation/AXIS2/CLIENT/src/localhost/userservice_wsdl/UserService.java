

/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package localhost.userservice_wsdl;

    /*
     *  UserService java interface
     */

    public interface UserService {
          

        /**
          * Auto generated method signature
          * 
                    * @param groupDeletionRequest
                
         */

         
                     public localhost.userservice_xsd.GroupDeletionResponse deleteGroup(

                        localhost.userservice_xsd.GroupDeletionRequest groupDeletionRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param userCreationRequest
                
         */

         
                     public localhost.userservice_xsd.UserCreationResponse createUser(

                        localhost.userservice_xsd.UserCreationRequest userCreationRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param groupInfoRequest
                
         */

         
                     public localhost.userservice_xsd.GroupInfoResponse getGroupInfo(

                        localhost.userservice_xsd.GroupInfoRequest groupInfoRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param groupCreationRequest
                
         */

         
                     public localhost.userservice_xsd.GroupCreationResponse createGroup(

                        localhost.userservice_xsd.GroupCreationRequest groupCreationRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param userInfoRequest
                
         */

         
                     public localhost.userservice_xsd.UserInfo getUserInfo(

                        localhost.userservice_xsd.UserInfoRequest userInfoRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param groupAddUserRequest
                
         */

         
                     public localhost.userservice_xsd.GroupAddUserResponse groupAddUser(

                        localhost.userservice_xsd.GroupAddUserRequest groupAddUserRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param groupDeleteUserRequest
                
         */

         
                     public localhost.userservice_xsd.GroupDeleteUserResponse groupDeleteUser(

                        localhost.userservice_xsd.GroupDeleteUserRequest groupDeleteUserRequest)
                        throws java.rmi.RemoteException
             ;

        

        /**
          * Auto generated method signature
          * 
                    * @param userDeletionRequest
                
         */

         
                     public localhost.userservice_xsd.UserDeletionResponse deleteUser(

                        localhost.userservice_xsd.UserDeletionRequest userDeletionRequest)
                        throws java.rmi.RemoteException
             ;

        

        
       //
       }
    