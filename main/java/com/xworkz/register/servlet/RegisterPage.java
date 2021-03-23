package com.xworkz.register.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dao.RegisterDAOImpl;
import com.xworkz.register.dto.UserInfoDTO;

public class RegisterPage extends HttpServlet{
	
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
System.out.println("Hello inside register page");
RequestDispatcher requestDispatcher=req.getRequestDispatcher("Register.html");
requestDispatcher.forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("inside register page");
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String retypePassword=req.getParameter("retypePassword");
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		long phoneNumber=Long.parseLong(req.getParameter("phoneNumber"));
		String address=req.getParameter("address");
		String town=req.getParameter("town");
		String region=req.getParameter("region");
		String zip=req.getParameter("zip");
		String country=req.getParameter("country");
		
		System.out.println("email:"+email);
		System.out.println("password:"+password);
		System.out.println("retype password:"+retypePassword);
		System.out.println("first name:"+firstName);
		System.out.println("last name:"+lastName);
		System.out.println("phone number:"+phoneNumber);
		System.out.println("address:"+address);
		System.out.println("town:"+town);
		System.out.println("region:"+region);
		System.out.println("zip:"+zip);
		System.out.println("country:"+country);
		
		
		
		UserInfoDTO dto=new UserInfoDTO(email, password, retypePassword, firstName, lastName, phoneNumber, address, town, region, zip, country);

		RegisterDAO dao=new RegisterDAOImpl();
		dao.saveUserInfo(dto);
		
		
		
		
	}
	
	

}
