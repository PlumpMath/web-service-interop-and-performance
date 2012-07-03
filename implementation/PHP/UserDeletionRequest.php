<?php

class UserDeletionRequest
{

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param string $username
   * @access public
   */
  public function __construct($username)
  {
    $this->username = $username;
  }

}
