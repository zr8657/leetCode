package com.learn.simple;

public class L_383_Ransom_Note {

	public static void main(String[] args) {
		String ransomNote = "a";
		String magazine = "b";
		// String ransomNote = "aa";
		// String magazine = "aab";
		System.out.println(canConstruct(ransomNote, magazine));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		int[] temp = new int[26];

		for (int i = 0; i < magazine.length(); i++) {
			temp[magazine.charAt(i) - 'a']++;
		}
		for (int i = 0; i < ransomNote.length(); i++) {
			if (--temp[ransomNote.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
