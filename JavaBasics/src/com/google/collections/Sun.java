package com.google.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sun {

	public void hashSet() {
		Set<Object> hashSet = new HashSet<>();
		hashSet.add("Dog");
		hashSet.add("Cat");
		hashSet.add("Dog");
		hashSet.add(null);
		hashSet.add(null);

		for (Object obj : hashSet) {
			System.out.println(obj);
		}

	}

	public void linkedHashSet() {
		LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("apple");
		linkedHashSet.add("banana");
		linkedHashSet.add("manago");
		linkedHashSet.add("apple");
		linkedHashSet.add(1);

		linkedHashSet.stream().forEach(System.out::println);

	}

	public void treeSet() {
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("tomato");
		treeSet.add("aloo");
		treeSet.add("brinjal");
		treeSet.add("curr");

		treeSet.stream().forEach(System.out::println);

	}

	public void hashSetIbject() {
		Set<Jupiter> hashSet = new HashSet<>();
		hashSet.add(new Jupiter("jup", 5));
		hashSet.add(new Jupiter("sup", 6));
		hashSet.add(new Jupiter("hip", 1));
		hashSet.add(new Jupiter("tip", 2));
		hashSet.add(new Jupiter("jup", 5));

		for (Jupiter obj : hashSet) {
			System.out.println(obj.getPlanetType());
		}

	}

	public void treeSetObject() {
		Jupiter jupiter = new Jupiter();
		jupiter.setPlanetPositon(4);
		jupiter.setPlanetType("qwe");

		Jupiter jupiter2 = new Jupiter();
		jupiter2.setPlanetPositon(2);
		jupiter2.setPlanetType("uio");

		Set<Jupiter> treeSet = new TreeSet<>(Comparator.comparing(Jupiter::getPlanetPositon));

		treeSet.add(jupiter);
		treeSet.add(jupiter2);

		for (Jupiter jup : treeSet) {
			System.out.println(jup.getPlanetType() + " " + jup.getPlanetPositon());
		}

	}

	public static void main(String[] args) {
		Sun sun = new Sun();
////		sun.hashSet();
//		sun.linkedHashSet();
//		sun.treeSet();
//		sun.hashSetIbject();
		sun.treeSetObject();
	}
}
