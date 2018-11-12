package org.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L_628_Maximum_Product_of_Three_Numbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3], nums[n-1] * nums[0] * nums[1]);
    }
}
