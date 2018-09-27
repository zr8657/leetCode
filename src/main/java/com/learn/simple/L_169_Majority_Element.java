package com.learn.simple;

import java.util.HashMap;
import java.util.Map;

public class L_169_Majority_Element {

	public static void main(String[] arg0) {
		// int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
	}

	public static int majorityElement(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 0);
			}
		}
		int result = 0;
		int temp = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > temp) {
				result = entry.getKey();
				temp = entry.getValue();
			}
		}
		return result;
	}
}
