#!/usr/bin/env ruby
require './UserServiceDriver.rb'

# CREATE CLIENT ENDPOINT
endpoint_url = ARGV.shift
obj = UserServicePortType.new(endpoint_url)

# run ruby with -d to see SOAP wiredumps.
obj.wiredump_dev = STDERR if $DEBUG

# CREATE USER
body = UserCreationRequest.new("hallo","peter","lustig",false,9)
puts obj.createUser(body).response

# GET USER INFO
body = UserInfoRequest.new("hallo")
puts obj.getUserInfo(body).firstname

# CREATE GROUP
body = GroupCreationRequest.new("knightrider")
puts obj.createGroup(body).response

# ADD USER TO GROUP
body = GroupAddUserRequest.new("hallo", "knightrider")
puts obj.groupAddUser(body).response

# GET GROUP INFO
body = GroupInfoRequest.new("knightrider")
puts obj.getGroupInfo(body).inspect

# REMOVE USER FROM GROUP
body = GroupDeleteUserRequest.new("hallo", "knightrider")
puts obj.groupDeleteUser(body).response

# DELETE GROUP
body = GroupDeletionRequest.new("knightrider")
puts obj.deleteGroup(body).response

# DELETE USER
body = UserDeletionRequest.new("hallo")
puts obj.deleteUser(body).response
