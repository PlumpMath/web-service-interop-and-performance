#include <string>
#include <vector>
#include <map>
#include <algorithm>

#ifndef USERSERVICE_H_
#define USERSERVICE_H_

namespace userservice {

struct user {
  std::string username;
  std::string firstname;
  std::string lastname;
  int age;
  bool gender;
};

class userservice {
 public:
  typedef std::pair<std::string, std::vector<std::string> > group;

  userservice() {
    invalid_user_.firstname = "null";
    invalid_user_.lastname = "null";
    invalid_user_.age = 1;
  }

  bool add_user(const std::string username, const std::string firstname,
                const std::string lastname, bool gender, int age) {
    if (get_user(username) != users_.end()) {
      return false;
    }

    user u;
    u.username = username;
    u.firstname = firstname;
    u.lastname = lastname;
    u.gender = gender;
    u.age = age;
    users_.push_back(u);
    return true;
  }

  bool remove_user(const std::string username) {
    auto it = get_user(username);
    if (it == users_.end()) {
      return false;
    }
    users_.erase(it);
    for(auto i = groups_.begin(); i != groups_.end(); ++i) {
      std::vector<std::string>& users = i->second;
      auto it = std::find_if(users.begin(), users.end(),
                             [&username](const std::string& name) {
                                return name == username;
                             });
      if (it != users.end()) {
        users.erase(it);
      }
    }
    return true;
  }

  bool add_group(const std::string& groupname) {
    if (get_group(groupname) != groups_.end()) {
      return false;
    }
    groups_[groupname];
    return true;
  }

  bool remove_group(const std::string& groupname) {
    auto it = get_group(groupname);
    if (it == groups_.end()) {
      return false;
    }
    groups_.erase(it);
    return true;
  }

  user& user_info(const std::string& username) {
    auto it = get_user(username);
    if (it == users_.end()) {
      return invalid_user_;
    }
    return *it;
  }

  std::vector<std::string>& group_info(const std::string& groupname) {
    auto it = get_group(groupname);
    if (it == groups_.end()) {
      return invalid_group_;
    }
    return it->second;
  }

  bool add_user_to_group(const std::string username,
                         const std::string groupname) {
    auto group_it = get_group(groupname);
    if (group_it == groups_.end()) {
      return false;
    }

    auto user_it = get_user(username);
    if (user_it == users_.end()) {
      return false;
    }

    auto user_in_group = std::find_if(group_it->second.begin(),
                                      group_it->second.end(),
                                      [&username](const std::string& u) {
                                        return u == username;
                                      });
    if (user_in_group != group_it->second.end()) {
      return false;
    }

    group_it->second.push_back(username);
    return true;
  }

  bool remove_user_from_group(const std::string username,
                              const std::string groupname) {
    auto group_it = get_group(groupname);
    if (group_it == groups_.end()) {
      return false;
    }

    auto user_it = get_user(username);
    if (user_it == users_.end()) {
      return false;
    }

    auto user_in_group = std::find_if(group_it->second.begin(),
                                      group_it->second.end(),
                                      [&username](const std::string& u) {
                                        return u == username;
                                      });
    if (user_in_group == group_it->second.end()) {
      return false;
    }

    group_it->second.erase(user_in_group);
    return true;
  }

 private:
  std::vector<user>::iterator get_user(const std::string& username) {
    return std::find_if(users_.begin(), users_.end(),
                        [&username](const user& u) {
                          return u.username == username;
                        });
  }

  std::map<std::string, std::vector<std::string> >::iterator get_group(
      const std::string& groupname) {
    return std::find_if(groups_.begin(), groups_.end(),
                        [&groupname](const group& g) {
                          return g.first == groupname;
                        });
  }

  std::vector<user> users_;
  std::map<std::string, std::vector<std::string> > groups_;

  static user invalid_user_;
  static std::vector<std::string> invalid_group_;
};

user userservice::invalid_user_;
std::vector<std::string> userservice::invalid_group_;

}  // namespace userservice

#endif  // USERSERVICE_H_
