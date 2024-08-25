package com.google.abstraction;

public class Dog extends Animal {

	private String dogName;
	private String breedName;

	public Dog(String dogName, String breedName) {
		this.dogName = dogName;
		this.breedName = breedName;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	@Override
	public void sleep() {
		System.out.println("i will sleep 5 hrs a day");
	}

}
