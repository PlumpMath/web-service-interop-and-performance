require 'xsd/qname'

# {http://localhost:9000/userservice.xsd}UserInfoRequest
#   username - SOAP::SOAPString
class UserInfoRequest
  attr_accessor :username

  def initialize(username = nil)
    @username = username
  end
end

# {http://localhost:9000/userservice.xsd}UserInfo
#   firstname - SOAP::SOAPString
#   lastname - SOAP::SOAPString
#   gender - SOAP::SOAPBoolean
#   age - SOAP::SOAPInteger
class UserInfo
  attr_accessor :firstname
  attr_accessor :lastname
  attr_accessor :gender
  attr_accessor :age

  def initialize(firstname = nil, lastname = nil, gender = nil, age = nil)
    @firstname = firstname
    @lastname = lastname
    @gender = gender
    @age = age
  end
end

# {http://localhost:9000/userservice.xsd}UserDeletionRequest
#   username - SOAP::SOAPString
class UserDeletionRequest
  attr_accessor :username

  def initialize(username = nil)
    @username = username
  end
end

# {http://localhost:9000/userservice.xsd}UserDeletionResponse
#   response - SOAP::SOAPBoolean
class UserDeletionResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}UserCreationRequest
#   username - SOAP::SOAPString
#   firstname - SOAP::SOAPString
#   lastname - SOAP::SOAPString
#   gender - SOAP::SOAPBoolean
#   age - SOAP::SOAPInteger
class UserCreationRequest
  attr_accessor :username
  attr_accessor :firstname
  attr_accessor :lastname
  attr_accessor :gender
  attr_accessor :age

  def initialize(username = nil, firstname = nil, lastname = nil, gender = nil, age = nil)
    @username = username
    @firstname = firstname
    @lastname = lastname
    @gender = gender
    @age = age
  end
end

# {http://localhost:9000/userservice.xsd}UserCreationResponse
#   response - SOAP::SOAPBoolean
class UserCreationResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}GroupCreationRequest
#   groupname - SOAP::SOAPString
class GroupCreationRequest
  attr_accessor :groupname

  def initialize(groupname = nil)
    @groupname = groupname
  end
end

# {http://localhost:9000/userservice.xsd}GroupCreationResponse
#   response - SOAP::SOAPBoolean
class GroupCreationResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}GroupDeletionRequest
#   groupname - SOAP::SOAPString
class GroupDeletionRequest
  attr_accessor :groupname

  def initialize(groupname = nil)
    @groupname = groupname
  end
end

# {http://localhost:9000/userservice.xsd}GroupDeletionResponse
#   response - SOAP::SOAPBoolean
class GroupDeletionResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}GroupAddUserRequest
#   username - SOAP::SOAPString
#   groupname - SOAP::SOAPString
class GroupAddUserRequest
  attr_accessor :username
  attr_accessor :groupname

  def initialize(username = nil, groupname = nil)
    @username = username
    @groupname = groupname
  end
end

# {http://localhost:9000/userservice.xsd}GroupAddUserResponse
#   response - SOAP::SOAPBoolean
class GroupAddUserResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}GroupDeleteUserRequest
#   username - SOAP::SOAPString
#   groupname - SOAP::SOAPString
class GroupDeleteUserRequest
  attr_accessor :username
  attr_accessor :groupname

  def initialize(username = nil, groupname = nil)
    @username = username
    @groupname = groupname
  end
end

# {http://localhost:9000/userservice.xsd}GroupDeleteUserResponse
#   response - SOAP::SOAPBoolean
class GroupDeleteUserResponse
  attr_accessor :response

  def initialize(response = nil)
    @response = response
  end
end

# {http://localhost:9000/userservice.xsd}GroupInfoRequest
#   groupname - SOAP::SOAPString
class GroupInfoRequest
  attr_accessor :groupname

  def initialize(groupname = nil)
    @groupname = groupname
  end
end

# {http://localhost:9000/userservice.xsd}GroupInfoResponse
class GroupInfoResponse < ::Array
end
