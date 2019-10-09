package com.dev.arrays;

public class CreatingArrays {

	public static void main(String[] args) {
		int []intArr;  //declaration
		char[] chArr;
		byte byteArr[];

		intArr = new int[5];  //creation
		chArr = new char[5];
		byteArr = new byte[5];

		intArr[0] = 1;  //initialization
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;

		chArr[0] = 'A';
		chArr[1] = 'B';
		chArr[2] = 'C';
		chArr[3] = 'D';
		chArr[4] = 'E';

		byteArr[0] = 6;
		byteArr[1] = 7;
		byteArr[2] = 8;
		byteArr[3] = 9;
		byteArr[4] = 10;

		int res = intArr[0] * 3;
		System.out.println("Multiplication: "+res);

		res = intArr[2] + 6;
		System.out.println("Addition: "+res);

		res = intArr[4] - 3;
		System.out.println("Subtraction: "+res);

		res = intArr[1] / 2;
		System.out.println("Division: "+res);

		res = intArr[3] % 2;
		System.out.println("Modulus: "+res);
		
		double res1 = chArr[0] + 7;
		System.out.println("Addition of char: "+res1);
		
		res1 = chArr[4] - 2;
		System.out.println("Subtraction of char: "+res1);
		
		res1 = chArr[3] * 9;
		System.out.println("Multiplication of char: "+res1);
		
		res1 = chArr[1] / 2;
		System.out.println("Division of char: "+res1);
		
		res1 = chArr[0] % 6;
		System.out.println("Modulus of char: "+res1);
		

	}

}
