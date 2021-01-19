package com.programming.techie.springngblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.programming.techie.springngblog.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
