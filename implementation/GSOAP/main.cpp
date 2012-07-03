#include <iostream>

#include "./userservice.h"

int main(void) {
  using userservice::userservice;
  userservice us;

  us.add_user("hpz", "Hans-Peter", "Zorn", false, 35);
  std::cout << us.user_info("hpz").firstname << "\n\n";

  us.add_group("testers");
  us.add_user_to_group("hpz", "testers");
  std::vector<std::string>& group0 = us.group_info("testers");
  std::for_each(std::begin(group0), std::end(group0),
                [](const std::string user) { std::cout << user << "\n"; });
  std::cout << "\n";

  us.remove_user("hpz");
  std::vector<std::string>& group1 = us.group_info("testers");
  std::for_each(std::begin(group1), std::end(group1),
                [](const std::string user) { std::cout << user << "\n"; });
  std::cout << "\n";

  return 0;
}
