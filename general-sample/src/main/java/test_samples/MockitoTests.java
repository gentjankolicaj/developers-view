package test_samples;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import test_samples.domain.User;
import test_samples.service.UserServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTests {

  private UserServiceImpl userServiceImpl;

        @Before
        public void setUp(){
            userServiceImpl = mock(UserServiceImpl.class);
        }

        @Test
        public void testUser(){

            User user=userServiceImpl.getUser(1L);
            when(user).thenReturn(user);

            int numberOfUsers=10;
            Assert.assertEquals(userServiceImpl.getUsers(numberOfUsers).size(),numberOfUsers);

        }

}
