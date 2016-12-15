package com.hibernateaOracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="details")
public class Address {
	@Id
	private String addressId;
	@Column
	private String city;
	@Column
	private String town;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressId, String city, String town) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.town = town;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", town=" + town + "]";
	}

}
