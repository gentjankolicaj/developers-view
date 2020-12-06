package springboot_sample.service;

import org.springframework.stereotype.Service;
import springboot_sample.domain.User;


import java.util.ArrayList;
import java.util.List;



@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers(int number) {

        List<User> users=new ArrayList<>(number);
        for(int i=1;i<number+1;i++)
            users.add(new User(Integer.toUnsignedLong(i),"Username-"+i,"Password-"+i));

            return users;
    }

    @Override
    public User getUser(Long userId) {
        return new User(userId,"Username+"+userId,"password+"+userId);
    }
}
