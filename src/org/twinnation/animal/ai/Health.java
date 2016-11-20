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
		if (nourishment < 30) {
			healthStatus -= 25;
		}
		if (Math.abs(bodyTemperature-normalBodyTemperature)>2) {
			healthStatus -= Math.abs(bodyTemperature-normalBodyTemperature)*10;
		}
		return healthStatus;
	}

	public float getHealthStatus() {
		this.healthStatus = checkHealthStatus();
		return healthStatus;
	}


	/* GETTERS AND SETTERS */


	public static void main(String[] args) {
		Health h = new Health(37);

		System.out.println(h.getHealthStatus());
	}




}
