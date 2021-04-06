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
import lombok.ToString;

@Entity
@Table(name="tractor_table")
@Getter
@Setter
@ToString
@NoArgsConstructor

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

	
		public TractorDTO(String model, String color, double cost, double fuelCapacity) {
		super();
		this.model = model;
		this.color = color;
		this.cost = cost;
		this.fuelCapacity = fuelCapacity;
	}



}
