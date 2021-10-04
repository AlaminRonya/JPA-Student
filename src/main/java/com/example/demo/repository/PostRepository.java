package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Post;
@Repository 
public interface PostRepository extends JpaRepository<Post, Integer> {

//	public List<Post> findByUserId(String userId);

}
