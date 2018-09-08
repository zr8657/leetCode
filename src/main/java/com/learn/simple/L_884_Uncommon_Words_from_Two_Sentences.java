package com.learn.simple;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class L_884_Uncommon_Words_from_Two_Sentences {

	public static void main(String[] args) {
		// String A = "this apple is sweet";
		// String B = "this apple is sour";
		// String A = "apple apple";
		// String B = "banana";
		String A = "s z z z s";
		String B = "s z ejt";

		String[] print = uncommonFromSentences(A, B);

		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}
	}

	public static String[] uncommonFromSentences(String A, String B) {
		String result = A + " " + B;
		String[] array = result.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i]) - 1);
			} else {
				map.put(array[i], 0);
			}
		}
		HashSet<String> set = new HashSet<>();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue().intValue() == 0) {
				set.add(entry.getKey());
			}
		}
		return set.toArray(new String[set.size()]);
	}
	// public static String[] uncommonFromSentences(String A, String B) {
	//
	// String[] arrayA = A.split(" ");
	// String[] arrayB = B.split(" ");
	// HashMap<String, Integer> map = new HashMap<>();
	// for (int i = 0; i < arrayA.length; i++) {
	// if (map.containsKey(arrayA[i])) {
	// map.put(arrayA[i], map.get(arrayA[i]) - 1);
	// } else {
	// map.put(arrayA[i], 0);
	// }
	// }
	// for (int i = 0; i < arrayB.length; i++) {
	// if (map.containsKey(arrayB[i])) {
	// map.put(arrayB[i], map.get(arrayB[i]) - 1);
	// } else {
	// map.put(arrayB[i], 0);
	// }
	// }
	// HashSet<String> set = new HashSet<>();
	// for (Map.Entry<String, Integer> entry : map.entrySet()) {
	// if (entry.getValue().intValue() == 0) {
	// set.add(entry.getKey());
	// }
	// }
	// return set.toArray(new String[set.size()]);
	// }

}
