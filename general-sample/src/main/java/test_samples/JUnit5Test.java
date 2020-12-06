package test_samples;


import org.junit.jupiter.api.Test;
import test_samples.domain.User;
import test_samples.service.UserServiceImpl;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5Test {

    private final UserServiceImpl userServiceImpl=new UserServiceImpl();

    @Test
    public void testUserNumber(){

        int numberOfUsers=50;
        List<User> users=userServiceImpl.getUsers(numberOfUsers);

        assertEquals(numberOfUsers,users.size());

        assertEquals(numberOfUsers+3,users.size());

    }


}
