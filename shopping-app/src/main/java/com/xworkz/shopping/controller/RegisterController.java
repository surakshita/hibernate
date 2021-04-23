package com.xworkz.shopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.xworkz.shopping.dao.RegisterDAO;
import com.xworkz.shopping.dto.RegisterDTO;
import com.xworkz.shopping.service.ServiceDAO;
import com.xworkz.shopping.service.ServiceDAOImpl;

@Controller
@RequestMapping("/")
public class RegisterController {
	@Autowired
	private RegisterDAO dao;
	
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	@RequestMapping("/register.do")
	public String onRegistration(@RequestParam String username, @RequestParam String email,
			@RequestParam long phoneNumber, @RequestParam String password, Model model) {

		System.out.println("invoked on registration method ");

		RegisterDTO dto = new RegisterDTO(username, email, phoneNumber, password);
		System.out.println(dto);
		
		ServiceDAO serviceDAO = new ServiceDAOImpl(dao);
		serviceDAO.validateAndSave(dto);
		//boolean res=dao.saveRegisterDTO(dto);
		return "/RegisterController.jsp";
	}

}
