package leetCode;

public class L_717_1_bit_and_2_bit_Characters {

	public static void main(String[] args) {
		// int bits[] = { 1, 1, 1, 0 };
		int bits[] = { 1, 0, 0 };
		int i = 0;
		while (i < bits.length) {
			if (bits[i] == 1) {
				i += 2;
			}
			if (i == bits.length) {
				System.out.println(false);
				System.exit(0);
			}
			if (bits[i] == 0) {

				i++;
			}

		}
		System.out.println(true);
	}

}
