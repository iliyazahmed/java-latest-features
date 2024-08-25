package com.google.collections;

public class Jupiter {

	private int planetPositon;
	private String planetType;

	public int getPlanetPositon() {
		return planetPositon;
	}

	public void setPlanetPositon(int planetPositon) {
		this.planetPositon = planetPositon;
	}

	public String getPlanetType() {
		return planetType;
	}

	public void setPlanetType(String planetType) {
		this.planetType = planetType;
	}

	public Jupiter(String planetType, int planetPositon) {
		this.planetPositon = planetPositon;
		this.planetType = planetType;
	}

	public Jupiter() {
	}

}
