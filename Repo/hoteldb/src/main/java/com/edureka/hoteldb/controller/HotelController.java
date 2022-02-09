package com.edureka.hoteldb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edureka.hoteldb.entities.Hotel;
import com.edureka.hoteldb.repositories.HotelRepository;


@RestController
public class HotelController {

	@Autowired
	HotelRepository repository;
	
	@GetMapping("/hotel/{id}")
	public Hotel get(@PathVariable String id) {
		return repository.findById(Long.parseLong(id)).get();
	}
	
//	@RequestMapping("/")
//	public String hello() {
//		return "hello!";
//	}
	
}
