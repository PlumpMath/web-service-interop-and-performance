require './UserService.rb'
require './UserServiceMappingRegistry.rb'
require 'soap/rpc/driver'

class UserServicePortType < ::SOAP::RPC::Driver
  DefaultEndpointUrl = "http://localhost:8080/axis2/services/UserService"

  Methods = [
    [ "http://localhost:9000/GetUserInfo",
      "getUserInfo",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserInfoRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserInfo"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/DeleteUser",
      "deleteUser",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserDeletionRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserDeletionResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/CreateUser",
      "createUser",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserCreationRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "UserCreationResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/CreateGroup",
      "createGroup",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupCreationRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupCreationResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/DeleteGroup",
      "deleteGroup",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupDeletionRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupDeletionResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/GroupAddUser",
      "groupAddUser",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupAddUserRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupAddUserResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/GroupDeleteUser",
      "groupDeleteUser",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupDeleteUserRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupDeleteUserResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ],
    [ "http://localhost:9000/GetGroupInfo",
      "getGroupInfo",
      [ [:in, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupInfoRequest"]],
        [:out, "body", ["::SOAP::SOAPElement", "http://localhost:9000/userservice.xsd", "GroupInfoResponse"]] ],
      { :request_style =>  :document, :request_use =>  :literal,
        :response_style => :document, :response_use => :literal,
        :faults => {} }
    ]
  ]

  def initialize(endpoint_url = nil)
    endpoint_url ||= DefaultEndpointUrl
    super(endpoint_url, nil)
    self.mapping_registry = UserServiceMappingRegistry::EncodedRegistry
    self.literal_mapping_registry = UserServiceMappingRegistry::LiteralRegistry
    init_methods
  end

private

  def init_methods
    Methods.each do |definitions|
      opt = definitions.last
      if opt[:request_style] == :document
        add_document_operation(*definitions)
      else
        add_rpc_operation(*definitions)
        qname = definitions[0]
        name = definitions[2]
        if qname.name != name and qname.name.capitalize == name.capitalize
          ::SOAP::Mapping.define_singleton_method(self, qname.name) do |*arg|
            __send__(name, *arg)
          end
        end
      end
    end
  end
end

