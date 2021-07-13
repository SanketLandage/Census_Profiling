package com.cg.census.profile.CensusProfiling.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.repository.UserFamilyMemberRepository;

@Service
public class UserFamilyMemberService   {
	
	@Autowired
	private UserFamilyMemberRepository memRepository;
	
	public UserFamilyMember addMember(UserFamilyMember member) {
		return memRepository.save(member);
	}
	
	@Transactional
	public void deleteMember(String name) {
		memRepository.deleteBymemFirstName(name);
	}

	public void deleteMemberById(int mem_id) {
		memRepository.deleteById(mem_id);
		
	}
	
}
