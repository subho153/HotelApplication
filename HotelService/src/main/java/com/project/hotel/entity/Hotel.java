package com.project.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="hotelTbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String location;
	private String about;

}
