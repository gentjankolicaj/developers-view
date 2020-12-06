package test_samples;

import org.junit.Test;
import test_samples.service.UserServiceImpl;
import test_samples.domain.User;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class JUnit4Test {

    private final UserServiceImpl userServiceImpl=new UserServiceImpl();

    @Test
    public void testUserNumber(){

        int numberOfUsers=50;
        List<User> users=userServiceImpl.getUsers(numberOfUsers);

        assertEquals(numberOfUsers,users.size());

        assertEquals(numberOfUsers+3,users.size());

    }


}
