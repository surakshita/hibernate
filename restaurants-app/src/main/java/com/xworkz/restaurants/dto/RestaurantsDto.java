package com.xworkz.restaurants.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class RestaurantsDto {

	private int id;

	private String name;

	private String location;

	public RestaurantsDto(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

}
