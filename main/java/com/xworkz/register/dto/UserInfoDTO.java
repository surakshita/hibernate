package com.xworkz.register.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user_table")
public class UserInfoDTO implements Serializable{
	@Column(name="USERID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "PASSWORD")
	private String retypePassword;
	
	@Column(name = "FIRSTNAME")
	private String firstName;
	
	@Column(name = "LASTNAME")
	private String lastName;
	
	@Column(name = "PHONENUMBER")
	private long phoneNumber;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "TOWN")
	private String town;
	
	@Column(name = "REGION")
	private String region;
	
	@Column(name = "ZIP")
	private String zip;
	
	@Column(name = "COUNTRY")
	private String country;
	
	public UserInfoDTO() {
		super();
	}

	public UserInfoDTO(String email, String password, String retypePassword, String firstName, String lastName,
			long phoneNumber, String address, String town, String region, String zip, String country) {
		super();
		this.email = email;
		this.password = password;
		this.retypePassword = retypePassword;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.town = town;
		this.region = region;
		this.zip = zip;
		this.country = country;
	}

	public int getUserId() {
		return userId;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [email=" + email + ", password=" + password + ", retypePassword=" + retypePassword
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", town=" + town + ", region=" + region + ", zip=" + zip + ", country=" + country + "]";
	}
	
	
	
	
	

}
