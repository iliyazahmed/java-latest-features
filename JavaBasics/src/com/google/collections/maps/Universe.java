package com.google.collections.maps;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.google.collections.Jupiter;

public class Universe {

	public void hasMap() {
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("student", "Jhon");
		hashMap.put("age", 20);
		hashMap.put("class", "B.tech");
		hashMap.put("percentage", 75.00);
		hashMap.put("student", "Rob");

		System.out.println(hashMap);

		for (Map.Entry<String, Object> map : hashMap.entrySet()) {
			if (map.getKey().contains("student")) {
				System.out.println("Yes student is avaialbel");
			}
			System.out.println(map.getKey() + "  :  " + map.getValue());
		}

	}

	public void hasLinkeddHashMap() {
		Map<String, Object> hashMap = new LinkedHashMap<>();
		hashMap.put("student", "Jhon");
		hashMap.put("age", 20);
		hashMap.put("class", "B.tech");
		hashMap.put("percentage", 75.00);
		hashMap.put("student", "Rob");

		System.out.println(hashMap);

		for (Map.Entry<String, Object> map : hashMap.entrySet()) {
			if (map.getKey().contains("student")) {
				System.out.println("Yes student is avaialbel");
			}
			System.out.println(map.getKey() + "  :  " + map.getValue());
		}

	}

	public void hasTreeMapObject() {
		Map<Jupiter, Object> treeMap = new TreeMap<>(Comparator.comparing(Jupiter::getPlanetType));

		treeMap.put(new Jupiter("j", 0), "Jhon");
		treeMap.put(new Jupiter("joker", 5), 20);
		treeMap.put(new Jupiter("h", 9), "B.tech");
		treeMap.put(new Jupiter("p", 120), 75.00);
		treeMap.put(new Jupiter("z", 22), "Rob");

//		System.out.println(treeMap);

		for (Map.Entry<Jupiter, Object> map : treeMap.entrySet()) {
			if (map.getKey().getPlanetType().contains("hu")) {
				System.out.println("Yes student is avaialbel");
			}
			System.out.println(map.getKey().getPlanetType() + "  :  " + map.getValue());
		}

	}

	public void hasTreeMap() {
		Map<String, Object> treeMap = new TreeMap<>();

		treeMap.put("candidateName", "Jhon");
		treeMap.put("age", 20);
		treeMap.put("course", "B.tech");
		treeMap.put("CGPA", 7.0);
		treeMap.put("candidateName", "Rob");

//		System.out.println(treeMap);

		for (Map.Entry<String, Object> map : treeMap.entrySet()) {
			if (map.getKey().startsWith("candidate")) {
				System.out.println("Yes ," + map.getValue() + " is available");
			}
			System.out.println(map.getKey() + "  :  " + map.getValue());
		}

	}

	public static void main(String[] args) {
		Universe universe = new Universe();
		universe.hasMap();
		System.out.println("===============================================");
		universe.hasLinkeddHashMap();
		System.out.println("===============================================");
		universe.hasTreeMap();
	}
}
