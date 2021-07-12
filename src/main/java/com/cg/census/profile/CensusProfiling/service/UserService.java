package com.cg.census.profile.CensusProfiling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository ;
	
	public User addUser(User user) {
	return repository.save(user);
	}
}
