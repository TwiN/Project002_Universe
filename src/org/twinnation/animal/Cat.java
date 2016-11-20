package org.twinnation.animal;

import org.twinnation.constant.AnimalConstants;

/**
 * @author chris
 */
public class Cat extends Animal implements AnimalConstants {

	public Cat() {
		super(0);
	}

	public Cat(int age) {
		super(age);
	}


	public void meow() {
	}

	@Override
	public float getNormalBodyTemperature() {
		return NORMAL_BODY_TEMPERATURE_CAT;
	}

	@Override
	public void move() {

	}
}
