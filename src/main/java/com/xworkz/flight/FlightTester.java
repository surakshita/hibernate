package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class FlightTester {

	public static void main(String[] args) {
		
		FlightDAO flightDAO=new FlightDAOImpl();
		
		FlightDTO flightDTO=new FlightDTO(5, "Air India", "Delhi", "Pune", 1, 1500);
		
		//flightDAO.saveFlight(flightDTO);
		
		//flightDAO.readFlight(3);
		
		//flightDAO.updateFlight(4);
		
		flightDAO.deleteFlight(5);
		
		

	}

}
