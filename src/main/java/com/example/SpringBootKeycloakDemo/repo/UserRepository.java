package com.example.SpringBootKeycloakDemo.repo;

import com.example.SpringBootKeycloakDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
