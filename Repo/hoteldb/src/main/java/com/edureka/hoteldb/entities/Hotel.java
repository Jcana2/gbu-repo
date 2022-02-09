package com.edureka.hoteldb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Builder
public class Hotel {
	@Id
	@GeneratedValue
	Long id;
	String name;
	String description;
	String city;
	int rating;
	public Hotel(Long id, String name, String description, String city, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.city = city;
		this.rating = rating;
	}
	public Hotel() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
