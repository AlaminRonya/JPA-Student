package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id 
	private int id;
	private String firstName;
	private String lastName;
	private Location location;
	private String email;
	private Post posts;
	public User() {
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Id 
//	private int id;
//	private String firstname;
//	private String lastname;
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	private Location location;
//	private String email;
////	@OneToMany(mappedBy="user") 
//	private List<Post> posts;
//	
//	public User() {
//	}
//
//	public User(int id, String firstname, String lastname, Location location, String email) {
//		this.id = id;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.location = location;
//		this.email = email;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public Location getLocation() {
//		return location;
//	}
//
//	public void setLocation(Location location) {
//		this.location = location;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	
	
	
	
	
	
	
	
}
