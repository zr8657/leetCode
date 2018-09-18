package com.learn.simple;

public class L_598_Range_Addition_II {

	public static void main(String[] args) {
		int m = 3;
		int n = 3;
		int[][] operations = { { 2, 2 }, { 3, 3 } };
		System.out.println(maxCount(m, n, operations));
	}

	public static int maxCount(int m, int n, int[][] ops) {
		if (ops == null || ops.length == 0) {
			return m * n;
		}
		int row = Integer.MAX_VALUE, col = Integer.MAX_VALUE;
		for (int[] op : ops) {
			row = Math.min(row, op[0]);
			col = Math.min(col, op[1]);
		}
		return row * col;
	}
}