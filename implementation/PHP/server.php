<?php
require_once('UserService.php');

class UserServicePortTypeImpl {

  public function __construct() {
    try {
      $user = 'user';
      $pass = 'password';
      $this->db = new PDO('mysql:host=localhost;dbname=userservice',
                          $user, $pass, array(PDO::ATTR_PERSISTENT => true));
    } catch (PDOException $e) {
       die("error: " . $e->getMessage());
    }
  }

  public function CreateUser($userCreateRequest) {
    $response = $this->add_user($userCreateRequest->username,
                                $userCreateRequest->firstname,
                                $userCreateRequest->lastname,
                                $userCreateRequest->gender,
                                $userCreateRequest->age);
    $userCreateResponse = new UserCreationResponse($response);
    return $userCreateResponse;
  }

  public function CreateGroup($groupCreationRequest) {
    $response = $this->add_group($groupCreationRequest->groupname);
    return new GroupCreationResponse($response);
  }

  public function GetUserInfo($userInfoRequest) {
    $user = $this->get_user($userInfoRequest->username);
    if ($user !== false) {
      return new UserInfo($user['firstname'],
                          $user['lastname'],
                          $user['gender'],
                          $user['age']);
    }
    return new UserInfo("null", "null", false, 1);
  }

  public function GetGroupInfo($groupInfoRequest) {
    $group = $this->get_group($groupInfoRequest->groupname);
    if (empty($group)) { $group = null; }
    return new GroupInfoResponse($group);
  }

  public function GroupAddUser($groupAddUserRequest) {
    $response = $this->add_user_to_group($groupAddUserRequest->username,
                                         $groupAddUserRequest->groupname);
    return new GroupAddUserResponse($response);
  }

  public function GroupDeleteUser($groupDeleteUserRequest) {
    $response = $this->remove_user_from_group($groupDeleteUserRequest->username,
                                              $groupDeleteUserRequest->groupname);
    return new GroupDeleteUserResponse($response);
  }

  public function DeleteUser($userDeletionRequest) {
    $response = $this->remove_user($userDeletionRequest->username);
    return new UserDeletionResponse($response);
  }

  public function DeleteGroup($groupDeletionRequest) {
    $response = $this->remove_group($groupDeletionRequest->groupname);
    return new GroupDeletionResponse($response);
  }

  /**
   * Creates a new user. Returnes whether the query was successful or not.
   */
  private function add_user($username, $firstname, $lastname, $gender, $age) {
    if ($this->get_user($username) !== false) {
      return false;
    }
    $stmt = $this->db->prepare("INSERT INTO users (username, firstname, lastname, gender, age) VALUES (:username, :firstname, :lastname, :gender, :age)");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    $stmt->bindParam(':firstname', $firstname, PDO::PARAM_STR, 32);
    $stmt->bindParam(':lastname', $lastname, PDO::PARAM_STR, 32);
    $stmt->bindParam(':gender', $gender, PDO::PARAM_BOOL);
    $stmt->bindParam(':age', $age, PDO::PARAM_INT);
    return $stmt->execute();
  }

  /**
   * Creates the given group and returns whether the operation was successful.
   */
  private function add_group($groupname) {
    // Check whether group already exists.
    if ($this->get_group($groupname) !== false) {
      return false;
    }

    // Create group.
    $stmt = $this->db->prepare("INSERT INTO groups (groupname) VALUES (:groupname)");
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    $stmt->execute();
    return true;
  }

  /**
   * Returns the user from the database
   * or otherwise false if the user could not be found.
   */
  private function get_user($username) {
    $stmt = $this->db->prepare("SELECT * FROM users WHERE username = :username");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    $stmt->execute();
    $result = $stmt->fetch();
    if (!$result) {
      return false;
    }
    return $result;
  }

  /**
   * Returns all users from this group
   * or otherwise false if the group does not exist.
   */
  private function get_group($groupname) {
    // Check if group exists.
    $stmt = $this->db->prepare("SELECT groupname FROM groups WHERE groupname = :groupname");
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    $group_exists = false;
    $stmt->execute();
    foreach($stmt->fetchAll() as $row) {
      $group_exists = true;
    }
    if (!$group_exists) {
      return false;
    }

    // Get users.
    $stmt = $this->db->prepare("SELECT username FROM users_in_groups WHERE groupname = :groupname");
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    $stmt->execute();
    $users = array();
    foreach($stmt->fetchAll() as $row) {
      if ($groupname == "whatever") { die('test'); }
      $users[] = $row['username'];
    }
    return $users;
  }

  /**
   * Adds the given user to the given group.
   */
  private function add_user_to_group($username, $groupname) {
    // Check whether user exists.
    if ($this->get_user($username) === false) {
      return false;
    }

    // Check whether group exists and already contains the user.
    $group = $this->get_group($groupname);
    if ($group === false || in_array($username, $group)) {
      return false;
    }

    // Add user to group.
    $stmt = $this->db->prepare("INSERT INTO users_in_groups (username, groupname) VALUES (:username, :groupname)");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    return $stmt->execute();
  }

  /**
   * Removes the given user from the given group.
   * Fails if the user does not exist, the group does not exist
   * or if the user is not contained in the group.
   */
  private function remove_user_from_group($username, $groupname) {
    // Check whether user exists.
    if ($this->get_user($username) === false) {
      return false;
    }

    // Check whether group exists and already contains the user.
    $group = $this->get_group($groupname);
    if (!in_array($username, $group)) {
      return false;
    }

    // Add user to group.
    $stmt = $this->db->prepare("DELETE FROM users_in_groups WHERE username = :username AND groupname = :groupname");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    return $stmt->execute();
  }

  /**
   * Removes the user from all groups and from the users list.
   */
  public function remove_user($username) {
    // Check whether user exists.
    if ($this->get_user($username) === false) {
      return false;
    }

    // Remove user from all groups.
    $stmt = $this->db->prepare("DELETE FROM users_in_groups WHERE username = :username");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    $remove_from_group_result = $stmt->execute();

    // Remove user.
    $stmt = $this->db->prepare("DELETE FROM users WHERE username = :username");
    $stmt->bindParam(':username', $username, PDO::PARAM_STR, 32);
    return $stmt->execute() && $remove_from_group_result ;
  }

  /**
   * Removes all users from the group and then the group itself.
   * Returns whether both operations were successful.
   */
  public function remove_group($groupname) {
    // Check whether group exists.
    if ($this->get_group($groupname) === false) {
      return false;
    }

    // Remove users from the group
    $stmt = $this->db->prepare("DELETE FROM users_in_groups WHERE groupname = :groupname");
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    $remove_from_group_result = $stmt->execute();

    // Remove group.
    $stmt = $this->db->prepare("DELETE FROM groups WHERE groupname = :groupname");
    $stmt->bindParam(':groupname', $groupname, PDO::PARAM_STR, 32);
    return $stmt->execute() && $remove_from_group_result;
  }
}

$service = new UserServicePortTypeImpl();
$server = new SoapServer("userservice.wsdl");
$server->setObject($service);
$server->handle();
?>
