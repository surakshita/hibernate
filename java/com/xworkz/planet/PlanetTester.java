package com.xworkz.planet;

import com.xworkz.planet.dao.PlanetDAO;
import com.xworkz.planet.dao.PlanetDAOImpl;
import com.xworkz.planet.dto.PlanetDTO;
import com.xworkz.planet.service.PlanetService;
import com.xworkz.planet.service.PlanetServiceImpl;

public class PlanetTester {

	public static void main(String[] args) {
		
		PlanetDTO planetDTO=new PlanetDTO("Earth", 510.1, "moon", "ellipsoid");
		
		PlanetDAO planetDAO=new PlanetDAOImpl();
		
		//PlanetService planetService=new PlanetServiceImpl(planetDAO);
		
		//planetService.validateAndSavePlanet(planetDTO);
		
		planetDAO.savePlanet(planetDTO);
		
		

	}

}
