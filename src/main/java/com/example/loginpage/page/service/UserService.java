package com.example.loginpage.page.service;

import com.example.loginpage.page.model.User;
import com.example.loginpage.page.web.dto.UserRegistrationDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService  extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
