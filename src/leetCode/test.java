package leetCode;

public class test {

	public static void main(String[] args) {
		int[] s = { 46, 30, 82, 90, 56, 17, 95, 15 };

	}

	public void quickSort(int[] s, int i, int j) {
		int temp;
		while (i != j) {
			if (s[i] > s[j]) {
				temp = s[i];
				s[i] = s[j];
				s[j] = temp;

			}

		}
	}

}
