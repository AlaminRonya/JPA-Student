package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Location;
import com.example.demo.service.LocationService;

@RestController 
public class LocationController {
	@Autowired 
	private LocationService locationService;
	@GetMapping("/locations")
	public List<Location> getAllPosts(){
		return locationService.findAll();	
	}
	
	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Integer id) {
		return locationService.findById(id);
	}

}
