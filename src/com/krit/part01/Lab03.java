package com.krit.part01;

public class Lab03 {

	public static void main(String[] args) {
		int i = 20;
		
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		
		float f = 1.2345f;
		if(f > 1 && f < 2) {
			System.out.println("OK");
		}
		
		char c = 'X';
		if(c < 'A' || c > 'Z') {
			System.out.println("Not a capital letter");
		}
	}

}
