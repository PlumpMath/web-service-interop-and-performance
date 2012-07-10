
/**
 * UserServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
        package localhost.userservice_wsdl;

        /**
        *  UserServiceMessageReceiverInOut message receiver
        */

        public class UserServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        UserServiceSkeleton skel = (UserServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("deleteGroup".equals(methodName)){
                
                localhost.userservice_xsd.GroupDeletionResponse groupDeletionResponse1 = null;
	                        localhost.userservice_xsd.GroupDeletionRequest wrappedParam =
                                                             (localhost.userservice_xsd.GroupDeletionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.GroupDeletionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               groupDeletionResponse1 =
                                                   
                                                   
                                                         skel.deleteGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), groupDeletionResponse1, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "deleteGroup"));
                                    } else 

            if("createUser".equals(methodName)){
                
                localhost.userservice_xsd.UserCreationResponse userCreationResponse3 = null;
	                        localhost.userservice_xsd.UserCreationRequest wrappedParam =
                                                             (localhost.userservice_xsd.UserCreationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.UserCreationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               userCreationResponse3 =
                                                   
                                                   
                                                         skel.createUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), userCreationResponse3, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "createUser"));
                                    } else 

            if("getGroupInfo".equals(methodName)){
                
                localhost.userservice_xsd.GroupInfoResponse groupInfoResponse5 = null;
	                        localhost.userservice_xsd.GroupInfoRequest wrappedParam =
                                                             (localhost.userservice_xsd.GroupInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.GroupInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               groupInfoResponse5 =
                                                   
                                                   
                                                         skel.getGroupInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), groupInfoResponse5, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "getGroupInfo"));
                                    } else 

            if("createGroup".equals(methodName)){
                
                localhost.userservice_xsd.GroupCreationResponse groupCreationResponse7 = null;
	                        localhost.userservice_xsd.GroupCreationRequest wrappedParam =
                                                             (localhost.userservice_xsd.GroupCreationRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.GroupCreationRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               groupCreationResponse7 =
                                                   
                                                   
                                                         skel.createGroup(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), groupCreationResponse7, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "createGroup"));
                                    } else 

            if("getUserInfo".equals(methodName)){
                
                localhost.userservice_xsd.UserInfo userInfo9 = null;
	                        localhost.userservice_xsd.UserInfoRequest wrappedParam =
                                                             (localhost.userservice_xsd.UserInfoRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.UserInfoRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               userInfo9 =
                                                   
                                                   
                                                         skel.getUserInfo(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), userInfo9, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "getUserInfo"));
                                    } else 

            if("groupAddUser".equals(methodName)){
                
                localhost.userservice_xsd.GroupAddUserResponse groupAddUserResponse11 = null;
	                        localhost.userservice_xsd.GroupAddUserRequest wrappedParam =
                                                             (localhost.userservice_xsd.GroupAddUserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.GroupAddUserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               groupAddUserResponse11 =
                                                   
                                                   
                                                         skel.groupAddUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), groupAddUserResponse11, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "groupAddUser"));
                                    } else 

            if("groupDeleteUser".equals(methodName)){
                
                localhost.userservice_xsd.GroupDeleteUserResponse groupDeleteUserResponse13 = null;
	                        localhost.userservice_xsd.GroupDeleteUserRequest wrappedParam =
                                                             (localhost.userservice_xsd.GroupDeleteUserRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.GroupDeleteUserRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               groupDeleteUserResponse13 =
                                                   
                                                   
                                                         skel.groupDeleteUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), groupDeleteUserResponse13, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "groupDeleteUser"));
                                    } else 

            if("deleteUser".equals(methodName)){
                
                localhost.userservice_xsd.UserDeletionResponse userDeletionResponse15 = null;
	                        localhost.userservice_xsd.UserDeletionRequest wrappedParam =
                                                             (localhost.userservice_xsd.UserDeletionRequest)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.userservice_xsd.UserDeletionRequest.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               userDeletionResponse15 =
                                                   
                                                   
                                                         skel.deleteUser(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), userDeletionResponse15, false, new javax.xml.namespace.QName("http://localhost:9000/userservice.wsdl",
                                                    "deleteUser"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupDeletionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupDeletionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupDeletionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupDeletionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserCreationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserCreationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserCreationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserCreationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupInfoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupInfoResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupCreationRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupCreationRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupCreationResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupCreationResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserInfoRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserInfoRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserInfo param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserInfo.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupAddUserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupAddUserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupAddUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupAddUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupDeleteUserRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupDeleteUserRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.GroupDeleteUserResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.GroupDeleteUserResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserDeletionRequest param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserDeletionRequest.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.userservice_xsd.UserDeletionResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.userservice_xsd.UserDeletionResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.GroupDeletionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.GroupDeletionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.GroupDeletionResponse wrapDeleteGroup(){
                                localhost.userservice_xsd.GroupDeletionResponse wrappedElement = new localhost.userservice_xsd.GroupDeletionResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.UserCreationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.UserCreationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.UserCreationResponse wrapCreateUser(){
                                localhost.userservice_xsd.UserCreationResponse wrappedElement = new localhost.userservice_xsd.UserCreationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.GroupInfoResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.GroupInfoResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.GroupInfoResponse wrapGetGroupInfo(){
                                localhost.userservice_xsd.GroupInfoResponse wrappedElement = new localhost.userservice_xsd.GroupInfoResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.GroupCreationResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.GroupCreationResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.GroupCreationResponse wrapCreateGroup(){
                                localhost.userservice_xsd.GroupCreationResponse wrappedElement = new localhost.userservice_xsd.GroupCreationResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.UserInfo param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.UserInfo.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.UserInfo wrapGetUserInfo(){
                                localhost.userservice_xsd.UserInfo wrappedElement = new localhost.userservice_xsd.UserInfo();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.GroupAddUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.GroupAddUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.GroupAddUserResponse wrapGroupAddUser(){
                                localhost.userservice_xsd.GroupAddUserResponse wrappedElement = new localhost.userservice_xsd.GroupAddUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.GroupDeleteUserResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.GroupDeleteUserResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.GroupDeleteUserResponse wrapGroupDeleteUser(){
                                localhost.userservice_xsd.GroupDeleteUserResponse wrappedElement = new localhost.userservice_xsd.GroupDeleteUserResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.userservice_xsd.UserDeletionResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.userservice_xsd.UserDeletionResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.userservice_xsd.UserDeletionResponse wrapDeleteUser(){
                                localhost.userservice_xsd.UserDeletionResponse wrappedElement = new localhost.userservice_xsd.UserDeletionResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (localhost.userservice_xsd.GroupDeletionRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupDeletionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupDeletionResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupDeletionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserCreationRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.UserCreationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserCreationResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.UserCreationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupInfoRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupInfoResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupInfoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupCreationRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupCreationRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupCreationResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupCreationResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserInfoRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.UserInfoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserInfo.class.equals(type)){
                
                           return localhost.userservice_xsd.UserInfo.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupAddUserRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupAddUserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupAddUserResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupAddUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupDeleteUserRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupDeleteUserRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.GroupDeleteUserResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.GroupDeleteUserResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserDeletionRequest.class.equals(type)){
                
                           return localhost.userservice_xsd.UserDeletionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (localhost.userservice_xsd.UserDeletionResponse.class.equals(type)){
                
                           return localhost.userservice_xsd.UserDeletionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    