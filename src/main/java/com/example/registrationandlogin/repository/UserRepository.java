package com.example.registrationandlogin.repository;

import com.example.registrationandlogin.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long>{
    UserDetails findByEmail(String email);
}