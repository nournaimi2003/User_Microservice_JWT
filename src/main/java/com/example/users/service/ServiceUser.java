package com.example.users.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.users.entities.Role;
import com.example.users.entities.User;
@Service
public interface ServiceUser {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();


}
