package com.learn.simple;

public class L_441_Arranging_Coins {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(arrangeCoins(n));
	}

	public static int arrangeCoins(int n) {
		// 前N项和公式
		// (1+k)*k/2 = n
		// k+k*k = 2*n
		// k*k + k + 0.25 = 2*n + 0.25
		// (k + 0.5) ^ 2 = 2*n +0.25
		// k + 0.5 = sqrt(2*n + 0.25)
		// k = sqrt(2*n + 0.25) - 0.5

		return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
	}
	/*
	 * public static int arrangeCoins(int n) { if (n == 0) { return 0; } int
	 * count = 0; while (true) { count++; n -= count; if (n < count + 1) {
	 * break; } }
	 * 
	 * return count; }
	 */
}
