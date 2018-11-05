package org.local;

import java.util.HashSet;
import java.util.Set;

public class L_575_Distribute_Candies {

    public static int distributeCandies(int[] candies) {
        Set<Integer> kinds = new HashSet<>();
        for (int candy : candies) kinds.add(candy);
        return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();
    }
}
