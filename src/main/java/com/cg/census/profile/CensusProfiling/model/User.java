package com.cg.census.profile.CensusProfiling.model;
import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "users_reg")
public class User {
	@Id
	private int uid;
	@Column
	private String firstName;
	
	@Column
	private String lastName;

	public User() {
		super();
	}

	public User(int uid, String firstName, String lastName) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}	
	
	
}
