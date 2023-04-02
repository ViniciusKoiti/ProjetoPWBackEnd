package Models;

import jakarta.persistence.Entity;

import java.util.Date;
@Entity
public class Commit {

    private String author;
    private Date data;
    private String comment;
    private int numberCommit;
    private Repository repository;

}
