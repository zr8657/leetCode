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

public class L_709_To_Lower_Case {

    public static  void main(String[] args){

       // String str="HELLO";
        String str ="al&phaBET";
        System.out.println(toLowerCase(str));
    }
    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)<=90 && str.charAt(i)>=65){
                int result=str.charAt(i)+32;
                char c= (char) result;
                sb.append(c);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}