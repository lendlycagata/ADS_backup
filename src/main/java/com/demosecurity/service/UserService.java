package com.demosecurity.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import com.demosecurity.model.User;
import com.demosecurity.webdto.UserRegistrationDto;




public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
