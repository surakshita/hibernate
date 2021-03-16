package com.xworkz.flight;

import com.xworkz.flight.dao.FlightDAO;
import com.xworkz.flight.dao.FlightDAOImpl;
import com.xworkz.flight.dto.FlightDTO;

public class FlightTester {

	public static void main(String[] args) {
		
		FlightDAO flightDAO=new FlightDAOImpl();
		
		FlightDTO flightDTO=new FlightDTO( "spiceJet", "Goa", "Pune", 4, 6000);
		
		//FlightService flightService=new FlightServiceImpl(flightDAO);
		
		//flightService.validateAndSaveFlight(flightDTO);
		
		//flightDAO.saveFlight(flightDTO);
		
		//flightDAO.readFlight(3);
		
		//flightDAO.updateFlight(4);
		
		//flightDAO.deleteFlight(11);
		
		flightDAO.readAllRecords();
		

	}

}
