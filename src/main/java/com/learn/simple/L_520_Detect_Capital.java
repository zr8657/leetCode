package com.ricelink.utils;




import com.alibaba.druid.sql.visitor.functions.Char;
import com.ricelink.model.extractModel.SpAssessDetail;
import com.ricelink.service.extractService.AssessExtract.AssessDetailExtracService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class test1 {

    public static  void main(String[] args){
         String word ="USA";
        //  String word ="FlaG";
        //  String word ="usa";
        //   String word = "FFFFFFFFFFFFFFFFFFFFf";
        //   String word ="Leetcode";
        //  String word = "ggg";
                System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        // return word.matches("[A-Z][a-z]*|[A-Z]*|[a-z]*");
        int result = 0;
        for(char c: word.toCharArray()) if('Z' - c >= 0){
            result++;
        }
        return ((result==0 || result==word.length()) || (result==1 && 'Z' - word.charAt(0)>=0));
    }
}