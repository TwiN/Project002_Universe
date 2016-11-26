package org.twinnation.landscape.nature;

/**
 * @author chris
 */
public class AbstractFruit {

	/** Fruit not ready for harvest */
	public final static int FRUIT_NOT_READY = 11001;
	/** Fruit ready for harvest */
	public final static int FRUIT_READY = 11002;
	/** Fruit that turned bad */
	public final static int FRUIT_BAD = 11003;

	private int status;

	public AbstractFruit() {
		this.status = FRUIT_NOT_READY;
	}

	public AbstractFruit(int status) {
		this.status = status;
	}
}
