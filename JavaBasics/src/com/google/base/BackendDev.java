package com.google.base;

public class BackendDev extends Manager {

	private String name;
	private String standard;
	private Integer rollNo;

	public BackendDev(String name, String standard) {
		this.name = name;
		this.standard = standard;
	}

	public BackendDev(String name) {
		this.name = name;
	}

	public BackendDev() {

	}

	public BackendDev(String name, String standard, Integer rollNo) {
		this.name = name;
		this.standard = standard;
		this.rollNo = rollNo;
	}

	@Override
	public void givesWork() {
		System.out.println("work ");
	}

	// public/private/protected -> access specfiers
	// static and non-static access modifiers
	// void and return
	// method

	public static Double help() {
		return null;

	}

	public static void main(String[] args) {
		BackendDev backendDev = new BackendDev("jon", "10");
	}

}
