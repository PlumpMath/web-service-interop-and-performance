namespace WCF_USERSERVICE
{
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(Namespace="http://localhost:9000/userservice.wsdl", ConfigurationName="IUserServicePortType")]
    public interface IUserServicePortType
    {
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GetUserInfo weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GetUserInfo", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        GetUserInfoResponse GetUserInfo(GetUserInfoRequest request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang DeleteUser weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/DeleteUser", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        DeleteUserResponse DeleteUser(DeleteUserRequest request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang CreateUser weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/CreateUser", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        CreateUserResponse CreateUser(CreateUserRequest request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang CreateGroup weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/CreateGroup", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        CreateGroupResponse CreateGroup(CreateGroupRequest request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang DeleteGroup weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/DeleteGroup", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        DeleteGroupResponse DeleteGroup(DeleteGroupRequest request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GroupAddUser weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GroupAddUser", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        GroupAddUserResponse1 GroupAddUser(GroupAddUserRequest1 request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GroupDeleteUser weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GroupDeleteUser", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        GroupDeleteUserResponse1 GroupDeleteUser(GroupDeleteUserRequest1 request);
        
        // CODEGEN: Der Nachrichtenvertrag wird generiert, da der Vorgang GetGroupInfo weder in RPC noch in einem Dokument eingeschlossen ist.
        [System.ServiceModel.OperationContractAttribute(Action="http://localhost:9000/GetGroupInfo", ReplyAction="*")]
        [System.ServiceModel.XmlSerializerFormatAttribute(SupportFaults=true)]
        GetGroupInfoResponse GetGroupInfo(GetGroupInfoRequest request);
    }
}
