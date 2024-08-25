package com.google.poly;

public class Animal {

	// compile time polymorphism or method-overloading
	private String help(String help) {
		return help;
	}

	private boolean help(boolean help) {
		return help;
	}

	private Double help() {
		return null;
	}

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.help(false));
	}
}
