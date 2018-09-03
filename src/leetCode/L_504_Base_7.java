package com.ricelink.utils;

import java.util.Stack;

public class test1 {

    public static void main(String[] arg0){
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num) {
        int temp=num;
        if (num == 0) return "0";
        String res = "";

        while (num != 0) {
            res = Math.abs((num % 7)) + res;
            num /= 7;
        }

        return res;
    }
}
