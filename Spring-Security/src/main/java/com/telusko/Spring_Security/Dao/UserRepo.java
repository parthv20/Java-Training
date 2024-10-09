package com.telusko.Spring_Security.Dao;

import com.telusko.Spring_Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    User findByUsername(String username);
}
