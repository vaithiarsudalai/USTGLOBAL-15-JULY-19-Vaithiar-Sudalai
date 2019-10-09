package com.dev.strings;

public class StringMethodExample {

	public static void main(String[] args) {

		String str = "Who_Cares";
		String st = "who_cares";

		int length = str.length();
		System.out.println("Output for length(): "+length);

		char[] ch = str.toCharArray();
		System.out.println("Output for toCharArray(): "+ch[0]);

		char c = str.charAt(2);
		System.out.println("Output for charAt(): "+c);

		boolean b = str.equals(st);
		System.out.println("Output for equals(): "+b);

		boolean b1 = str.equalsIgnoreCase(st);
		System.out.println("Output for equalsIgnoreCase(): "+b1);

		length = st.length();
		System.out.println("Output for length(): "+length);

		char[] ch1 = st.toCharArray();
		System.out.println("Output for toCharArray(): "+ch1[0]);

		c = st.charAt(2);
		System.out.println("Output for charAt(): "+c);

	}

}
