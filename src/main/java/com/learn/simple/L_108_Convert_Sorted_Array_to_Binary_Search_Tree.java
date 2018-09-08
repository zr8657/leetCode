package com.learn.simple;

public class L_108_Convert_Sorted_Array_to_Binary_Search_Tree {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	//
	// public TreeNode sortedArrayToBST(int[] nums) {
	// if (nums.length == 0) {
	// return null;
	// }
	// TreeNode result = insertNode(nums, 0, nums.length - 1);
	// return result;
	//
	// }
	//
	// public TreeNode insertNode(int[] nums,int left,int right) {
	// if(left>right){
	// return null;
	// }
	//
	// int mid = (left + right) / 2;
	// TreeNode node = new TreeNode(nums[mid]);
	// node.left = insertNode(nums, left, mid - 1);
	// node.right = insertNode(nums, mid + 1, right);
	// return node;
	// }
}
