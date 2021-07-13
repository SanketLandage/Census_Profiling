package com.cg.census.profile.CensusProfiling.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.repository.UserFamilyMemberRepository;

import jdk.internal.org.jline.utils.Log;

@Service
public class UserFamilyMemberService   {
	
	@Autowired
	private UserFamilyMemberRepository memRepository;
	
	public UserFamilyMember addMember(UserFamilyMember member) {
		return memRepository.save(member);
	}
	
	//GetMapping
	public List<UserFamilyMember> getAllFamilyMembers() {
		return memRepository.findAll();
	}
	
	//DeleteMapping
	public void deleteMemberById(int id) {
		memRepository.deleteById(id);
	}
}
