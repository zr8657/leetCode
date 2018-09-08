package com.learn.simple;




import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class L_242_Valid_Anagram {

    public static void main(String[] arg0){
        // String s = "anagram", t = "nagaram";
          String s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] result = new int[26];
        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'a']++;
            result[t.charAt(i)-'a']--;
        }
        for(int i:result){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

}
