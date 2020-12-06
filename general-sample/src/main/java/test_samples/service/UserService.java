package test_samples.service;

import test_samples.domain.User;
import java.util.List;

public interface UserService {

  public abstract List<User> getUsers(int number);
  public abstract User getUser(Long userId);


}
