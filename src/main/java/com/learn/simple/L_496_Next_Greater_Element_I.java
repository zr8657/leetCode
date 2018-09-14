package com.learn.simple;

import java.util.LinkedHashMap;

public class L_496_Next_Greater_Element_I {

	public static void main(String[] args) {
		// int[] nums1 = { 4, 1, 2 };
		// int[] nums2 = { 1, 3, 4, 2 };
		int[] nums1 = { 2, 4 };
		int[] nums2 = { 1, 2, 3, 4 };
		for (int i = 0; i < nextGreaterElement(nums1, nums2).length; i++) {
			System.out.println(nextGreaterElement(nums1, nums2)[i]);
		}
	}

	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length];

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < nums2.length; i++) {
			map.put(nums2[i], i);
		}

		for (int i = 0; i < nums1.length; i++) {
			for (int j = map.get(nums1[i]); j < nums2.length; j++) {
				if (nums2[j] > nums1[i]) {
					result[i] = nums2[j];
					break;
				}
				result[i] = -1;
			}
		}
		return result;
	}
}
