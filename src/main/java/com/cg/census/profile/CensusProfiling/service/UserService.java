package com.cg.census.profile.CensusProfiling.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.census.profile.CensusProfiling.model.User;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;
import com.cg.census.profile.CensusProfiling.repository.UserFamilyMemberRepository;
import com.cg.census.profile.CensusProfiling.repository.UserRepository;


@Service
public class UserService {
	public static final Logger LOG  = LoggerFactory.getLogger(UserFamilyMember.class);
	@Autowired
	private UserRepository repository ;
	
	
	public User userRegister(User user) {
	return repository.save(user);
	}
	
//	public List<User> findUserByFirstName(String firstName){
//		LOG.info("findUserByFirstName");
//		return repository.findUserByFirstName(firstName);
//		
//	}
	
//	public List<User> findUserByLastName(String lastName){
//		LOG.info("findUserByLastName");
//		return repository.findUserByLastName(lastName);
//		
//	}
//	
//	public List<User> findUserByGender(String gender){
//		LOG.info("findUserByGender");
//		return repository.findUserByGender(gender);
//		
//	}
//	
//	public List<User> findUserByEmail(String email){
//		LOG.info("findUserByEmail");
//		return repository.findUserByEmail(email);
//	}
//
//	public List<User> findAllUsers() {
//		return repository.findAll();
//	}
	
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

	public List<UserFamilyMember> findMemberByFirstName(String firstName) {
		return memRepository.findBymemFirstName(firstName);
	}

	public List<UserFamilyMember> findMemberByLastName(String lastName) {
		return memRepository.findBymemLastName(lastName);
	}

	public List<UserFamilyMember> findMemberById(int mId) {
		return memRepository.findBymemId(mId);
	}

	public List<UserFamilyMember> findByRelation(String relation) {
		return memRepository.findByrelation(relation);
	}

	public List<UserFamilyMember> findByDob(String dob) {
		return memRepository.findBydob(dob);
	}

	//Updating info

		public UserFamilyMember updateMemId(UserFamilyMember memId) {
			return memRepository.save(memId);
		}

		public UserFamilyMember updateMemDob(UserFamilyMember dob) {
			return memRepository.save(dob);
		}

		public UserFamilyMember updateMemFirstName(UserFamilyMember memFirstName) {
			return memRepository.save(memFirstName);
		}

		public UserFamilyMember updateMemLastName(UserFamilyMember memLastName) {
			return memRepository.save(memLastName);
		}

		public UserFamilyMember updateMemGender(UserFamilyMember gender) {
			return memRepository.save(gender);
		}

		public UserFamilyMember updateMemRelation(UserFamilyMember relation) {
			return memRepository.save(relation);
		}	

}
