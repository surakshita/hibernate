package com.xworkz.tractor.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tractor_table")

public class TractorDTO implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRACTOR_ID")
	private int tractorID;
	
	@Column(name="MODEL")
	private String model;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="COST")
	private double cost;
	
	@Column(name="FUEL_CAPACITY")
	private double fuelCapacity;

	public TractorDTO() {
		super();
	}

	public TractorDTO(String model, String color, double cost, double fuelCapacity) {
		super();
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.fuelCapacity = fuelCapacity;
	}

	public int getTractorID() {
		return tractorID;
	}

	public void setTractorID(int tractorID) {
		this.tractorID = tractorID;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	@Override
	public String toString() {
		return "TractorDTO [tractorID=" + tractorID + ", model=" + model + ", color=" + color + ", cost=" + cost
				+ ", fuelCapacity=" + fuelCapacity + "]";
	}
	

}
