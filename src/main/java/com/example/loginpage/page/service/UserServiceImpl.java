package com.example.loginpage.page.service;


import com.example.loginpage.page.model.Role;
import com.example.loginpage.page.model.User;
import com.example.loginpage.page.repository.UserRepository;
import com.example.loginpage.page.web.dto.UserRegistrationDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements  UserService{

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
      User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), registrationDto.getPassword(),
              Arrays.asList(new Role("Role User")));


      return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}