package com.xworkz.restaurants.dao;

import java.util.List;

import com.xworkz.restaurants.dto.RestaurantsDto;

public interface RestaurantsDao {
	
	public List<RestaurantsDto> readAllRecords();

	public void insertRestaurantsDetail(RestaurantsDto dto);
	
	public void updateNameById(String name,int id);
	
	public void deleteById(int id);
	
	
}
