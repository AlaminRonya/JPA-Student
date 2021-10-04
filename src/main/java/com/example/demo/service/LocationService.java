
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Location;
import com.example.demo.entity.Post;
import com.example.demo.repository.LocationRepository;

@Service 
public class LocationService {
	@Autowired 
	private LocationRepository locationRepository;
//	public List<Location>getAllLocations(){
//		List<Location> locations = new ArrayList<>();
//		locationRepository.findAll().forEach(locations::add);
//		return locations;
//	}
//	public Optional<Location> getLocationById(Integer id) {
//		return locationRepository.findById(id);
//	}
	public List<Location> findAll() {
		return (List<Location>) locationRepository.findAll();
	}
	public Optional<Location> findById(Integer id) {
		return locationRepository.findById(id);
	}
	

}
