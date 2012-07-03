namespace WCF_USERSERVICE
{
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
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
}
