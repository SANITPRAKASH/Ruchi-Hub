package com.nanu.ruchihub.repository;

import com.nanu.ruchihub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String username);

}
