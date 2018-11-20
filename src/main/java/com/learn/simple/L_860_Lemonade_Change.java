package org.local;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L_860_Lemonade_Change {

    public boolean lemonadeChange(int[] bills) {
        int dollar5=0,dollar10=0;

        if(bills[0] != 5){
            return false;
        }
        for(int i=0;i<bills.length;i++){
            if(bills[i] == 5){
                dollar5++;
            }else if(bills[i] == 10){
                dollar5--;
                dollar10++;
                if(dollar5<0){
                    return false;
                }
            }else if(bills[i] == 20){
                if(dollar10>0 && dollar5>0){
                    dollar10--;
                    dollar5--;
                }else if(dollar5>=3){
                    dollar5 -=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
