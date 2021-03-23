package com.krit.part01;

public class Lab11 {

	public static void main(String[] args) {
		String name = getName();
		sayHi(name);
	}

	private static void sayHi(String name) {
		System.out.println("Hi " + name);
	}

	private static String getName() {
		return "John";
	}

}
