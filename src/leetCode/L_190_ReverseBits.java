package leetCode;

public class L_190_ReverseBits {

	public static void main(String[] arg0) {
		int i = 43261596;
		// int i= 4294967295;
		StringBuilder result = new StringBuilder();

		String binaryStr = java.lang.Integer.toBinaryString(i);
		System.out.println(i);
		System.out.println(binaryStr);
		System.out.println(binaryStr.length());

		Integer length = binaryStr.length() - 1;
		int count = 32 - length;
		for (int j = length; j >= 0; j--) {
			result.append(binaryStr.charAt(j));
		}
		for (int z = 0; z < count - 1; z++) {
			result.append(0);
		}

		// BigInteger m= new BigInteger(result.toString(),2);
		Long m = Long.parseLong(result.toString(), 2);
		// String mStr = java.lang.Integer.toBinaryString(m);
		int x = m.intValue();

		System.out.println("--------------");
		System.out.println(m);
		System.out.println(result);
		System.out.println(result.length());
	}
}
