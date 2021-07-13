package com.cg.census.profile.CensusProfiling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.repository.UserRepository;

import jdk.internal.org.jline.utils.Log;

@Service
public class UserService {
	@Autowired
	private UserRepository repository ;
	
	public User userRegister(User user) {
	return repository.save(user);
	}
	
	public List<User> findUserByFirstName(String firstName){
		Log.info("findUserByFirstName");
		return repository.findUserByFirstName(firstName);
		
	}
	
	public List<User> findUserByLastName(String lastName){
		Log.info("findUserByLastName");
		return repository.findUserByLastName(lastName);
		
	}
	
	public List<User> findUserByGender(String gender){
		Log.info("findUserByGender");
		return repository.findUserByGender(gender);
		
	}
	
	public List<User> findUserByEmail(String email){
		Log.info("findUserByEmail");
		return repository.findUserByEmail(email);
		
	}
}
