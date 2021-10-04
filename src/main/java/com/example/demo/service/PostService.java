package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;

@Service 
public class PostService {
	@Autowired 
	private PostRepository postRepository;
	
//	public List<Post>getAllPosts(){
//		List<Post> posts = new ArrayList<>();
//		postRepository.findAll().forEach(posts::add);
//		return posts;
//	}
	public List<Post> findAll() {
		return (List<Post>) postRepository.findAll();
	}
//	public Optional<Post> getPostById(Integer id) {
//		return postRepository.findById(id);
//	}
	public Optional<Post> findById(Integer id) {
		return postRepository.findById(id);
	}

	
	
	

//	public void addPost(Post post) {
//		postRepository.save(post);
//	}
//	
//	public void updatePost(String id, Post post) {
//		postRepository.save(post);
//	}
	
//	public void deletePost(String id) {
//	     postRepository.deleteById(id);	
//	}

}
