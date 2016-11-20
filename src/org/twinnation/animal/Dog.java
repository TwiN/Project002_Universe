package org.twinnation.animal;

import org.twinnation.constant.AnimalConstants;

public class Dog extends Animal implements AnimalConstants {

	public Dog() {
		super(0);
	}

	public Dog(int age) {
		super(age);
	}

	public void bark() {

	}

	@Override
	public float getNormalBodyTemperature() {
		return NORMAL_BODY_TEMPERATURE_DOG;
	}

	@Override
	public void move() {

	}
}
