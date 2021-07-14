package com.cg.census.profile.CensusProfiling.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.repository.UserRepository;

@Service
public class AdminService {
	public static final Logger LOG  = LoggerFactory.getLogger(UserFamilyMember.class);
	@Autowired
	private UserRepository repository;
	
	public List<User> findUserByLastName(String lastName){
		LOG.info("findUserByLastName");
		return repository.findUserByLastName(lastName);
		
	}
	
	public List<User> findUserByFirstName(String firstName){
		LOG.info("findUserByFirstName");
		return repository.findUserByFirstName(firstName);
		
	}
	public List<User> findUserByGender(String gender){
		LOG.info("findUserByGender");
		return repository.findUserByGender(gender);
		
	}
	
	public List<User> findUserByEmail(String email){
		LOG.info("findUserByEmail");
		return repository.findUserByEmail(email);
	}

	public List<User> findAllUsers() {
		return repository.findAll();
	}
	
	public User userUidUpdate(User uid) {
		LOG.info("updateUserUID");
		return repository.save(uid);
	}
	public User userFirstNameUpdate(User firstName) {
		LOG.info("pdateUserFirstName");
		return repository.save(firstName);
	}
	public User userLastNameUpdate(User lastName) {
		LOG.info("updateUserLastName");
		return repository.save(lastName);
	}
	public User userGenderUpdate(User gender) {
		LOG.info("updateUserGender");
		return repository.save(gender);
	}
	public User userEmailUpdate(User email) {
		LOG.info("updateUserEmail");
		return repository.save(email);
	}
	public User userPasswordUpdate(User password) {
		LOG.info("updateUserPassword");
		return repository.save(password);
	}
	public User userNumofkidsUpdate(User numofKids) {
		LOG.info("updateUsernumofkids");
		return repository.save(numofKids);
	}
	
	
}
