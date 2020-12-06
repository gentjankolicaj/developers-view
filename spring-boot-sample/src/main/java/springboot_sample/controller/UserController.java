package springboot_sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springboot_sample.domain.User;
import springboot_sample.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{userNumber}",method = RequestMethod.GET,produces = "application/json")
    private List<User> showUsers(@PathVariable("userNumber") Integer userNumber){
       return userService.getUsers(userNumber);
    }

}
