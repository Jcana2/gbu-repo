package com.edureka.hoteldb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.edureka.hoteldb.entities.Hotel;
import com.edureka.hoteldb.repositories.HotelRepository;

/**
 * 
 * @author Jhoj Cana 2122891
 *
 */

@SpringBootApplication
public class HoteldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoteldbApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedDatabase(HotelRepository hotelRepository) {
		return args -> {
			hotelRepository.save(new Hotel(1L, "Journey B&B", "A clean and basic hotel", "Bangalore", 3));
			hotelRepository.save(new Hotel(2L, "Hotel Sunshine", "Beach hotel with free breakfast", "Virginia Beach", 4));
			hotelRepository.save(new Hotel(3L, "Comfort Inn", "Cozy and comfy hotel", "NYC", 3));
			hotelRepository.save(new Hotel(4L, "Lively Hotel", "Hotel with entertainment", "Las Vegas", 4));
			hotelRepository.save(new Hotel(5L, "Hotel Superstar", "Hotel with live singing", "NYC", 4));
			hotelRepository.save(new Hotel(6L, "Flower Inn", "Small inn with beautiful gardens", "Dallas", 3));
			hotelRepository.save(new Hotel(7L, "Hotel Raindrop", "Hotel with a free pool", "Orlando", 2));
			hotelRepository.save(new Hotel(8L, "Animal Inn", "Hotel with a zoo", "Sandusky", 3));
			hotelRepository.save(new Hotel(9L, "Palm Inn", "Beachside Inn", "Tampa", 2));
			hotelRepository.save(new Hotel(10L, "Recreation Inn", "Inn with tennis and basketball courts", "Topeka", 3));
			hotelRepository.save(new Hotel(11L, "Hotel Breeze", "Beachside hotel with free drinks", "Virginia Beach", 4));
			hotelRepository.save(new Hotel(12L, "Crimson Inn", "Hotel with celebrity guests", "Hollywood", 4));
		};
	}
	
}
