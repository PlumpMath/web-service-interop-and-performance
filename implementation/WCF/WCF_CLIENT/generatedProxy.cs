﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:2.0.50727.5456
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------



[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.ServiceContractAttribute(Namespace="http://localhost:9000/userservice.wsdl", ConfigurationName="UserServicePortType")]
public interface UserServicePortType
{
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GetUserInfo weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GetUserInfo", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    GetUserInfoResponse GetUserInfo(GetUserInfoRequest request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang DeleteUser weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/DeleteUser", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    DeleteUserResponse DeleteUser(DeleteUserRequest request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang CreateUser weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/CreateUser", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    CreateUserResponse CreateUser(CreateUserRequest request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang CreateGroup weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/CreateGroup", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    CreateGroupResponse CreateGroup(CreateGroupRequest request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang DeleteGroup weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/DeleteGroup", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    DeleteGroupResponse DeleteGroup(DeleteGroupRequest request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GroupAddUser weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GroupAddUser", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    GroupAddUserResponse1 GroupAddUser(GroupAddUserRequest1 request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GroupDeleteUser weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GroupDeleteUser", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    GroupDeleteUserResponse1 GroupDeleteUser(GroupDeleteUserRequest1 request);
    
    // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GetGroupInfo weder in RPC noch in einem Dokument eingeschlossen ist.
    [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GetGroupInfo", ReplyAction="*")]
    [System.ServiceModel.XmlSerializerFormatAttribute()]
    GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request);
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserInfoRequest
{
    
    private string usernameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string username
    {
        get
        {
            return this.usernameField;
        }
        set
        {
            this.usernameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserInfo
{
    
    private string firstnameField;
    
    private string lastnameField;
    
    private bool genderField;
    
    private string ageField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string firstname
    {
        get
        {
            return this.firstnameField;
        }
        set
        {
            this.firstnameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string lastname
    {
        get
        {
            return this.lastnameField;
        }
        set
        {
            this.lastnameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool gender
    {
        get
        {
            return this.genderField;
        }
        set
        {
            this.genderField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, DataType="integer")]
    public string age
    {
        get
        {
            return this.ageField;
        }
        set
        {
            this.ageField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GetUserInfoRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserInfoRequest UserInfoRequest;
    
    public GetUserInfoRequest()
    {
    }
    
    public GetUserInfoRequest(UserInfoRequest UserInfoRequest)
    {
        this.UserInfoRequest = UserInfoRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GetUserInfoResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserInfo UserInfo;
    
    public GetUserInfoResponse()
    {
    }
    
    public GetUserInfoResponse(UserInfo UserInfo)
    {
        this.UserInfo = UserInfo;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserDeletionRequest
{
    
    private string usernameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string username
    {
        get
        {
            return this.usernameField;
        }
        set
        {
            this.usernameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserDeletionResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class DeleteUserRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserDeletionRequest UserDeletionRequest;
    
    public DeleteUserRequest()
    {
    }
    
    public DeleteUserRequest(UserDeletionRequest UserDeletionRequest)
    {
        this.UserDeletionRequest = UserDeletionRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class DeleteUserResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserDeletionResponse UserDeletionResponse;
    
    public DeleteUserResponse()
    {
    }
    
    public DeleteUserResponse(UserDeletionResponse UserDeletionResponse)
    {
        this.UserDeletionResponse = UserDeletionResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserCreationRequest
{
    
    private string usernameField;
    
    private string firstnameField;
    
    private string lastnameField;
    
    private bool genderField;
    
    private string ageField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string username
    {
        get
        {
            return this.usernameField;
        }
        set
        {
            this.usernameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string firstname
    {
        get
        {
            return this.firstnameField;
        }
        set
        {
            this.firstnameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string lastname
    {
        get
        {
            return this.lastnameField;
        }
        set
        {
            this.lastnameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool gender
    {
        get
        {
            return this.genderField;
        }
        set
        {
            this.genderField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified, DataType="integer")]
    public string age
    {
        get
        {
            return this.ageField;
        }
        set
        {
            this.ageField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class UserCreationResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class CreateUserRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserCreationRequest UserCreationRequest;
    
    public CreateUserRequest()
    {
    }
    
    public CreateUserRequest(UserCreationRequest UserCreationRequest)
    {
        this.UserCreationRequest = UserCreationRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class CreateUserResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public UserCreationResponse UserCreationResponse;
    
    public CreateUserResponse()
    {
    }
    
    public CreateUserResponse(UserCreationResponse UserCreationResponse)
    {
        this.UserCreationResponse = UserCreationResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupCreationRequest
{
    
    private string groupnameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string groupname
    {
        get
        {
            return this.groupnameField;
        }
        set
        {
            this.groupnameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupCreationResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class CreateGroupRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupCreationRequest GroupCreationRequest;
    
    public CreateGroupRequest()
    {
    }
    
    public CreateGroupRequest(GroupCreationRequest GroupCreationRequest)
    {
        this.GroupCreationRequest = GroupCreationRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class CreateGroupResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupCreationResponse GroupCreationResponse;
    
    public CreateGroupResponse()
    {
    }
    
    public CreateGroupResponse(GroupCreationResponse GroupCreationResponse)
    {
        this.GroupCreationResponse = GroupCreationResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupDeletionRequest
{
    
    private string groupnameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string groupname
    {
        get
        {
            return this.groupnameField;
        }
        set
        {
            this.groupnameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupDeletionResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class DeleteGroupRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupDeletionRequest GroupDeletionRequest;
    
    public DeleteGroupRequest()
    {
    }
    
    public DeleteGroupRequest(GroupDeletionRequest GroupDeletionRequest)
    {
        this.GroupDeletionRequest = GroupDeletionRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class DeleteGroupResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupDeletionResponse GroupDeletionResponse;
    
    public DeleteGroupResponse()
    {
    }
    
    public DeleteGroupResponse(GroupDeletionResponse GroupDeletionResponse)
    {
        this.GroupDeletionResponse = GroupDeletionResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupAddUserRequest
{
    
    private string usernameField;
    
    private string groupnameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string username
    {
        get
        {
            return this.usernameField;
        }
        set
        {
            this.usernameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string groupname
    {
        get
        {
            return this.groupnameField;
        }
        set
        {
            this.groupnameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupAddUserResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GroupAddUserRequest1
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupAddUserRequest GroupAddUserRequest;
    
    public GroupAddUserRequest1()
    {
    }
    
    public GroupAddUserRequest1(GroupAddUserRequest GroupAddUserRequest)
    {
        this.GroupAddUserRequest = GroupAddUserRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GroupAddUserResponse1
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupAddUserResponse GroupAddUserResponse;
    
    public GroupAddUserResponse1()
    {
    }
    
    public GroupAddUserResponse1(GroupAddUserResponse GroupAddUserResponse)
    {
        this.GroupAddUserResponse = GroupAddUserResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupDeleteUserRequest
{
    
    private string usernameField;
    
    private string groupnameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string username
    {
        get
        {
            return this.usernameField;
        }
        set
        {
            this.usernameField = value;
        }
    }
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string groupname
    {
        get
        {
            return this.groupnameField;
        }
        set
        {
            this.groupnameField = value;
        }
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupDeleteUserResponse
{
    
    private bool responseField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public bool response
    {
        get
        {
            return this.responseField;
        }
        set
        {
            this.responseField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GroupDeleteUserRequest1
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupDeleteUserRequest GroupDeleteUserRequest;
    
    public GroupDeleteUserRequest1()
    {
    }
    
    public GroupDeleteUserRequest1(GroupDeleteUserRequest GroupDeleteUserRequest)
    {
        this.GroupDeleteUserRequest = GroupDeleteUserRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GroupDeleteUserResponse1
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupDeleteUserResponse GroupDeleteUserResponse;
    
    public GroupDeleteUserResponse1()
    {
    }
    
    public GroupDeleteUserResponse1(GroupDeleteUserResponse GroupDeleteUserResponse)
    {
        this.GroupDeleteUserResponse = GroupDeleteUserResponse;
    }
}

/// <remarks/>
[System.CodeDom.Compiler.GeneratedCodeAttribute("svcutil", "3.0.4506.2152")]
[System.SerializableAttribute()]
[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.ComponentModel.DesignerCategoryAttribute("code")]
[System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="http://localhost:9000/userservice.xsd")]
public partial class GroupInfoRequest
{
    
    private string groupnameField;
    
    /// <remarks/>
    [System.Xml.Serialization.XmlElementAttribute(Form=System.Xml.Schema.XmlSchemaForm.Unqualified)]
    public string groupname
    {
        get
        {
            return this.groupnameField;
        }
        set
        {
            this.groupnameField = value;
        }
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GetGroupInfoRequest
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    public GroupInfoRequest GroupInfoRequest;
    
    public GetGroupInfoRequest()
    {
    }
    
    public GetGroupInfoRequest(GroupInfoRequest GroupInfoRequest)
    {
        this.GroupInfoRequest = GroupInfoRequest;
    }
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
[System.ServiceModel.MessageContractAttribute(IsWrapped=false)]
public partial class GetGroupInfoResponse
{
    
    [System.ServiceModel.MessageBodyMemberAttribute(Namespace="http://localhost:9000/userservice.xsd", Order=0)]
    [System.Xml.Serialization.XmlArrayItemAttribute("userlist", Form=System.Xml.Schema.XmlSchemaForm.Unqualified, IsNullable=false)]
    public string[] GroupInfoResponse;
    
    public GetGroupInfoResponse()
    {
    }
    
    public GetGroupInfoResponse(string[] GroupInfoResponse)
    {
        this.GroupInfoResponse = GroupInfoResponse;
    }
}

[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
public interface UserServicePortTypeChannel : UserServicePortType, System.ServiceModel.IClientChannel
{
}

[System.Diagnostics.DebuggerStepThroughAttribute()]
[System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "3.0.0.0")]
public partial class UserServicePortTypeClient : System.ServiceModel.ClientBase<UserServicePortType>, UserServicePortType
{
    
    public UserServicePortTypeClient()
    {
    }
    
    public UserServicePortTypeClient(string endpointConfigurationName) : 
            base(endpointConfigurationName)
    {
    }
    
    public UserServicePortTypeClient(string endpointConfigurationName, string remoteAddress) : 
            base(endpointConfigurationName, remoteAddress)
    {
    }
    
    public UserServicePortTypeClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
            base(endpointConfigurationName, remoteAddress)
    {
    }
    
    public UserServicePortTypeClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
            base(binding, remoteAddress)
    {
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    GetUserInfoResponse UserServicePortType.GetUserInfo(GetUserInfoRequest request)
    {
        return base.Channel.GetUserInfo(request);
    }
    
    public UserInfo GetUserInfo(UserInfoRequest UserInfoRequest)
    {
        GetUserInfoRequest inValue = new GetUserInfoRequest();
        inValue.UserInfoRequest = UserInfoRequest;
        GetUserInfoResponse retVal = ((UserServicePortType)(this)).GetUserInfo(inValue);
        return retVal.UserInfo;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    DeleteUserResponse UserServicePortType.DeleteUser(DeleteUserRequest request)
    {
        return base.Channel.DeleteUser(request);
    }
    
    public UserDeletionResponse DeleteUser(UserDeletionRequest UserDeletionRequest)
    {
        DeleteUserRequest inValue = new DeleteUserRequest();
        inValue.UserDeletionRequest = UserDeletionRequest;
        DeleteUserResponse retVal = ((UserServicePortType)(this)).DeleteUser(inValue);
        return retVal.UserDeletionResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    CreateUserResponse UserServicePortType.CreateUser(CreateUserRequest request)
    {
        return base.Channel.CreateUser(request);
    }
    
    public UserCreationResponse CreateUser(UserCreationRequest UserCreationRequest)
    {
        CreateUserRequest inValue = new CreateUserRequest();
        inValue.UserCreationRequest = UserCreationRequest;
        CreateUserResponse retVal = ((UserServicePortType)(this)).CreateUser(inValue);
        return retVal.UserCreationResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    CreateGroupResponse UserServicePortType.CreateGroup(CreateGroupRequest request)
    {
        return base.Channel.CreateGroup(request);
    }
    
    public GroupCreationResponse CreateGroup(GroupCreationRequest GroupCreationRequest)
    {
        CreateGroupRequest inValue = new CreateGroupRequest();
        inValue.GroupCreationRequest = GroupCreationRequest;
        CreateGroupResponse retVal = ((UserServicePortType)(this)).CreateGroup(inValue);
        return retVal.GroupCreationResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    DeleteGroupResponse UserServicePortType.DeleteGroup(DeleteGroupRequest request)
    {
        return base.Channel.DeleteGroup(request);
    }
    
    public GroupDeletionResponse DeleteGroup(GroupDeletionRequest GroupDeletionRequest)
    {
        DeleteGroupRequest inValue = new DeleteGroupRequest();
        inValue.GroupDeletionRequest = GroupDeletionRequest;
        DeleteGroupResponse retVal = ((UserServicePortType)(this)).DeleteGroup(inValue);
        return retVal.GroupDeletionResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    GroupAddUserResponse1 UserServicePortType.GroupAddUser(GroupAddUserRequest1 request)
    {
        return base.Channel.GroupAddUser(request);
    }
    
    public GroupAddUserResponse GroupAddUser(GroupAddUserRequest GroupAddUserRequest)
    {
        GroupAddUserRequest1 inValue = new GroupAddUserRequest1();
        inValue.GroupAddUserRequest = GroupAddUserRequest;
        GroupAddUserResponse1 retVal = ((UserServicePortType)(this)).GroupAddUser(inValue);
        return retVal.GroupAddUserResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    GroupDeleteUserResponse1 UserServicePortType.GroupDeleteUser(GroupDeleteUserRequest1 request)
    {
        return base.Channel.GroupDeleteUser(request);
    }
    
    public GroupDeleteUserResponse GroupDeleteUser(GroupDeleteUserRequest GroupDeleteUserRequest)
    {
        GroupDeleteUserRequest1 inValue = new GroupDeleteUserRequest1();
        inValue.GroupDeleteUserRequest = GroupDeleteUserRequest;
        GroupDeleteUserResponse1 retVal = ((UserServicePortType)(this)).GroupDeleteUser(inValue);
        return retVal.GroupDeleteUserResponse;
    }
    
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
    GetGroupInfoResponse UserServicePortType.GetGroupInfo(GetGroupInfoRequest request)
    {
        return base.Channel.GetGroupInfo(request);
    }
    
    public string[] GetGroupInfo(GroupInfoRequest GroupInfoRequest)
    {
        GetGroupInfoRequest inValue = new GetGroupInfoRequest();
        inValue.GroupInfoRequest = GroupInfoRequest;
        GetGroupInfoResponse retVal = ((UserServicePortType)(this)).GetGroupInfo(inValue);
        return retVal.GroupInfoResponse;
    }
}