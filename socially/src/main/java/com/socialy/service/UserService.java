package com.socialy.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.socialy.repository.UserRepository;
import com.socialy.user.User;

@Service
public class UserService {

	UserRepository userRepository;
	
	BCryptPasswordEncoder passwordEncoder;
	
	//for constructor injections
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
		this.passwordEncoder = new BCryptPasswordEncoder();
	}
	
	public User save(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}
	
}
