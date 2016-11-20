package org.twinnation.animal;

public class Fish extends Animal {

	public Fish() {
		super(0);
	}

	public Fish(int age) {
		super(age);
	}

	@Override
	public float getNormalBodyTemperature() {
		return 0; // TODO
	}

	@Override
	public void move() {

	}
}
