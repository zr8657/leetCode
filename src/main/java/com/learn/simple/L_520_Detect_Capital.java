package com.learn.simple;

public class L_520_Detect_Capital {

	public static void main(String[] args) {
		String word = "USA";
		// String word ="FlaG";
		// String word ="usa";
		// String word = "FFFFFFFFFFFFFFFFFFFFf";
		// String word ="Leetcode";
		// String word = "ggg";
		System.out.println(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		// return word.matches("[A-Z][a-z]*|[A-Z]*|[a-z]*");
		int result = 0;
		for (char c : word.toCharArray())
			if ('Z' - c >= 0) {
				result++;
			}
		return ((result == 0 || result == word.length()) || (result == 1 && 'Z' - word.charAt(0) >= 0));
	}
}