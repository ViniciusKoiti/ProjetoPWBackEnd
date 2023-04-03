package Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Commit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String author;
    @Temporal(TemporalType.DATE)
    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate data;
    @Column(nullable = false)
    private String comment;
    @Column(nullable = false)
    private int numberCommit;
    @ManyToOne
    private Repository repository;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getNumberCommit() {
        return numberCommit;
    }

    public void setNumberCommit(int numberCommit) {
        this.numberCommit = numberCommit;
    }


}
