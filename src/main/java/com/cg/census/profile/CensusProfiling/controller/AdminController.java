package com.cg.census.profile.CensusProfiling.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
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
		return service.findUserByFirstName(lastName);
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
	
//	@PostMapping("/addmember")
//	public UserFamilyMember regMember(@RequestBody UserFamilyMember user) {
//		LOG.info("Member add");
//		return service.addMember(user);
//	}
//	
//@DeleteMapping("/deleteMemberByName/{name}")
//public void deleteMember(@PathVariable(value = "name") String name) {
//		service.deleteMember(name);
//}
//
//	@DeleteMapping("/deleteMemberById/{mem_id}")
//	public void deleteMember(@PathVariable("mem_id") int mem_id) {
//		LOG.info("DeleteMember");
//	service.deleteMemberById(mem_id);
//	// This is delete
//}
//
//	@GetMapping("/getMemberByFirstName/{fname}")
//	public List<UserFamilyMember> getMemberBYFirstName(@PathVariable(value = "fname") String fname) {
//		LOG.info("Get Member by FIrst Name");
//		return service.findMemberByFirstName(fname);
//	}
//
//	@GetMapping("/getMemberByLastName/{lname}")
//	public List<UserFamilyMember> getMemberByLastName(@PathVariable(value = "lname") String lname) {
//		LOG.info("Get Member by Last Name");
//		return service.findMemberByLastName(lname);
//	}
//
//	@GetMapping("/getMemberById/{mid}")
//	public List<UserFamilyMember> getMemberById(@PathVariable(value = "mid") int mid) {
//		LOG.info("Getting Family Member by ID");
//		return service.findMemberById(mid);
//	}
//
//	@GetMapping("/getMemberByRelation/{relation}")
//	public List<UserFamilyMember> getMemberByRelation(@PathVariable(value = "relation") String relation) {
//		LOG.info("Getting Family Members By Relation");
//		return service.findByRelation(relation);
//	}
//
//	@GetMapping("/getMemberByDob/{dob}")
//	public List<UserFamilyMember> getMemberByDob(@PathVariable(value = "dob") String dob) {
//		LOG.info("Getting Family Members By Relation");
//		return service.findByDob(dob);
//	}
//	//Updating mem_id
//		@PutMapping("/updatememid")
//		public UserFamilyMember updateMemId(@RequestBody UserFamilyMember memId) {
//			LOG.info("update memId");
//			return service.updateMemId(memId);
//		}
//
//		//Updating date of birth
//		@PutMapping("/updatedob")
//		public UserFamilyMember updateMemDob(@RequestBody UserFamilyMember dob) {
//			LOG.info("update memDob");
//			return service.updateMemDob(dob);
//		}
//
//		//Updating mem_first_name
//		@PutMapping("/updatefirstname")
//		public UserFamilyMember updateMemFirstName(@RequestBody UserFamilyMember memFirstName) {
//			LOG.info("update memFirstName");
//			return service.updateMemFirstName(memFirstName);
//		}
//
//
//		//Updating mem_last_name
//		@PutMapping("/updatelastname")
//		public UserFamilyMember updateMemLastName(@RequestBody UserFamilyMember memLastName) {
//			LOG.info("update memLastName");
//			return service.updateMemLastName(memLastName);
//		}
//
//		//Updating mem_gender
//		@PutMapping("/updategender")
//		public UserFamilyMember updateMemGender(@RequestBody UserFamilyMember gender) {
//			LOG.info("update memGender");
//			return service.updateMemGender(gender);
//		}
//
//		//Updating relation
//		@PutMapping("/updaterelation")
//		public UserFamilyMember updateMemRelation(@RequestBody UserFamilyMember relation) {
//			LOG.info("update memRelation");
//			return service.updateMemRelation(relation);
//		}

}