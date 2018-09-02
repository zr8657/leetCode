package leetCode;

import java.util.Stack;

public class L_682_Baseball_Game {

	public static void main(String[] arg0) {
		// String[] ops = { "5", "2", "C", "D", "+" };
		String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };
		System.out.println(calPoints(ops));
	}

	// public static int calPoints(String[] ops) {
	// int result = 0;
	// Stack<Integer> stack = new Stack<>();
	// for (int i = 0; i < ops.length; i++) {
	// if (ops[i].equals("+")) {
	// int a = stack.pop();
	//
	// int b = stack.peek();
	// stack.push(a);
	// stack.push(a + b);
	//
	// result += stack.peek();
	// } else if (ops[i].equals("D")) {
	// stack.push(stack.peek() * 2);
	//
	// result += stack.peek();
	// } else if (ops[i].equals("C")) {
	// // stack.pop();
	//
	// result -= stack.pop();
	// } else {
	// stack.push(Integer.parseInt(ops[i]));
	//
	// result += stack.peek();
	// }
	// }
	// // while (!stack.isEmpty()) {
	// // result += stack.pop();
	// // }
	//
	// return result;
	// }
	// 此方法更易懂上面更快
	public static int calPoints(String[] ops) {
		int result = 0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("+")) {
				int a = stack.pop();

				int b = stack.peek();
				stack.push(a);
				stack.push(a + b);
			} else if (ops[i].equals("D")) {
				stack.push(stack.peek() * 2);
			} else if (ops[i].equals("C")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(ops[i]));
			}
		}
		while (!stack.isEmpty()) {
			result += stack.pop();
		}

		return result;
	}
}
