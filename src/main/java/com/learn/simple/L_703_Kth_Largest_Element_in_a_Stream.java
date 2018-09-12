package com.learn.simple;

import java.util.PriorityQueue;

public class L_703_Kth_Largest_Element_in_a_Stream {
	final PriorityQueue<Integer> q;
	final int k;

	public static void main(String[] args) {
		int k = 3;
		// int k =5;
		int[] nums = { 4, 5, 8, 2 };

		L_703_Kth_Largest_Element_in_a_Stream obj = new L_703_Kth_Largest_Element_in_a_Stream(k, nums);
		// int param_1 = obj.add(k);
		System.out.println(obj.add(k));
	}

	public L_703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
		this.k = k;
		q = new PriorityQueue<>(k);
		for (int i : nums)
			add(i);
	}

	public int add(int val) {
		if (q.size() < k) {
			q.offer(val);
		} else if (q.peek() < val) {
			q.poll();
			q.offer(val);
		}
		return q.peek();
	}
}
