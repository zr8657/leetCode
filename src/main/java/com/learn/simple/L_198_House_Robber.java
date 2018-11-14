package org.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L_198_House_Robber {

    public int rob(int[] nums) {
        int i = 0;
        int e = 0;
        for (int k = 0; k<nums.length; k++) {
            int tmp = i;
            i = nums[k] + e;
            e = Math.max(tmp, e);
        }
        return Math.max(i,e);
    }
}
