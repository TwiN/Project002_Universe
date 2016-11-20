package org.twinnation.animal;

import org.twinnation.animal.ai.Health;

public abstract class Animal {
	protected int age;
	protected Health health;

	public Animal(int age) {
		this.age = age;
		this.health = new Health(getNormalBodyTemperature());
	}

	public void sleep() {

	}

	public void eat() {

	}

	public abstract float getNormalBodyTemperature();

	public abstract void move(); // some fly, some walk..


}
