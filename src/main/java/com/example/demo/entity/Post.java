package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Post {
	@Id 
	private int id;
	private String postDate;
	private User users;
	private String details;
	
	
//	@Id 
//	private int id;
//	private String post_date;
//	private String details;
////	@ManyToOne
////	@JoinColumn(name="user_id")
//	private User user;
//	
//	public Post() {
//	}
//
//	public Post(int id, String post_date, String details) {
//		this.id = id;
//		this.post_date = post_date;
//		this.details = details;
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
//	public String getPost_date() {
//		return post_date;
//	}
//
//	public void setPost_date(String post_date) {
//		this.post_date = post_date;
//	}
//
//	public String getDetails() {
//		return details;
//	}
//
//	public void setDetails(String details) {
//		this.details = details;
//	}
//	
	
	
	
	

}
