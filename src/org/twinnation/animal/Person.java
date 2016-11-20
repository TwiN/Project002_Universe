package org.twinnation.animal;

import org.twinnation.constant.AnimalConstants;

import java.util.Date;

// TODO: change age to Date birthdate
public class Person extends Animal implements AnimalConstants {
	private String firstName;
	private String lastName;

	public Person() {
		super(0);
	}

	public Person(String firstName, String lastName, int age) {
		super(age);
		this.firstName = firstName;
		this.lastName = lastName;
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
	public float getNormalBodyTemperature() {
		return NORMAL_BODY_TEMPERATURE_PERSON;
	}

	@Override
	public void move() {

	}

}
