package Controllers.CommitResponse;

import Models.Repository;

import java.util.Date;
import java.util.List;

public class CommitResponse {

    private String nameUser;
    private Date initDate;
    private Date finalDate;
    private int countCommit;
    private List<Repository> repositories;
    private double percentualCommit;
    private List<String> resumeCommit;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public int getCountCommit() {
        return countCommit;
    }

    public void setCountCommit(int countCommit) {
        this.countCommit = countCommit;
    }

    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    public double getPercentualCommit() {
        return percentualCommit;
    }

    public void setPercentualCommit(double percentualCommit) {
        this.percentualCommit = percentualCommit;
    }

    public List<String> getResumeCommit() {
        return resumeCommit;
    }

    public void setResumeCommit(List<String> resumeCommit) {
        this.resumeCommit = resumeCommit;
    }
}
