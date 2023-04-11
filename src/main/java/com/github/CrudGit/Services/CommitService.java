package com.github.CrudGit.Services;

import com.github.CrudGit.Controllers.CommitResponse.CommitResponse;
import com.github.CrudGit.Controllers.CommitResponse.UtilResponse.UtilResponse;
import com.github.CrudGit.Models.Commit;
import com.github.CrudGit.Models.Repository;
import com.github.CrudGit.Models.User;
import com.github.CrudGit.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;
@Service
public class CommitService {
    private final UserRepository userRepository;

    public CommitService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<CommitResponse> findAllCommits(){
        List<User> users = userRepository.findAll().stream().toList();
        List<CommitResponse> commitResponses = new ArrayList<>();
        for (User user: users) {
            CommitResponse commitResponse = constructCommitResponse(user);
            commitResponses.add(commitResponse);
        }
        return commitResponses;
    }

    private long getDaysDifference(Date initDate, Date finalDate){
        long diferenceOfTime = initDate.getTime() - finalDate.getTime();
        return (diferenceOfTime / (1000*60*60*24)) % 365;
    }

    private double percentualCommitByTime(CommitResponse commitResponse){
        return commitResponse.getCountCommit() / (int) getDaysDifference(commitResponse.getInitDate(),commitResponse.getFinalDate());
    }
    private void updateCommitResponseByRepository(CommitResponse commitResponse,Repository repository){
        commitResponse.setCountCommit(repository.getCommit().size());
        commitResponse.setFinalDate(repository.getFinalDate());
        commitResponse.setInitDate(repository.getInitDate());
        Map<LocalDate, Integer> commitsByDay = countCommitByDay(repository.getCommit());
        List<String> commentsCommits = commentAboutCommit(commitsByDay);
        commitResponse.setResumeCommit(commentsCommits);
        commitResponse.setPercentualCommit(percentualCommitByTime(commitResponse));
        commitResponse.setUrlLink(getUrlGit(repository.getName(),commitResponse.getNameUser()));
    }

    private CommitResponse constructCommitResponse(User user) {
        CommitResponse commitResponse = new CommitResponse();

        commitResponse.setNameUser(user.getName());
        commitResponse.setRepositories(user.getRepositories());

        for (Repository repository : user.getRepositories()){
            updateCommitResponseByRepository(commitResponse,repository);
        }

        return commitResponse;

    }

    private Map<LocalDate, Integer> countCommitByDay(List<Commit> commits){
        Map<LocalDate,Integer> commitCountByDay = new HashMap<>();
        for(Commit commit: commits){
            LocalDate date = commit.getData();
            commitCountByDay.put(date,commitCountByDay.getOrDefault(date,0) + 1);
        }
        return commitCountByDay;
    }

    private ArrayList<String> commentAboutCommit(Map<LocalDate, Integer> countedCommitByDay){
        ArrayList commentsAboutCommit = new ArrayList<>();

        for(Map.Entry<LocalDate, Integer> key : countedCommitByDay.entrySet()){
            LocalDate date = key.getKey();
            int countByDay = key.getValue();
            String commentAboutCommit = String.format(UtilResponse.MSG_RESUMO_COMMIT,date,countByDay);
            commentsAboutCommit.add(commentAboutCommit);
        }
        return commentsAboutCommit;
    }

    private String getUrlGit(String user,String repository){
        return String.format(UtilResponse.URL_GITHUB_REPOSITORY,user,repository);
    }
}
