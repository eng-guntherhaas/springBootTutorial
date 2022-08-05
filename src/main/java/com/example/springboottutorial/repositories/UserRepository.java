package com.example.springboottutorial.repositories;

import com.example.springboottutorial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
