package com.security.springSecurity.repo;

import com.security.springSecurity.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepo extends JpaRepository<Users,Integer> {
    User findByUserName(String username);
}
