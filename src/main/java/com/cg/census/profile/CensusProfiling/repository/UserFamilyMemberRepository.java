package com.cg.census.profile.CensusProfiling.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.census.profile.CensusProfiling.model.UserFamilyMember;

@Repository
public interface UserFamilyMemberRepository extends JpaRepository<UserFamilyMember, Integer>{
	//public abstract List<User> findByfirstName(String firstName);
	public abstract Long deleteBymemFirstName(String name);

}
