package com.xworkz.planet.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class PlanetDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planetId;
	
	private String name;
	
	private double area;
	
	private String satellite;
	
	private String shape;

	public PlanetDTO() {
		super();
	}
	
	

	public PlanetDTO(String name, double area, String satellite, String shape) {
		this.name = name;
		this.area = area;
		this.satellite = satellite;
		this.shape = shape;
	}



	public int getPlanetId() {
		return planetId;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}



	@Override
	public String toString() {
		return "PlanetDTO [name=" + name + ", area=" + area + ", satellite=" + satellite + ", shape=" + shape + "]";
	}
	
	

}
