package com.project.hotel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hotel.entity.Hotel;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,String>{

}
