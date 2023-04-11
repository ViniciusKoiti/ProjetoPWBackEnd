package com.github.CrudGit.Services;

import com.github.CrudGit.Models.User;
import com.github.CrudGit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User create(User user){
        return userRepository.save(user);
    }
}
