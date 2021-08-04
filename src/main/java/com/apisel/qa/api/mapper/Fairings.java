package com.apisel.qa.api.mapper;

import java.util.ArrayList;

/**
 * Json mapper class
 *
 */
public class Fairings {
	private boolean reused;
	private boolean recovery_attempt;
	private String recovered = null;
	ArrayList<Object> ships = new ArrayList<Object>();

	// Getter Methods

	public boolean getReused() {
		return reused;
	}

	public boolean getRecovery_attempt() {
		return recovery_attempt;
	}

	public String getRecovered() {
		return recovered;
	}

	// Setter Methods

	public ArrayList<Object> getShips() {
		return ships;
	}

	public void setShips(ArrayList<Object> ships) {
		this.ships = ships;
	}

	public void setReused(boolean reused) {
		this.reused = reused;
	}

	public void setRecovery_attempt(boolean recovery_attempt) {
		this.recovery_attempt = recovery_attempt;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

}
