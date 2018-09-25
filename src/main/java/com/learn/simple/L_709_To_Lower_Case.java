package com.learn.simple;

public class L_709_To_Lower_Case {

	public static void main(String[] args) {

		// String str="HELLO";
		String str = "al&phaBET";
		System.out.println(toLowerCase(str));
	}

	public static String toLowerCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 90 && str.charAt(i) >= 65) {
				int result = str.charAt(i) + 32;
				char c = (char) result;
				sb.append(c);
			} else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}