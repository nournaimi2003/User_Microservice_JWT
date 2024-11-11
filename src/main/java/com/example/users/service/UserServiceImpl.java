package com.example.users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.users.entities.User;
import com.example.users.repo.RoleRepository;
import com.example.users.repo.UserRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class UserServiceImpl  implements ServiceUser{
	
	@Autowired
	UserRepository userRep;
	
	@Autowired
	RoleRepository roleRep;
	
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public User saveUser(User user) {

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRep.save(user);
	}


	@Override
	public User findUserByUsername(String username) {
		return userRep.findByUsername(username);
	}


	@Override
	public com.example.users.entities.Role addRole(com.example.users.entities.Role role) {
		return roleRep.save(role);
	}


	@Override
	public User addRoleToUser(String username, String rolename) {
		User usr = userRep.findByUsername(username);
		com.example.users.entities.Role r = roleRep.findByRole(rolename);
		
		usr.getRoles().add(r);
		return usr;
	}
	@Override
	public List<User> findAllUsers() {
		return userRep.findAll();
	}
	
	
}
