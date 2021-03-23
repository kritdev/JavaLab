package com.krit.part01;

public class Lab02 {

	public static void main(String[] args) {
		bark();
		
		int i = 10;
		float f = 5.99f;
		double d = 1.234556;
		char c = 'C';
		
		System.out.println("float -> int : " + (int) f);
		System.out.println("int -> float : " + (float) i);
		System.out.println("double -> float : " + (float) d);
		System.out.println("char -> int : " + (int) c);
		
//		final String hello = "Hello";
//		hello = "World";
	}
	
	public static void bark() {
		String dogName = "Diggy";
		System.out.println("The Dog name = " + dogName + " bark");
	}

}
