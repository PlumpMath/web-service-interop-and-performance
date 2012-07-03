<?php

class GroupDeletionRequest
{

  /**
   * 
   * @var string $groupname
   * @access public
   */
  public $groupname;

  /**
   * 
   * @param string $groupname
   * @access public
   */
  public function __construct($groupname)
  {
    $this->groupname = $groupname;
  }

}
