package org.twinnation.animal.ai;

public class Health {
	private boolean isSick;
	private float bodyTemperature;
	private float normalBodyTemperature;

	private int nourishment;
	private int hygiene;

	/** Determined by bodyTemperature, hygiene, nourishment, and isSick */
	private float healthStatus;

	public Health(final float normalBodyTemperature) {
		this.isSick = false;
		this.nourishment = 100;
		this.hygiene = 100;
		this.normalBodyTemperature = normalBodyTemperature;
		this.bodyTemperature = normalBodyTemperature;

	}

	public float checkHealthStatus() {
		healthStatus = 100;
		if (isSick) {
			healthStatus -= 25;
		}
		// Nourishment -> closer you get to 0%, the more dangerous it is
		healthStatus -= Math.pow(Math.abs(nourishment-100)*0.1, 2);
		// Hygiene -> matters, but not too deadly
		healthStatus -= Math.abs(hygiene-100)*0.1;
		// Animals resist cold body temperature better than hot body temperature
		if (Math.abs(bodyTemperature-normalBodyTemperature)>1
				&& (normalBodyTemperature-bodyTemperature>10
				|| normalBodyTemperature-bodyTemperature<-2)) {
			healthStatus -=  Math.pow(Math.abs(normalBodyTemperature-bodyTemperature)*
					(normalBodyTemperature-bodyTemperature<0?1.5:0.5), 2);
		}
		return healthStatus<0?0:healthStatus;
	}

	public float getHealthStatus() {
		this.healthStatus = checkHealthStatus();
		return healthStatus;
	}


	/* GETTERS AND SETTERS */

	public boolean isSick() {
		return isSick;
	}

	public void setSick(boolean sick) {
		isSick = sick;
	}

	public float getBodyTemperature() {
		return bodyTemperature;
	}

	public void setBodyTemperature(float bodyTemperature) {
		this.bodyTemperature = bodyTemperature;
	}

	public float getNormalBodyTemperature() {
		return normalBodyTemperature;
	}

	public void setNormalBodyTemperature(float normalBodyTemperature) {
		this.normalBodyTemperature = normalBodyTemperature;
	}

	public int getNourishment() {
		return nourishment;
	}

	public void setNourishment(int nourishment) {
		this.nourishment = nourishment;
	}

	public int getHygiene() {
		return hygiene;
	}

	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}


	/* TEST */
	/*
	public static void main(String[] args) {
		Health h = new Health(37);
		h.setHygiene(100);
		h.setNourishment(100);
		h.setBodyTemperature(h.getNormalBodyTemperature());

		//int x = 100;
		//while (x --> 0) {
			//h.setNourishment(x);
			//System.out.println(h.getHealthStatus());
		//}
		int x = 20;
		while (x --> -20) {
			h.setBodyTemperature(h.getNormalBodyTemperature()+x);
			System.out.println(h.getBodyTemperature()+" -> "+h.getHealthStatus());

		}
	}
	*/



}
