package com.learn.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class L_599_Minimum_Index_Sum_of_Two_Lists {

    public static void main(String[] arg0){
        //   String[] test1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
        //  String[] test2={"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    //    String[] test1={"Shogun", "Tapioca Express", "Burger King", "KFC"};
   //     String[] test2={"KFC", "Shogun", "Burger King"};
     //   String[] test1={"Shogun","Tapioca Express","Burger King","KFC"};
//        //    String[] test1={"Shogun","Tapioca Express","Burger King","KFC"};
        //   String[] test2={"KFC","Shogun","Burger King"};
           String[] test1={"k","KFC"};
           String[] test2={"k","KFC"};


        for (int i =0;i<findRestaurant(test1,test2).length;i++){
            System.out.println(findRestaurant(test1,test2)[i]);
        }

    }


    public static String[] findRestaurant(String[] list1, String[] list2) {
        List list = new ArrayList();
        int num = 0;
        int length = 0;
        HashMap<String,Integer> map = new HashMap();
        for (int i =0 ;i<list1.length;i++){
            map.put(list1[i],i);
        }
        for (int i =0 ;i<list2.length;i++){
            if (map.containsKey(list2[i])){
                if(length == 0 && list.size() ==0){
                    list.add(list2[i]);
                    length = map.get(list2[i])+i;
                }
                if (length>map.get(list2[i])+i){
                    length = map.get(list2[i])+i;
                    list.set(list.size()-1,list2[i]);
                }
                if(length == map.get(list2[i])+i && !list.get(list.size()-1).equals(list2[i])){
                    list.add(list2[i]);
                }
            }
        }
        String[] result = new String[list.size()];
        list.toArray(result);
        return result;
    }
}
