package com.github.CrudGit.Controllers;

import com.github.CrudGit.Models.User;
import com.github.CrudGit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }
}
