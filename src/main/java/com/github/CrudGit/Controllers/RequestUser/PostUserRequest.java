package com.github.CrudGit.Controllers.RequestUser;

import com.github.CrudGit.Models.Repository;
import com.github.CrudGit.Models.User;

import java.util.List;


public class PostUserRequest {

    private String name;
    private List<Repository> repositories;


    public User toUserModel(String name,List<Repository> repositories){
        return new User(name,repositories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }
}
