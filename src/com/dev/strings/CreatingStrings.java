package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {

		String str;
		str = "Hello";

		String str1 = "Java";
		
		String string = "a"+"b"+"c";

		char a = 'a';
		char b = 'b';
		 System.out.println(a+b); 
		
		String str2 = new String("Hello Java");

		StringBuffer sb = new StringBuffer("Hey");
		StringBuilder sbi = new StringBuilder("You");

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(sb);
		System.out.println(sb + " " + sbi);
		System.out.println(string);

		String s = " I live in India";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += (split[i] + " ");
		}
		System.out.println(result.trim());
		

	}

}
