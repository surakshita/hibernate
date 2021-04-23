package com.xworkz.shopping.service;

import com.xworkz.shopping.dto.RegisterDTO;

public interface ServiceDAO {
	
	public boolean validateAndSave(RegisterDTO registerDTO);

}
