package org.local;

import java.util.HashSet;
import java.util.Set;

public class L_747_Largest_Number_At_Least_Twice_of_Others {

        public static int dominantIndex(int[] nums) {
            int maxOne = 0, maxTwo = 0, idx = 0;
            for(int i=0; i<nums.length; i++){
                if(maxOne < nums[i]){
                    maxTwo = maxOne;
                    maxOne = nums[i];
                    idx = i;
                }
                else if(maxTwo < nums[i]){
                    maxTwo = nums[i];
                }
            }
            return (maxOne>=maxTwo*2) ? idx : -1;
        }
}
