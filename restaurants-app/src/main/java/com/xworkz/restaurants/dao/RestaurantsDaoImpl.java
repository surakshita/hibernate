package com.xworkz.restaurants.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.xworkz.restaurants.dto.RestaurantsDto;
@Component
public class RestaurantsDaoImpl implements RestaurantsDao {
	@Autowired
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

	@Override
	public List<RestaurantsDto> readAllRecords() {
		String query="select id,name,location from restaurant_table";
		return jdbcTemplate.query(query, new RestaurantMapper());
		
	}
	
	private static final class RestaurantMapper implements RowMapper<RestaurantsDto>{

		@Override
		public RestaurantsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			RestaurantsDto restaurantsDto=new RestaurantsDto();
			restaurantsDto.setId(rs.getInt("id"));
			restaurantsDto.setName(rs.getString("name"));
			restaurantsDto.setLocation(rs.getString("location"));
			return restaurantsDto;
		}
		
	}

	

}