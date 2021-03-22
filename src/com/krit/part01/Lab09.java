package com.krit.part01;

public class Lab09 {

	public static void main(String[] args) {
		for (int count = 0; count <= 20; count++) {
			System.out.print("\nCount :" + count);
			if (count == 11) {
				continue;
			}
			System.out.print("  -- Hello");
		}

	}

}
