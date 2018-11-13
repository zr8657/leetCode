package org.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L_066_Plus_One {

    public static void main(String[] arg0) {
        int[] nums = {1, 2, 3};
        int[] a = plusOne(nums);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }
}
