package com.google.abstraction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainAnimal {

	public static void main(String[] args) {
		List<Dog> arrayList = new ArrayList<>();

		arrayList.add(new Dog("pluto", "husky"));
		arrayList.add(new Dog("remo", "sitgh"));

		for (Dog dogs : arrayList) {
			String breedName = dogs.getBreedName();
			String dogName = dogs.getDogName();
			System.out.println(breedName + " " + dogName);
		}

		Stream<String> map = arrayList.stream().map(Dog::getBreedName);

	}

}
