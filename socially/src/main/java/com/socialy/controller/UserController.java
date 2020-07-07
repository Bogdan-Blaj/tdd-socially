package com.socialy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.socialy.service.UserService;
import com.socialy.shared.GenericResponse;
import com.socialy.user.User;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/api/1.0/users")
	GenericResponse createUser(@RequestBody User user) {
		userService.save(user);
		GenericResponse body = new GenericResponse("User saved");
		return body;
	}
}
