require './UserService.rb'
require 'soap/mapping'

module UserServiceMappingRegistry
  EncodedRegistry = ::SOAP::Mapping::EncodedRegistry.new
  LiteralRegistry = ::SOAP::Mapping::LiteralRegistry.new
  NsUserserviceXsd = "http://localhost:9000/userservice.xsd"

  LiteralRegistry.register(
    :class => UserInfoRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserInfoRequest"),
    :schema_element => [
      ["username", ["SOAP::SOAPString", XSD::QName.new(nil, "username")]]
    ]
  )

  LiteralRegistry.register(
    :class => UserInfo,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserInfo"),
    :schema_element => [
      ["firstname", ["SOAP::SOAPString", XSD::QName.new(nil, "firstname")]],
      ["lastname", ["SOAP::SOAPString", XSD::QName.new(nil, "lastname")]],
      ["gender", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "gender")]],
      ["age", ["SOAP::SOAPInteger", XSD::QName.new(nil, "age")]]
    ]
  )

  LiteralRegistry.register(
    :class => UserDeletionRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserDeletionRequest"),
    :schema_element => [
      ["username", ["SOAP::SOAPString", XSD::QName.new(nil, "username")]]
    ]
  )

  LiteralRegistry.register(
    :class => UserDeletionResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserDeletionResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => UserCreationRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserCreationRequest"),
    :schema_element => [
      ["username", ["SOAP::SOAPString", XSD::QName.new(nil, "username")]],
      ["firstname", ["SOAP::SOAPString", XSD::QName.new(nil, "firstname")]],
      ["lastname", ["SOAP::SOAPString", XSD::QName.new(nil, "lastname")]],
      ["gender", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "gender")]],
      ["age", ["SOAP::SOAPInteger", XSD::QName.new(nil, "age")]]
    ]
  )

  LiteralRegistry.register(
    :class => UserCreationResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "UserCreationResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupCreationRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupCreationRequest"),
    :schema_element => [
      ["groupname", ["SOAP::SOAPString", XSD::QName.new(nil, "groupname")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupCreationResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupCreationResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupDeletionRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupDeletionRequest"),
    :schema_element => [
      ["groupname", ["SOAP::SOAPString", XSD::QName.new(nil, "groupname")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupDeletionResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupDeletionResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupAddUserRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupAddUserRequest"),
    :schema_element => [
      ["username", ["SOAP::SOAPString", XSD::QName.new(nil, "username")]],
      ["groupname", ["SOAP::SOAPString", XSD::QName.new(nil, "groupname")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupAddUserResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupAddUserResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupDeleteUserRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupDeleteUserRequest"),
    :schema_element => [
      ["username", ["SOAP::SOAPString", XSD::QName.new(nil, "username")]],
      ["groupname", ["SOAP::SOAPString", XSD::QName.new(nil, "groupname")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupDeleteUserResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupDeleteUserResponse"),
    :schema_element => [
      ["response", ["SOAP::SOAPBoolean", XSD::QName.new(nil, "response")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupInfoRequest,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupInfoRequest"),
    :schema_element => [
      ["groupname", ["SOAP::SOAPString", XSD::QName.new(nil, "groupname")]]
    ]
  )

  LiteralRegistry.register(
    :class => GroupInfoResponse,
    :schema_name => XSD::QName.new(NsUserserviceXsd, "GroupInfoResponse"),
    :schema_element => [
      ["userlist", ["SOAP::SOAPString[]", XSD::QName.new(nil, "userlist")], [0, nil]]
    ]
  )
end
