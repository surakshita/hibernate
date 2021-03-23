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


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher=req.getRequestDispatcher("Register.html");
		dispatcher.forward(req, resp);
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String retypePassword=request.getParameter("retypePassword");
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		long phoneNumber=Long.parseLong(request.getParameter("phoneNumber"));
		String address=request.getParameter("address");
		String town=request.getParameter("town");
		String region=request.getParameter("region");
		String zip=request.getParameter("zip");
		String country=request.getParameter("country");
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(retypePassword);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(phoneNumber);
		System.out.println(address);
		System.out.println(town);
		System.out.println(region);
		System.out.println(zip);
		System.out.println(country);
		
		
	
	

UserInfoDTO dto=new UserInfoDTO(email, password, retypePassword, firstName, lastName, phoneNumber, address, town, region, zip, country);
	RegisterDAO dao=new RegisterDAOImpl();
	
	dao.saveUserInfo(dto);

	RequestDispatcher dispatcher=request.getRequestDispatcher("Register.html");
	dispatcher.forward(request, response);
		
		
	}
	


}
