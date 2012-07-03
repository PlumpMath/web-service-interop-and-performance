<?php

class GroupInfoResponse
{

  /**
   * 
   * @var string $userlist
   * @access public
   */
  public $userlist;

  /**
   * 
   * @param string $userlist
   * @access public
   */
  public function __construct($userlist)
  {
    $this->userlist = $userlist;
  }

}
