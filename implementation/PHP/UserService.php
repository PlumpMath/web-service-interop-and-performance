<?php

include_once('UserInfoRequest.php');
include_once('UserInfo.php');
include_once('UserDeletionRequest.php');
include_once('UserDeletionResponse.php');
include_once('UserCreationRequest.php');
include_once('UserCreationResponse.php');
include_once('GroupCreationRequest.php');
include_once('GroupCreationResponse.php');
include_once('GroupDeletionRequest.php');
include_once('GroupDeletionResponse.php');
include_once('GroupAddUserRequest.php');
include_once('GroupAddUserResponse.php');
include_once('GroupDeleteUserRequest.php');
include_once('GroupDeleteUserResponse.php');
include_once('GroupInfoRequest.php');
include_once('GroupInfoResponse.php');


/**
 * An example user service.
 * 
 */
class UserService extends SoapClient
{

  /**
   * 
   * @var array $classmap The defined classes
   * @access private
   */
  private static $classmap = array(
    'UserInfoRequest' => 'UserInfoRequest',
    'UserInfo' => 'UserInfo',
    'UserDeletionRequest' => 'UserDeletionRequest',
    'UserDeletionResponse' => 'UserDeletionResponse',
    'UserCreationRequest' => 'UserCreationRequest',
    'UserCreationResponse' => 'UserCreationResponse',
    'GroupCreationRequest' => 'GroupCreationRequest',
    'GroupCreationResponse' => 'GroupCreationResponse',
    'GroupDeletionRequest' => 'GroupDeletionRequest',
    'GroupDeletionResponse' => 'GroupDeletionResponse',
    'GroupAddUserRequest' => 'GroupAddUserRequest',
    'GroupAddUserResponse' => 'GroupAddUserResponse',
    'GroupDeleteUserRequest' => 'GroupDeleteUserRequest',
    'GroupDeleteUserResponse' => 'GroupDeleteUserResponse',
    'GroupInfoRequest' => 'GroupInfoRequest',
    'GroupInfoResponse' => 'GroupInfoResponse');

  /**
   * 
   * @param array $config A array of config values
   * @param string $wsdl The wsdl file to use
   * @access public
   */
  public function __construct(array $options = array(), $wsdl = '../../../userservice.wsdl')
  {
    foreach(self::$classmap as $key => $value)
    {
      if(!isset($options['classmap'][$key]))
      {
        $options['classmap'][$key] = $value;
      }
    }
    
    parent::__construct($wsdl, $options);
  }

  /**
   * 
   * @param UserInfoRequest $body
   * @access public
   */
  public function GetUserInfo(UserInfoRequest $body)
  {
    return $this->__soapCall('GetUserInfo', array($body));
  }

  /**
   * 
   * @param UserDeletionRequest $body
   * @access public
   */
  public function DeleteUser(UserDeletionRequest $body)
  {
    return $this->__soapCall('DeleteUser', array($body));
  }

  /**
   * 
   * @param UserCreationRequest $body
   * @access public
   */
  public function CreateUser(UserCreationRequest $body)
  {
    return $this->__soapCall('CreateUser', array($body));
  }

  /**
   * 
   * @param GroupCreationRequest $body
   * @access public
   */
  public function CreateGroup(GroupCreationRequest $body)
  {
    return $this->__soapCall('CreateGroup', array($body));
  }

  /**
   * 
   * @param GroupDeletionRequest $body
   * @access public
   */
  public function DeleteGroup(GroupDeletionRequest $body)
  {
    return $this->__soapCall('DeleteGroup', array($body));
  }

  /**
   * 
   * @param GroupAddUserRequest $body
   * @access public
   */
  public function GroupAddUser(GroupAddUserRequest $body)
  {
    return $this->__soapCall('GroupAddUser', array($body));
  }

  /**
   * 
   * @param GroupDeleteUserRequest $body
   * @access public
   */
  public function GroupDeleteUser(GroupDeleteUserRequest $body)
  {
    return $this->__soapCall('GroupDeleteUser', array($body));
  }

  /**
   * 
   * @param GroupInfoRequest $body
   * @access public
   */
  public function GetGroupInfo(GroupInfoRequest $body)
  {
    return $this->__soapCall('GetGroupInfo', array($body));
  }

}
