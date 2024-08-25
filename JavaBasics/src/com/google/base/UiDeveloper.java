package com.google.base;

public class UiDeveloper {

	int a = 10;
	char ch = '1';
	long lon = 1234;

	boolean bool = true;
	boolean boo2 = false;

	Character inp = '8';
	Integer b = 10;
	Boolean boo = true;
	Boolean boo3 = false;

	Object ip = "java";
	Object ip1 = true;
	Object ip2 = 0.0;
	Object ip3 = 1123;
	Object ip4 = 'C';

	final String name = "jon";

	public Object uiDeveloper(Object input) {
		Object output = null;
		if (input instanceof String str) {
			System.out.println("String");
			return output = str;
		} else if (input instanceof Integer str) {
			System.out.println("Integer");
			return output = str;
		} else if (input instanceof Double str) {
			System.out.println("Double");
			return output = str;
		}

		return output;

	}

//	@Override
//	public void tryingToCall() {
//
//	}

	public static void main(String[] args) {
		CeoOFGoogle ceoOFGoogle = new CeoOFGoogle();
		
		UiDeveloper developer = new UiDeveloper();
		
		Object uiDeveloper = developer.uiDeveloper(ceoOFGoogle);
		
		System.out.println(uiDeveloper);
	}
}
