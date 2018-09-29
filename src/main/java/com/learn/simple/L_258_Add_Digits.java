package com.learn.simple;

public class L_258_Add_Digits {

	public static void main(String[] arg0) {
		int num = 38;
		System.out.println(addDigits(num));
	}

	public static int addDigits(int num) {
		return num == 0 ? 0 : (num % 9 == 0 ? 9 : (num % 9));
	}
}
