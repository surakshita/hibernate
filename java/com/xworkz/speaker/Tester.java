package com.xworkz.speaker;

import com.xworkz.speaker.dao.SpeakerDAO;
import com.xworkz.speaker.dao.SpeakerDAOImpl;
import com.xworkz.speaker.dto.SpeakerDTO;

public class Tester {

	public static void main(String[] args) {
		
		SpeakerDAO speakerDAO=new SpeakerDAOImpl();
		
		SpeakerDTO speakerDTO=new SpeakerDTO(3, "Bose", 4000, "White", "Medium", true);
		
		
		speakerDAO.save(speakerDTO);
			
			

	}

}
