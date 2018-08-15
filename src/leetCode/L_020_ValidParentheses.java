package leetCode;

import java.util.Stack;

public class L_020_ValidParentheses {

	// Given a string containing just the characters '(', ')', '{', '}', '[' and
	// ']', determine if the input string is valid.
	//
	// An input string is valid if:
	//
	// Open brackets must be closed by the same type of brackets.
	// Open brackets must be closed in the correct order.
	// Note that an empty string is also considered valid.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{}()";
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		stack.push('#');
		while (i < s.length()) {
			if ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[')
					|| (s.charAt(i) == '}' && stack.peek() == '{')) {
				i++;
				stack.pop();
			} else {
				stack.push(s.charAt(i));
				i++;
			}

		}
		if (stack.peek() == '#') {
			System.out.println(true);
		} else {
			System.out.println(true);
		}

	}

}
