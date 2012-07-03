#include <iostream>
#include <string>

#include "boost/lexical_cast.hpp"

#include "soapH.h"
#include "UserServiceSoapBinding.nsmap"

#include "./userservice.h"

userservice::userservice us;

int __ns1__GetUserInfo(struct soap*,
                       _ns2__UserInfoRequest* request,
                       _ns2__UserInfo* response) {
  userservice::user& u = us.user_info(request->username);
  response->firstname = u.firstname;
  response->lastname = u.lastname;
  response->gender = u.gender;
  response->age = boost::lexical_cast<std::string>(u.age);
  return SOAP_OK;
}

int __ns1__DeleteUser(struct soap*,
                      _ns2__UserDeletionRequest* request,
                      _ns2__UserDeletionResponse* response) {
  response->response = us.remove_user(request->username);
  return SOAP_OK;
}

int __ns1__CreateUser(struct soap*,
                      _ns2__UserCreationRequest* request,
                      _ns2__UserCreationResponse* response) {
  response->response = us.add_user(request->username, request->firstname,
                                   request->lastname, request->gender,
                                   std::atoi(request->age.c_str()));
  return SOAP_OK;
}

int __ns1__CreateGroup(struct soap*,
                       _ns2__GroupCreationRequest* request,
                       _ns2__GroupCreationResponse* response) {
  response->response = us.add_group(request->groupname);
  return SOAP_OK;
}

int __ns1__DeleteGroup(struct soap*,
                       _ns2__GroupDeletionRequest* request,
                       _ns2__GroupDeletionResponse* response) {
  response->response = us.remove_group(request->groupname);
  return SOAP_OK;
}

int __ns1__GroupAddUser(struct soap*,
                        _ns2__GroupAddUserRequest* request,
                        _ns2__GroupAddUserResponse* response) {
  response->response = us.add_user_to_group(request->username,  
                                            request->groupname);
  return SOAP_OK;
}

int __ns1__GroupDeleteUser(struct soap*,
                           _ns2__GroupDeleteUserRequest* request,
                           _ns2__GroupDeleteUserResponse* response) {
  response->response = us.remove_user_from_group(request->username,
                                                 request->groupname);
  return SOAP_OK;
}

int __ns1__GetGroupInfo(struct soap*,
                        _ns2__GroupInfoRequest* request,
                        _ns2__GroupInfoResponse* response) {
  response->userlist = us.group_info(request->groupname);
  return SOAP_OK;
}

int main() {
   struct soap soap;
   int m, s; // master and slave sockets
   soap_init(&soap);
   m = soap_bind(&soap, "0.0.0.0", 9000, 100);
   if (m < 0)
      soap_print_fault(&soap, stderr);
   else
   {
      // fprintf(stderr, "Socket connection successful: master socket = %d\n", m);
      for (int i = 1; ; i++)
      {
         s = soap_accept(&soap);
         if (s < 0)
         {
            soap_print_fault(&soap, stderr);
            break;
         }
         //fprintf(stderr, "%d: accepted connection from IP=%d.%d.%d.%d socket=%d", i,
         //   (soap.ip >> 24)&0xFF, (soap.ip >> 16)&0xFF, (soap.ip >> 8)&0xFF, soap.ip&0xFF, s);
         if (soap_serve(&soap) != SOAP_OK) // process RPC request
            soap_print_fault(&soap, stderr); // print error
         // fprintf(stderr, "request served\n");
         soap_destroy(&soap); // clean up class instances
         soap_end(&soap); // clean up everything and close socket
      }
   }
   soap_done(&soap); // close master socket and detach context
}
