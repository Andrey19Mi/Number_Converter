package com.example.test_task.model.user;

import com.example.test_task.model.user.dto.UserInputDTO;
import com.example.test_task.model.user.dto.UserOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserOutputDTO createUser(@RequestBody UserInputDTO user){
        return userService.createUser(user);
    }
}
