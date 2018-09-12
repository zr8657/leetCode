package com.learn.simple;

public class L_292_Nim_Game {

	public static void main(String[] args) {
		int n = 4;

		System.out.println(canWinNim(n));
	}

	public static boolean canWinNim(int n) {
		if (n <= 0) {
			return false;
		}
		return n % 4 != 0;
	}
}