package com.google.expections;

public class AgeChecker  {

	public void checkAge(int number) throws AgeValidationException, NumberFormatException {
		if (number < 18) {
			System.out.println("Not eligible for in ");
			throw new AgeValidationException("You are not eligible");
		} else {
			System.out.println("You can go in");
		}
	}

	public void handleException() throws AgeValidationException {
		checkAge(15);
	}

	public static void main(String[] args) {
		AgeChecker ageChecker = new AgeChecker();
		try {
			ageChecker.handleException();
		} catch (AgeValidationException e) {
			e.printStackTrace();
		}
	}
}

//throw
//throws
