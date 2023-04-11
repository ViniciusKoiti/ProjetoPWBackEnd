package com.github.CrudGit.Repository;

import com.github.CrudGit.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
