package com.xworkz.restaurants.dao;

import com.xworkz.restaurants.dto.RestaurantsDto;

public interface RestaurantsDao {

	public void insertRestaurantsDetail(RestaurantsDto dto);
	
	public void updateNameById(String name,int id);
	
	public void deleteById(int id);
}
