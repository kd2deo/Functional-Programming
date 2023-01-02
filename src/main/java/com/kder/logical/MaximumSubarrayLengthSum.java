package com.kder.logical;

import java.util.HashMap;
import java.util.Map;

/**
 * Find maximum length subarray having a given sum
 *
 * A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
 * Sum = 8
 *
 *
 * Subarrays with sum 8 are
 *
 * { -5, 5, 3, 5 }
 * { 3, 5 }
 * { 5, 3 }
 *
 * The longest subarray is { -5, 5, 3, 5 } having length 4
 */
public class MaximumSubarrayLengthSum {

    public static void main(String[] args) {

        int A[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
        find(A, 8);
    }

    private static void find(int []arr, int sum) {

        Map<Integer, Integer> map = new HashMap<>();
        int len = 0;

        // insert `(0, -1)` pair into the set to handle the case when a
        // subarray with sum `S` starts from index 0
        map.put(0, -1);

        int arrSum = 0;
        int endingInx = -1;
        for (int i = 0; i < arr.length; i++) {

            arrSum += arr[i];
            map.putIfAbsent(arrSum, i);
            if(map.containsKey(arrSum - sum) && len < (i - map.get(arrSum - sum)) ) {
                len = i - map.get(arrSum - sum) ;
                endingInx = i;
            }

        }

        System.out.println("[" + ((endingInx - len) + 1) + ", " + endingInx + "]");

    }

}
