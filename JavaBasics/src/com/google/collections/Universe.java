package com.google.collections;

public class Universe {

	public static void loadArray() {
		int[] num = new int[10];
		num[0] = 1;
		num[1] = 2;

		System.out.println(num);

		Integer[] nums = { 123, 2345, 3456, 5678, 345678 };
		String[] names = { "hello", "hi", "bye" };

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public static void main(String[] args) {
		loadArray();
	}
}
