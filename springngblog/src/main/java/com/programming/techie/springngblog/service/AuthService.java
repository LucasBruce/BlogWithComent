package com.programming.techie.springngblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programming.techie.springngblog.dto.RegisterRequest;
import com.programming.techie.springngblog.model.User;
import com.programming.techie.springngblog.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	
    public void signup(RegisterRequest registerRequest) {
    	User user = new User();
    	user.setUsername(registerRequest.getUsername());
    	user.setEmail(registerRequest.getEmail());
    	user.setPassword(registerRequest.getPassword());
    	
    	userRepository.save(user);
    }
}
