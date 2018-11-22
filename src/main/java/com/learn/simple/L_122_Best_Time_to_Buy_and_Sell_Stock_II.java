package org.webmaic.example;

import org.hibernate.validator.constraints.SafeHtml;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.webmaic.example.util.WebdriverUtil;

import java.util.*;

public class L_122_Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if (prices[i] > prices[i - 1])
                result += prices[i] - prices[i - 1];
        }
        return result;
    }
}
