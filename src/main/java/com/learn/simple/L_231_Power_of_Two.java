package com.learn.simple;

public class L_231_Power_of_Two {

	public static void main(String[] arg0) {

		System.out.println(isPowerOfTwo(1073741825));
	}

	public static boolean isPowerOfTwo(int n) {
		return n > 0 && (1073741824 % n == 0);
	}

}
