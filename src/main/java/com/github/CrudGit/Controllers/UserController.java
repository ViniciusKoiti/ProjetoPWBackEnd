package com.github.CrudGit.Controllers;

import com.github.CrudGit.Controllers.RequestUser.PostUserRequest;
import com.github.CrudGit.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody PostUserRequest user){
        userService.create(user);
    }


}
