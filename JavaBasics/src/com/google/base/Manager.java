package com.google.base;

public abstract class Manager {

	//incomplete methods or abstract methods
	public abstract void givesWork();

	//complete methods
	public void dontWork(String project) {
		System.out.println(project);
	}
}
