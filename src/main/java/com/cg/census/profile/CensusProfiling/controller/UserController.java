package com.cg.census.profile.CensusProfiling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.service.UserService;

@RestController
public class UserController  {
	public static final Logger LOG = LoggerFactory.getLogger(User.class);
	
	@Autowired
	private UserService service ;
	
	@PostMapping("/register")
	public User userRegister(@RequestBody User user) {
		LOG.info("addEmp");
		return service.userRegister(user);
	}
	
}
