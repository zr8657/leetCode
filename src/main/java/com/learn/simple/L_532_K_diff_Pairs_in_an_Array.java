package com.learn.simple;

import java.util.HashMap;
import java.util.Map;

public class L_532_K_diff_Pairs_in_an_Array {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 4, 1, 5 };
		int k = 2;
		System.out.println(findPairs(nums, k));
	}

	public static int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
			return 0;
		}

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (k == 0) {
				if (entry.getValue() >= 2) {
					count++;
				}
			} else {
				if (map.containsKey(entry.getKey() + k)) {
					count++;
				}
			}
		}

		return count;
	}
}
