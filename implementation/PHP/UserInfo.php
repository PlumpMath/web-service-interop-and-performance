<?php

class UserInfo
{

  /**
   * 
   * @var string $firstname
   * @access public
   */
  public $firstname;

  /**
   * 
   * @var string $lastname
   * @access public
   */
  public $lastname;

  /**
   * 
   * @var boolean $gender
   * @access public
   */
  public $gender;

  /**
   * 
   * @var int $age
   * @access public
   */
  public $age;

  /**
   * 
   * @param string $firstname
   * @param string $lastname
   * @param boolean $gender
   * @param int $age
   * @access public
   */
  public function __construct($firstname, $lastname, $gender, $age)
  {
    $this->firstname = $firstname;
    $this->lastname = $lastname;
    $this->gender = $gender;
    $this->age = $age;
  }

}
