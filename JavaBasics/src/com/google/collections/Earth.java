package com.google.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Earth {

	public static void arrayList() {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("name");
		arrayList.add("noon");
		arrayList.add("1234");
		arrayList.add("hello");
		arrayList.add("good");
		arrayList.add("happy");
		arrayList.add("sunday");
		arrayList.add("1234");

		List<String> asList = Arrays.asList("hi", "my ", "name");

		arrayList.addAll(asList);

		String first = arrayList.stream().findFirst().get();
		System.out.println("i am first " + first);
		for (String arr : arrayList) {
			System.out.println("hashcode  " + arr.hashCode());
		}
		arrayList.stream().filter(e -> e.startsWith("n")).map(String::toLowerCase).forEach(System.out::println);

//		for (String values : arrayList) {
//			if (values.startsWith("n")) {
//				System.out.println(values);
//			}
//		}

		System.out.println("I am from Array list " + arrayList);
		System.out.println("I getting 4th index form arraylist " + arrayList.get(4));
	}

	public static void linkedList() {
		List<String> linkedList = new LinkedList<>();
		linkedList.add("name");
		linkedList.add("1234");
		linkedList.add("hello");
		linkedList.add("good");
		linkedList.add("happy");
		linkedList.add("sunday");
		linkedList.add("1234");

		linkedList.addFirst("my");

		System.out.println("I am from Linked list " + linkedList);
		System.out.println("I am from Linked list " + linkedList.remove(4));
		System.out.println("after removal from Linked list " + linkedList);
	}

	public void vectorList() {
		List<Object> vector = new Vector<>();
		vector.add("name");
		vector.add("1234");
		vector.add("hello");
		vector.add("good");
		vector.add("happy");
		vector.add("sunday");
		vector.add("1234");

		System.out.println(vector);

		for (Object vec : vector) {
			System.out.println(vec);
		}
	}

	public static void main(String[] args) {
		arrayList();
//		linkedList();
//		Earth earth = new Earth();
//		earth.vectorList();
	}
}
