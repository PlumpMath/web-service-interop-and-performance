namespace WCF_USERSERVICE
{
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
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
}
