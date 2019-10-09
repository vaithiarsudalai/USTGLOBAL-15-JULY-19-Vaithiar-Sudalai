package com.dev.arrays;

public class MidValue {

	public static void main(String[] args) {
		int[] intArr = {11,22,33,44,55};
		int m =  intArr.length % 2;

		if (m == 0) {
			System.out.println(intArr[m]);
			System.out.println(intArr[m+1]);
		} else {
			System.out.println(intArr[m+1]);
		} 

	}

}
