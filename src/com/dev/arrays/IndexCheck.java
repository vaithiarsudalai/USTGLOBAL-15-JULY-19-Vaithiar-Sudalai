package com.dev.arrays;

public class IndexCheck {

	public static void main(String[] args) {
		int indCheck[] = {11,22,33,44,55};
		int i = 3;

		if (i >= 0 && i <= indCheck.length - 1) {
			System.out.println("Index is Present in the Array");
			for (int j = 0; j <= i; j++) {
				System.out.println(indCheck[j]);
			}
		} else {
			System.out.println("Index is not present in the Array");
		}

	}

}
