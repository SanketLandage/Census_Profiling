package com.cg.census.profile.CensusProfiling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.service.UserFamilyMemberService;
@RestController
public class UserFamilyMemberController {
	public static final Logger LOG  = LoggerFactory.getLogger(UserFamilyMember.class);
	
	@Autowired
	private UserFamilyMemberService service;
	
	@PostMapping("/addmember")
	public UserFamilyMember regMember(@RequestBody UserFamilyMember user) {
		LOG.info("Member add");
		return service.addMember(user);
	}
	
	@DeleteMapping("/deletemember/{name}")
	public void deleteMember(@PathVariable (value="name") String name) {
		service.deleteMember(name);
	}
	
}
