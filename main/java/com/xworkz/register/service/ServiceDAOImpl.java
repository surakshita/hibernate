package com.xworkz.register.service;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dto.UserInfoDTO;

public class ServiceDAOImpl implements ServiceDAO {
	
	private RegisterDAO registerDAO;
	
	public ServiceDAOImpl(RegisterDAO registerDAO) {
		this.registerDAO=registerDAO;
	}

	@Override
	public boolean validateAndSave(UserInfoDTO userInfoDTO) {
	
		boolean validData=false;
		
		if (userInfoDTO != null) {
			System.out.println("dto is not null,validate data");

			String email = userInfoDTO.getEmail();
			if (email != null && !email.isEmpty() && !email.contains(" ")) {
				System.out.println("email is valid");
				validData = true;
			} else {
				System.out.println("email is invalid");
				validData = false;
			}
			if (validData) {
				String password = userInfoDTO.getPassword();
				if (password != null && !password.isEmpty() && !password.contains(" ")) {
					System.out.println("password is valid");
					validData = true;
				} else {
					System.out.println("password is invalid");

					validData = false;
				}
			}
			if (validData) {
				String password = userInfoDTO.getPassword();
				if (password != null && !password.isEmpty() && !password.contains(" ")) {
					System.out.println("password is valid");
					validData = true;
				} else {
					System.out.println("password is invalid");

					validData = false;
				}
			}
			if (validData) {
				String password = userInfoDTO.getPassword();
				if (password != null && !password.isEmpty() && !password.contains(" ")) {
					System.out.println("password is valid");
					validData = true;
				} else {
					System.out.println("password is invalid");

					validData = false;
				}
			}
			if (validData) {
				String firstName = userInfoDTO.getFirstName();
				if (firstName != null && !firstName.isEmpty() && !firstName.contains(" ")) {
					System.out.println("first name is valid");
					validData = true;
				} else {
					System.out.println("first name is invalid");

					validData = false;
				}
			}
			if (validData) {
				String lastName = userInfoDTO.getLastName();
				if (lastName != null && !lastName.isEmpty() && !lastName.contains(" ")) {
					System.out.println("last name is valid");
					validData = true;
				} else {
					System.out.println("last name is invalid");

					validData = false;
				}
			}
			if (validData) {
				long phoneNo = userInfoDTO.getPhoneNumber();
				if (phoneNo != 0 && phoneNo > 0) {
					System.out.println("phone number is valid");
					validData = true;
				} else {
					System.out.println("phone number  is invalid");

					validData = false;
				}
			}
			if (validData) {
				String password = userInfoDTO.getPassword();
				if (password != null && !password.isEmpty() && !password.contains(" ")) {
					System.out.println("password is valid");
					validData = true;
				} else {
					System.out.println("password is invalid");

					validData = false;
				}
			}
			if (validData) {
				String address = userInfoDTO.getAddress();
				if (address != null && !address.isEmpty() && !address.contains(" ")) {
					System.out.println("address is valid");
					validData = true;
				} else {
					System.out.println("address is invalid");

					validData = false;
				}
			}
			if (validData) {
				String town = userInfoDTO.getTown();
				if (town != null && !town.isEmpty() && !town.contains(" ")) {
					System.out.println("town is valid");
					validData = true;
				} else {
					System.out.println("town is invalid");

					validData = false;
				}
			}
			if (validData) {
				String region = userInfoDTO.getRegion();
				if (region != null && !region.isEmpty() && !region.contains(" ")) {
					System.out.println("region is valid");
					validData = true;
				} else {
					System.out.println("region is invalid");

					validData = false;
				}
			}
			if (validData) {
				String zip = userInfoDTO.getZip();
				if (zip != null && !zip.isEmpty() && !zip.contains(" ")) {
					System.out.println("zip is valid");
					validData = true;
				} else {
					System.out.println("zip is invalid");

					validData = false;
				}
			}
			if (validData) {
				String country = userInfoDTO.getCountry();
				if (country != null && !country.isEmpty() && !country.contains(" ")) {
					System.out.println("country is valid");
					validData = true;
				} else {
					System.out.println("country is invalid");

					validData = false;
				}
			}

			if (validData) {
				System.out.println("valid data,invoke user info dto");
				registerDAO.saveUserInfo(userInfoDTO);
			} else {
				System.out.println("invalid data");
			}

		}

		return false;
	}

}


