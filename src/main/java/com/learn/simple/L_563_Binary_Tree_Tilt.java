package com.learn.simple;

public class L_563_Binary_Tree_Tilt {
	/**
	 * Definition for a binary tree node. public class TreeNode { int val;
	 * TreeNode left; TreeNode right; TreeNode(int x) { val = x; } }
	 */
	/*
	 * class Solution { int result = 0;
	 * 
	 * public int findTilt(TreeNode root) { helper(root); return result; }
	 * 
	 * public int helper(TreeNode root) { if (root == null) return 0; int
	 * leftSum = helper(root.left); int rightSum = helper(root.right); result +=
	 * Math.abs(leftSum - rightSum); return leftSum + rightSum + root.val; } }
	 */
}