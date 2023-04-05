package com.github.CrudGit.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Repository> repositories;

    public List<Repository> getRepositories(){
        return repositories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    public User(String name,List<Repository> repositories){
        name = this.name;
        repositories = this.repositories;
    }
}
