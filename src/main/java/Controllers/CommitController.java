package Controllers;

import Controllers.CommitResponse.CommitResponse;
import Services.CommitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommitController {

    private final CommitService commitService;
    @Autowired
    public CommitController(CommitService commitService){
        this.commitService = commitService;
    }

    @GetMapping
    public List<CommitResponse> findAllCommits(){
        return commitService.findAllCommits();
    }



}
