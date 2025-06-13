package com.project.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.hotel.entity.Hotel;
import com.project.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@PostMapping()
	ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel h= hotelService.createHotel(hotel);
		return new ResponseEntity<Hotel>(h,HttpStatus.CREATED);
	}
	
	@GetMapping()
	ResponseEntity<List<Hotel>> getAll(){
		List<Hotel> h=hotelService.getAll();
		return new ResponseEntity<List<Hotel>>(h,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	ResponseEntity<Hotel> getHotelById(@RequestParam String id){
		Hotel h=hotelService.getById(id);
		return new ResponseEntity<Hotel>(h,HttpStatus.OK);
	}
}
