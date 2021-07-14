package com.cg.census.profile.CensusProfiling.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.service.AdminService;

@RestController
public class AdminController {
public static final Logger LOG = LoggerFactory.getLogger(User.class);
	
	@Autowired
	private AdminService service ;
	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		LOG.info("AllUsers");
		return service.findAllUsers();
	}

	@GetMapping("/getbyfirstname/{firstName}")
	public List<User> getByFirstName(@PathVariable("firstName") String firstName) {
		LOG.info("getByFirstName");
		return service.findUserByFirstName(firstName);
	}


	@GetMapping("/getbylastname/{lastName}")
	public List<User> getByLastName(@PathVariable("lastName") String lastName) {
		LOG.info("getBylastName");
		return service.findUserByLastName(lastName);
	}

	
	//Get user by Email
	@GetMapping("/getbyemail/{email}")
	public List<User> getByEmail(@PathVariable("email") String email) {
		LOG.info("getByEmail");
		return service.findUserByEmail(email);
	}


	@GetMapping("/getbyeGender/{gender}")
	public List<User> getByGender(@PathVariable("gender") String gender) {
		LOG.info("getByEmail");
		return service.findUserByGender(gender);
	}
	
	@PutMapping("/updatinguid")
	public User userUidUpdate(@RequestBody User uid) {
		LOG.info("updateUserUID");
		return service.userUidUpdate(uid);
	}

	@PutMapping("/updatingfirstname")
	public User userFirstNameUpdate(@RequestBody User firstName) {
		LOG.info("updateUserFirstName");
		return service.userFirstNameUpdate(firstName);
	}

	@PutMapping("/updatinglastname")
	public User userLastNameUpdate(@RequestBody User lastName) {
		LOG.info("updateUserLastName");
		return service.userLastNameUpdate(lastName);
	}

	@PutMapping("/updatinggender")
	public User userGenderUpdate(@RequestBody User gender) {
		LOG.info("updateUserGender");
		return service.userGenderUpdate(gender);
	}

	@PutMapping("/updatingemail")
	public User userEmailUpdate(@RequestBody User email) {
		LOG.info("updateUserEmail");
		return service.userEmailUpdate(email);
	}

	@PutMapping("/updatingpassword")
	public User userPasswordUpdate(@RequestBody User password) {
		LOG.info("updateUserPassword");
		return service.userPasswordUpdate(password);
	}

	@PutMapping("/updatingnumofkids")
	public User userNumofkidsUpdate(@RequestBody User numofKids) {
		LOG.info("updateUsernumofkids");
		return service.userNumofkidsUpdate(numofKids);
	}

}
