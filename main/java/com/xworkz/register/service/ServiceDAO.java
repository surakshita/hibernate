package com.xworkz.register.service;

import com.xworkz.register.dto.UserInfoDTO;

public interface ServiceDAO {
	
	boolean validateAndSave(UserInfoDTO userInfoDTO);

}
