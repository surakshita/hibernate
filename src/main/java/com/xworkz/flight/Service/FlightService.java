package com.xworkz.flight.Service;

import com.xworkz.flight.dto.FlightDTO;

public interface FlightService {
	
	boolean validateAndSaveFlight(FlightDTO dto);

}
