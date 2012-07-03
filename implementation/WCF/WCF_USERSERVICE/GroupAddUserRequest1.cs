namespace WCF_USERSERVICE
{
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
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
}
