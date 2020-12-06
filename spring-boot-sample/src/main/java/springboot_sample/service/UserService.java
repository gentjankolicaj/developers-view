package springboot_sample.service;


import springboot_sample.domain.User;

import java.util.List;

public interface UserService {

  public abstract List<User> getUsers(int number);
  public abstract User getUser(Long userId);


}
