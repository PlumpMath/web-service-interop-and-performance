namespace WCF_USERSERVICE
{
    
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Advanced)]
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
}
