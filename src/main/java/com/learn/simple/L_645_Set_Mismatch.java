package com.learn.simple;

public class L_645_Set_Mismatch {

	public static void main(String[] args) {
		// int[] nums = {1,2,2,4};
		int[] nums = { 3, 2, 2 };
		// int[] nums = {2,2};
		int[] a = findErrorNums(nums);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}

	public static int[] findErrorNums(int[] nums) {
		int[] res = new int[2];
		for (int i : nums) {
			if (nums[Math.abs(i) - 1] < 0) {
				res[0] = Math.abs(i);
			} else {
				nums[Math.abs(i) - 1] *= -1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				res[1] = i + 1;
			}
		}
		return res;
	}
}