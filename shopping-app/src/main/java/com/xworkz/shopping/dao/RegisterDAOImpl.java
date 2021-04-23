package com.xworkz.shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.xworkz.shopping.dto.RegisterDTO;

@Component
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public RegisterDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		System.out.println("created registerdaoimpl");
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public boolean saveRegisterDTO(RegisterDTO registerDTO) {
		String sql = "INSERT INTO shopping_table VALUES(?,?,?,?,?)";
		try {
			 jdbcTemplate.update(sql, new Object[] { registerDTO.getId(), registerDTO.getUsername(),
					registerDTO.getEmail(), registerDTO.getPhoneNumber(), registerDTO.getPassword() });

			System.out.println("register dto save");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
