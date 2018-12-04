package org.webmaic.example;

import org.hibernate.validator.constraints.SafeHtml;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webmaic.example.util.WebdriverUtil;

import java.lang.reflect.Array;
import java.util.*;

public class L_387_First_Unique_Character_in_a_String {
    public static void main(String[]  arg0){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int result[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (result[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
