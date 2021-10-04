package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity

public class Location {
	@Id 
	private int id;
	private String name;
//	@OneToMany(mappedBy="location")
	private User users;
	
	
//	@Id 
//	private int id;
//	private String name;
//	@OneToMany(mappedBy="location")
//	private List<User> users;
//	public Location() {
//	}
//	public Location(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	
	
}
