package org.twinnation.landscape.nature;

import org.twinnation.twinutilities.RandomUtils;

import java.util.List;

/**
 * @author chris
 */
public class AppleTree extends AbstractTree  {

	List<Apple> listFruits;

	public AppleTree(List<Apple> listFruits) {
		super(true);
		this.listFruits = listFruits;
	}


	@Override
	public boolean hasFruits() {
		return true;
	}

	@Override
	public List<AbstractFruit> getFruits() {
		return null;
	}
}
