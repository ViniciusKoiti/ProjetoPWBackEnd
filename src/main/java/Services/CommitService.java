package Services;

import Controllers.CommitResponse.CommitResponse;
import Models.Repository;
import Models.User;
import Repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class CommitService {
    private final UserRepository userRepository;

    public CommitService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<CommitResponse> findAllCommits(){
        List<User> users = userRepository.findAll().stream().toList();
        List<CommitResponse> commitResponses = new ArrayList<CommitResponse>();
        for (User user: users) {
            CommitResponse commitResponse = constructCommitResponse(user);
            commitResponses.add(commitResponse);
        }
        return commitResponses;
    }

    private CommitResponse constructCommitResponse(User user) {

        CommitResponse commitResponse = new CommitResponse();

        for (Repository repository: user.getRepositories()
             ) {

        }

        return commitResponse;

    }
}
