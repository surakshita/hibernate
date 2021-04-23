package com.xworkz.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.shopping.dao.RegisterDAO;
import com.xworkz.shopping.dto.RegisterDTO;
@Component
public class ServiceDAOImpl implements ServiceDAO {
	@Autowired
	private RegisterDAO registerDAO;

	public ServiceDAOImpl(RegisterDAO registerDAO) {
		super();
		this.registerDAO = registerDAO;
	}

	@Override
	public boolean validateAndSave(RegisterDTO registerDTO) {
		boolean validateData = false;

		if (registerDTO != null) {
			System.out.println("dto is not null,validate data");

			String username = registerDTO.getUsername();
			if (username != null && !username.isEmpty() && !username.contains(" ")) {
				System.out.println("username is valid");
				validateData = true;
			} else {
				System.out.println("username is invalid");
				validateData = false;
			}

			String email = registerDTO.getEmail();
			if (email != null && !email.isEmpty() && !email.contains(" ")) {
				System.out.println("email is valid ");
				validateData = true;
			} else {
				System.out.println("email is invalid");
				validateData = false;
			}

			long phoneNumber = registerDTO.getPhoneNumber();
			if (phoneNumber > 0 && phoneNumber != 0) {
				System.out.println("phone number is valid");
				validateData = true;
			} else {
				System.out.println("phone number is invalid ");
				validateData = false;
			}

			String password = registerDTO.getPassword();
			if (password != null && !password.isEmpty() && !password.contains(" ")) {
				System.out.println("password is valid");
				validateData = true;
			} else {
				System.out.println("password is invalid");
				validateData = false;
			}

			if (validateData) {
				System.out.println("data is valid,invoke register dto");
				registerDAO.saveRegisterDTO(registerDTO);
				} else {
				System.out.println("data is invalid!!!!!");
			}
		}
		return false;
	}

}
