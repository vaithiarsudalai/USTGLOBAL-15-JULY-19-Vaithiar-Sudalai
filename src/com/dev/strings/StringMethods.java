package com.dev.strings;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Nothing_Much";
		String str1 = "nothing_much";

		int length = str.length();
		System.out.println("Output for length(): "+length);

		char[] ch = str.toCharArray();
		System.out.println("Output for toCharArray(): "+ch[11]);

		char c = str.charAt(9);
		System.out.println("Output for charAt(): "+c);

		boolean b = str.equals(str1);
		System.out.println("Output for equals(): "+b);

		boolean b1 = str.equalsIgnoreCase(str1);
		System.out.println("Output for equals(): "+b1);

		boolean v = str.contains("NOt");
		System.out.println("Output for contains(): "+v);

		String g = str.replace('M','S' );
		System.out.println("Output for replace('M','S' ): "+g);

		int f = str.indexOf('t');
		System.out.println("Output for indexOf('t'): "+f);

		String y = str.toUpperCase();
		System.out.println("Output for toUpperCase() : "+y);

		String q = y.toLowerCase();
		System.out.println("Output for toUpperCase() : "+q);

		String a = str.substring(3);
		System.out.println("Output for substring(3) : "+a);

		String t = str.substring(3,11);
		System.out.println("Output for substring(3) : "+t);

	}

}
