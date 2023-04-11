package com.github.CrudGit.Repository;

import com.github.CrudGit.Models.Commit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommitRepository extends JpaRepository<Commit,Long> {


}
