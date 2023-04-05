package com.github.CrudGit.Repository;

import com.github.CrudGit.Models.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryRepository extends JpaRepository<Repository,Long> {
}
