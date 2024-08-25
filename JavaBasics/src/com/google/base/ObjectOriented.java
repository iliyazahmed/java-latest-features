package com.google.base;

public class ObjectOriented {
	// OOPS
	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather();
		grandFather.grandFather();
		
		//
		Father father = new Father();
		father.father();
		father.grandFather();

		Son son = new Son();
		son.grandFather();
		son.father();
		son.son();
	}
}

class GrandFather {

	public void grandFather() {
		System.out.println("Grand father");
	}
}

class Father extends GrandFather {
	public void father() {
		System.out.println("father");
	}
}

class Son extends Father {
	public void son() {
		System.out.println("son");
	}
}
