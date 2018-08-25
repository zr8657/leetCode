package leetCode;

public class L_695_Max_Area_of_Island {

	static int resultLength = 0;

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
		int[][] grid = { { 1, 1, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 0, 0, 0, 1, 1 }, { 0, 0, 0, 1, 1 } };
		// int[][] grid = { { 1, 1, 0, 1, 1 }, { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0,
		// 1 }, { 1, 1, 0, 1, 1 } };

		int nowLength = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == 1) {
					resultLength = 1;
					lmaoi.findLength(grid, i, j);
					if (nowLength < resultLength) {
						nowLength = resultLength;
					}
				}

			}
		}
		System.out.println(nowLength);

	}

	public void findLength(int[][] grid, int i, int j) {

		if (i + 1 < grid.length && grid[i + 1][j] == 1) {
			findLength(grid, i + 1, j);
			resultLength++;
		}

		if (j + 1 < grid[i].length && grid[i][j + 1] == 1) {

			findLength(grid, i, j + 1);
			resultLength++;
		}

	}

}
