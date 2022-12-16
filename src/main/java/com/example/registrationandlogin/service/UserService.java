package com.example.registrationandlogin.service;

import com.example.registrationandlogin.model.UserDetails;
import com.example.registrationandlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
    UserDetails save(UserRegistrationDto registrationDto);
}