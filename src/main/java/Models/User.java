package Models;

import java.util.List;

public class User {

    private String name;
    private List<Repository> repositories;

    public List<Repository> getRepositories(){
        return repositories;
    }
}
