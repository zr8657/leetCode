package leetCode;

import java.util.HashMap;

public class L_001_TwoSum {

	/**
	 * 两数之和 Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] =
	 * 2 + 7 = 9, return [0, 1].
	 */

	class Solution {
		public int[] twoSum(int[] nums, int target) {

			HashMap<Integer, Integer> map = new HashMap();
			for (int i = 0; i < nums.length; i++) {
				map.put(nums[i], i);
			}

			for (int i = 0; i < nums.length; i++) {
				int result = target - nums[i];
				if (map.containsKey(result) && map.get(result) != i) { // 没什么好说的就是用Hash把时间缩短到O(n)
					return new int[] { i, map.get(result) };
				}
			}
			throw new IllegalArgumentException("error");
		}
	}

}
