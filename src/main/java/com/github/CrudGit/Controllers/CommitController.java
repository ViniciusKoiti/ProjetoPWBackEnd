package com.github.CrudGit.Controllers;

import com.github.CrudGit.Controllers.CommitResponse.CommitResponse;
import com.github.CrudGit.Services.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/commit")
public class CommitController {
    @Autowired
    private final CommitService commitService;

    public CommitController(CommitService commitService){
        this.commitService = commitService;
    }

    @GetMapping
    public List<CommitResponse> findAllCommits(){
        return commitService.findAllCommits();
    }

}
