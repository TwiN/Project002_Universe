package org.twinnation.landscape.nature;

import java.util.List;

public abstract class AbstractTree {

	protected boolean hasFruits;

	public AbstractTree() {
		hasFruits = false; // by default, no fruits
	}

	public AbstractTree(boolean hasFruits) {
		this.hasFruits = hasFruits;
	}

	abstract List<AbstractFruit> getFruits();

	public boolean hasFruits() {
		return hasFruits;
	}

	public void setHasFruits(boolean hasFruits) {
		this.hasFruits = hasFruits;
	}
}
