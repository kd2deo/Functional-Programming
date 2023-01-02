package com.kder.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Check if a subarray with 0 sum exists or not
 *
 * Input:  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 *
 * Output: Subarray with zero-sum exists
 *
 * The subarrays with a sum of 0 are:
 *
 * { 3, 4, -7 }
 * { 4, -7, 3 }
 * { -7, 3, 1, 3 }
 * { 3, 1, -4 }
 * { 3, 1, 3, 1, -4, -2, -2 }
 * { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 *
 */
public class SubArrayWithZeroSum {

    public static void main(String[] args) {

        int arr[] = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        findSubArrayWithZero(arr);
        hasZeroSumSubArray(arr);

    }

    /**

     * Complexity: O(n^2)
     *
     */
    private static void findSubArrayWithZero(int []arr) {

        //Arrays.sort(arr);

        List<Integer> result = null;

        for (int i = 0; i < arr.length; i++) {
            result = new ArrayList<>();
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                result.add(arr[j]);
                if(sum == 0) {
                    System.out.println(result);
                }
            }

        }

    }

    private static void hasZeroSumSubArray(int []arr) {

        Set<Integer> set = new HashSet<>();

        int sum = 0;
        for (int elem : arr) {
            sum += elem;
            if(elem == 0
                || sum == 0
                || set.contains(sum)
            ) {
                System.out.println("Sum of Sub Array with Zero Found");
                return;
            } else {
                set.add(sum);
            }
        }
        System.out.println("Not Found");

    }

}
