package com.xworkz.planet.service;

import com.xworkz.planet.dao.PlanetDAO;
import com.xworkz.planet.dto.PlanetDTO;

public class PlanetServiceImpl implements PlanetService {

	private PlanetDAO planetDAO;

	public PlanetServiceImpl(PlanetDAO dao) {
		this.planetDAO = dao;
	}

	@Override
	public boolean validateAndSavePlanet(PlanetDTO dto) {

		boolean validateData = false;

		if (dto != null) {
			System.out.println("dto is not null,validate data");

			String name = dto.getName();
			if (name != null && !name.isEmpty() && !name.contains(" ")) {
				System.out.println("name is valid");
				validateData = true;
			} else {
				System.out.println("name is invalid");
				validateData = false;
			}

			if (validateData) {
				double area = dto.getArea();
				if (area > 0) {
					System.out.println("area is valid");
					validateData = true;
				} else {
					System.out.println("invalid area");
					validateData = false;
				}
			}

			if (validateData) {
				String satellite = dto.getSatellite();
				if (satellite != null && !satellite.isEmpty() && !satellite.contains(" ")) {
					System.out.println("satellite is valid");
					validateData = true;
				} else {
					System.out.println("satellite is invalid");
					validateData = false;
				}
			}

			if (validateData) {
				String shape = dto.getShape();
				if (shape != null && !shape.isEmpty() && !shape.contains(" ")) {
					System.out.println("shape is valid");
					validateData = true;
				} else {
					System.out.println("shape is invalid");
					validateData = false;
				}
			}
			if (validateData) {
				System.out.println("valid data ,invoke planet dto");
				planetDAO.savePlanet(dto);
			} else {
				System.out.println("invalid data");
			}
		}
		return false;
	}

}
