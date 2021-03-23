package com.krit.part01;

public class Lab06 {

	public static void main(String[] args) {
		task01();
		task02();
		task03();
		task04();
	}

	public static void task01() {
		int i = 1;
		while(i <= 10) { 
			System.out.println(i++);
		}
	}

	public static void task02() {
		int i = 1;
		int sum = 0;
		while(i <= 10) { 
			sum += i++;
		}
		
		System.out.println("\nSum 1-10 = " + sum);
	}
	
	public static void task03() {
		int i = 1;
		System.out.print("\nNumber that divides 12 without leaving a remainder : ");
		while(i <= 100) {
			if (i % 12 == 0) {
				System.out.print(i + " ");
			}
			
			i++;
		}
		System.out.println("\n");
	}
	
	private static void task04() {
		int array[] = {1,2,3,4,5};
		
		System.out.println("\nPrint Data in array");
		for (int i : array) {
			System.out.println(" - " + i);
		}
	}
}
