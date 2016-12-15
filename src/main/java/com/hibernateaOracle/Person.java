package com.hibernateaOracle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personal")
public class Person {
	@Id
	private int personId;
	@Column
	private String firstName;
	@Column
	private String lastName;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String firstName, String lastName) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
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
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
