package com.learn.simple;

import java.util.HashSet;

public class L_804_Unique_Morse_Code_Words {

	public static void main(String[] arg0) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));
	}

	public static int uniqueMorseRepresentations(String[] words) {
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < words.length; i++) {
			StringBuilder s = new StringBuilder();
			for (int j = 0; j < words[i].length(); j++) {
				s.append(morse[words[i].charAt(j) - 'a']);
			}
			set.add(s.toString());
		}
		return set.size();
	}

}
