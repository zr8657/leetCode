package com.learn.simple;

public class L_695_Max_Area_of_Island {

	public static void main(String[] args) {
		L_695_Max_Area_of_Island lmaoi = new L_695_Max_Area_of_Island();

		// int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0,
		// 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
		// { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0,
		// 1, 0, 1, 0, 0 },
		// { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0,
		// 0, 0, 1, 0, 0 },
		// { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1,
		// 1, 0, 0, 0, 0 } };
		// int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1,
		// 1 }, { 0, 0, 0, 1, 1 } };
		// int[][] grid = { { 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0,
		// 1 }, { 1, 1, 0, 1, 1 } };
		int[][] grid = { { 1 } };
		int nowLength = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					int tempLength = lmaoi.findLength(grid, i, j, 0);
					nowLength = Math.max(nowLength, tempLength);
				}

			}
		}
		System.out.println(nowLength);

	}

	public int findLength(int[][] grid, int i, int j, int length) {

		if (i < 0 || i + 1 > grid.length || j + 1 > grid[i].length || j < 0 || grid[i][j] == 0) {
			return length;
		}
		grid[i][j] = 0;
		length++;
		length = findLength(grid, i + 1, j, length);
		length = findLength(grid, i - 1, j, length);
		length = findLength(grid, i, j + 1, length);
		length = findLength(grid, i, j - 1, length);
		return length;
	}

}
