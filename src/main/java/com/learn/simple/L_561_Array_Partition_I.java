package com.learn.simple;

import java.util.Arrays;

public class L_561_Array_Partition_I {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2 };
		System.out.println(arrayPairSum(nums));
	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int length = nums.length;
		int sum = 0;
		for (int i = 0; i < length; i += 2) {
			sum += nums[i];
		}
		return sum;
	}
}
