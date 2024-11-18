package com.example.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.example.users.entities.Role;
import com.example.users.entities.User;
import com.example.users.service.ServiceUser;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class UsersmicroApplication {
	@Autowired
	ServiceUser userService;

	public static void main(String[] args) {
		SpringApplication.run(UsersmicroApplication.class, args);
	}

	

}
