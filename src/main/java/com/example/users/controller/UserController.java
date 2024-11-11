package com.example.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.entities.User;
import com.example.users.service.ServiceUser;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	ServiceUser userService;

	@GetMapping("all")
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}

}
