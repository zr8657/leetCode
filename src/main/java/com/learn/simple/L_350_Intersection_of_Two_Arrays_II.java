package org.webmaic.example;

import org.hibernate.validator.constraints.SafeHtml;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webmaic.example.util.WebdriverUtil;

import java.util.*;

public class L_350_Intersection_of_Two_Arrays_II {
    public static void main(String[] arg0) {
        int nums1[] = {4, 9, 5};
        int nums2[] = {9, 4, 9, 8, 4};
        int result[] = intersect(nums1, nums2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int p1 = 0;
        int p2 = 0;
        List<Integer> s = new ArrayList<>();
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                s.add(nums1[p1]);
                p1++;
                p2++;
            } else if (nums1[p1] < nums2[p2]){
                p1++;
            }
            else{
                p2++;
            }
        }
        int[] r = new int[s.size()];
        for (int i = 0; i < s.size(); i++) {
            r[i] = s.get(i);
        }
        return r;
    }
}
