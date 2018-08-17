package leetCode;

public class L_119_PascalIsTriangleII {

	// Given a non-negative index k where k ≤ 33, return the kth index row of
	// the Pascal's triangle.
	//
	// Note that the row index starts from 0.
	// 今天头疼更不动
	public static void main(String[] args) {
		int rows = 10;

		for (int i = 0; i < rows; i++) {
			int number = 1;
			// 打印空格字符串
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}
