package com.xworkz.restaurants.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xworkz.restaurants.dto.RestaurantsDto;

public class RestaurantsDaoImpl implements RestaurantsDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void insertRestaurantsDetail(RestaurantsDto dto) {
		String sql = "INSERT INTO restaurant_table " + "(ID,NAME,LOCATION) VALUES(?,?,?)";
		jdbcTemplate.update(sql, new Object[] { dto.getId(), dto.getName(), dto.getLocation() });
		System.out.println("inserted record:" + dto);
		return;

	}

	@Override
	public void updateNameById(String name, int id) {

		String query = "update restaurant_table set name=? where id=?";
		jdbcTemplate.update(query, name, id);
		System.out.println("updated :" + id);
		return;

	}

	@Override
	public void deleteById(int id) {
		String query = "delete from restaurant_table where id=?";
		jdbcTemplate.update(query, id);
		System.out.println("deleted value:" + id);
		return;

	}

}