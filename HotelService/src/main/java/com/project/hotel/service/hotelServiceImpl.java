package com.project.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hotel.entity.Hotel;
import com.project.hotel.exception.ResourceNotFoundExpection;
import com.project.hotel.repo.HotelRepo;

@Service
public class hotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepo hotelRepo;

	@Override
	public Hotel createHotel(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getById(String id) {
		
		return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundExpection("Hotel with given Id is not found"+id));
				
	}

}
