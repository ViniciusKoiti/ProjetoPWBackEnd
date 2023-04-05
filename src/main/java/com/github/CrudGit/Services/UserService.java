package com.github.CrudGit.Services;

import com.github.CrudGit.Controllers.RequestUser.PostUserRequest;
import com.github.CrudGit.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(PostUserRequest user){
        userRepository.save(user.toUserModel(user.getName(),user.getRepositories()));
    }
}
