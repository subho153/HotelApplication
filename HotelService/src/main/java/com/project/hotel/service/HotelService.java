package com.project.hotel.service;

import java.util.List;

import com.project.hotel.entity.Hotel;

public interface HotelService {
	
	// create
	Hotel createHotel(Hotel hotel);
	
	// get All 
	List<Hotel> getAll();
	
	//getByID
	Hotel getById(String id);

}
