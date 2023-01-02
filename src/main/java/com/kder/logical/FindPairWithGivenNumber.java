package com.kder.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Find a pair with the given sum in an array
 *
 *
 * Input:
 *
 * arr = [8, 7, 2, 5, 3, 1]
 * sum = 10
 *
 * Output:
 *
 * Pair found at index 0 and 2 (8 + 2)
 *
 * or
 *
 * Pair found at index 1 and 4 (7 + 3)
 *
 */
public class FindPairWithGivenNumber {

    public static void main(String[] args) {
        int arr[] = {1, 4, 7, 19, 9};
        findPair(arr, 26);
        findPairUsingHashing(arr, 26);
    }

    /**
     *  First short the Array
     *  complexity O(n.log(n))
     */
    private static void findPair(int []arr, int sum) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if(arr[left] + arr[right] == sum) {
                System.out.println("Found: " + "(" + arr[left] + ", " + arr[right] + ")");
                return;
            } else if( (arr[left] + arr[right]) < sum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Pair Not Found");

    }

    private static void findPairUsingHashing(int []arr, int sum) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if( list.contains(sum - arr[i]) ) {
                System.out.println("Found: " + "(" + arr[i] + ", " + (sum - arr[i]) + ")");
                return;
            }
            list.add(arr[i]);
        }

        System.out.println("Pair Not Found");

    }

}
