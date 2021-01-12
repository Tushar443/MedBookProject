package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long address_id;
	
	@Column(name = "flat_no",length = 50)
	private String flatNo;
	
	@Column(length = 50)
	private String area;
	
	@Column(length = 50)
	private String street;
	
	@Column(length = 30)
	private String city;
	
	@Column(length = 30)
	private String state;
	
	@Column(length = 30)
	private String country;
	
	@Column(length = 10)
	private String pincode;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public long getAddress_id() {
		return address_id;
	}

	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return address_id + " " + flatNo + " " + area + " " + street
				+ " " + city + " " + state + " " + country + " " + pincode;
	}

	public Address(long address_id, String flatNo, String area, String street, String city, String state,
			String country, String pincode) {
		super();
		this.address_id = address_id;
		this.flatNo = flatNo;
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	
	
	
}