package com.krit.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab07 {

	public static void main(String[] args) {
		task01();
		task02();
	}

	private static void task02() {
		boolean isEven = true;
		do {
			System.out.println("Enter number: ");
			// Enter data using BufferReader 
	        BufferedReader reader = new BufferedReader( 
	            new InputStreamReader(System.in)); 
	  
	        // Reading data using readLine 
	        String input = "";
			try {
				input = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			} 
	  
	        // Printing the read line 
			try {
				isEven = Integer.parseInt(input) % 2 == 0;
				if (isEven) {
					System.out.println(" - " + input + " is even number." );
				} else {
					System.out.println(" - " + input + " is odd number.\nEnd." );
				}				
			} catch (Exception e) {
				System.out.println(" - " + input + " is not a number." );
			}

		} while (isEven);
        
	}

	private static void task01() {
		int counter = 20;
		do {
			System.out.println(counter--);
		} while ( counter > 0);
	}

}
