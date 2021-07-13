package com.cg.census.profile.CensusProfiling.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.repository.UserFamilyMemberRepository;

@Service
public class UserFamilyMemberService {
	@Autowired
	private UserFamilyMemberRepository repository;
	
	
	
	public UserFamilyMember addMember(UserFamilyMember member) {
		return repository.save(member);
	}
	
	public UserFamilyMember getMembers(int uid ){
		return repository.findAllById(uid).get(uid);
	}
}
