package Models;

import java.util.List;

public class Repository {

    private String name;
    private String link;
    private List<Commit> commit;
    private User user;

    public List<Commit> getCommit(){
        return commit;
    }
}
