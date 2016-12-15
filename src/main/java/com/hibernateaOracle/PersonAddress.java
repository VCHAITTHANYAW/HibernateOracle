package com.hibernateaOracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PersonAddress {
	@Id
	private String personId;
	@Column
	private String addressId;
	public PersonAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PersonAddress(String personId, String addressId) {
		super();
		this.personId = personId;
		this.addressId = addressId;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	@Override
	public String toString() {
		return "PersonAddress [personId=" + personId + ", addressId=" + addressId + "]";
	}
	
	

}
