<?php

class GroupAddUserRequest
{

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $groupname
   * @access public
   */
  public $groupname;

  /**
   * 
   * @param string $username
   * @param string $groupname
   * @access public
   */
  public function __construct($username, $groupname)
  {
    $this->username = $username;
    $this->groupname = $groupname;
  }

}
