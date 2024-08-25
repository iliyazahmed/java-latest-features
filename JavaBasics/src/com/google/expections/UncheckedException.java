package com.google.expections;

public class UncheckedException {

	private void divideNumber(String number1, String number2) {

		try {
			int parseInt1 = Integer.parseInt(number1);
			int parseInt2 = Integer.parseInt(number2);

			int output = parseInt1 / parseInt2;
			System.out.println(output);
		} catch (ArithmeticException e) {
			System.out.println("This is an Arthimetic excpetion");
		} catch (NumberFormatException e) {
			System.out.println("This is an Number exception");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[] values = { "jon", "cena", "broke" };

		String val = null;
		try {
			System.out.println(val.length());
		} catch (NullPointerException e) {

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("I am comming");
	}

	public static void main(String[] args) {
		UncheckedException uncheckedException = new UncheckedException();
		uncheckedException.divideNumber("100", "hello");
	}
}
