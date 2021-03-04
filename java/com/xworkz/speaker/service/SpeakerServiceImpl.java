package com.xworkz.speaker.service;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class SpeakerServiceImpl implements SpeakerService {

	@Override
	public boolean validateAndSave(SpeakerDTO dto) {
		boolean validateDto = false;

		if (dto != null) {
			System.out.println("SpeakerDTO is not null,validate");

			int id = dto.getSpeakerId();

			if (id > 0) {
				System.out.println("Id is valid");
				validateDto = true;
			} else {
				System.out.println("Id is invalid");
				validateDto = false;
			}

			// brand validation
			if (validateDto) {
				String brand = dto.getBrand();

				if (brand != null && !brand.isEmpty() && !brand.contains(" ")) {
					System.out.println("Brand is valid");
					validateDto = true;
				} else {
					System.out.println("Brand is not valid");
					validateDto = false;
				}
			}

			// cost validation
			if (validateDto) {
				double cost = dto.getCost();

				if (cost > 0) {
					System.out.println("Cost is valid");
					validateDto = true;
				} else {
					System.out.println("Cost is invalid");
					validateDto = false;
				}

			}

			// color validation

			if (validateDto) {
				String color = dto.getColor();

				if (color != null && !color.isEmpty() && !color.contains(" ")) {
					System.out.println("Color is valid");
					validateDto = true;
				} else {
					System.out.println("Color is invalid");
					validateDto = false;
				}
			}

			// size validation

			if (validateDto) {
				String size = dto.getSize();

				if (size != null && !size.isEmpty() && !size.contentEquals(" ")) {
					System.out.println("Size is valid");
					validateDto = true;
				} else {
					System.out.println("Size is invalid");
					validateDto = false;
				}
			}

			if (validateDto) {
				System.out.println("DTO is valid");
				SpeakerDAO speakerDAO = new SpeakerDAOImpl();
				speakerDAO.save(dto);
			}
		} else {
			System.out.println("DTO is invalid");
		}

		return false;
	}

}
