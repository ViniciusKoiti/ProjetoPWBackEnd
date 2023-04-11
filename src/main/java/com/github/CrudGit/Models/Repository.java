package com.github.CrudGit.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Repository {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String link;
    @OneToMany(mappedBy = "repository")
    private List<Commit> commit;

    @Temporal(TemporalType.DATE)
    private Date initDate;
    @Temporal(TemporalType.DATE)
    private Date finalDate;
    @ManyToOne
    private User user;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setCommit(List<Commit> commit) {
        this.commit = commit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Commit> getCommit(){
        return commit;
    }
}
