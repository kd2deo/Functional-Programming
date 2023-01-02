package com.kder.lambda;

import java.util.Comparator;

public class ComparatorExample {

    public static void main(String[] args) {

        // Prior to Java 8
        Comparator<Integer> comparatorWithAnonClass = new Comparator<Integer>() {
            @Override
            public int compare(Integer val1, Integer val2) {
                return val1.compareTo(val1);
            }
        };
        System.out.println("Result of Comparator(With Anonymous Class): " + comparatorWithAnonClass.compare(10, 5));

        // With Lambda
        Comparator<Integer> comparatorWithLambda = (Integer val1, Integer val2) -> {
            return val1.compareTo(val2);
        };
        System.out.println("Result of Comparator(With Lambda):" + comparatorWithLambda.compare(10, 5));

        // With Lambda 2nd Way
        Comparator<Integer> comparatorWithLambda2 = (val1, val2) -> {
            return val1.compareTo(val2);
        };
        System.out.println("Result of Comparator(With Lambda2):" + comparatorWithLambda2.compare(10, 5));

        // With Lambda 3rd Way
        Comparator<Integer> comparatorWithLambda3 = (val1, val2) -> val1.compareTo(val2);
        System.out.println("Result of Comparator(With Lambda3):" + comparatorWithLambda3.compare(10, 5));

        // With Lambda 4th Way
        Comparator<Integer> comparatorWithLambda4 = Integer::compareTo;
        System.out.println("Result of Comparator(With Lambda4):" + comparatorWithLambda4.compare(10, 5));

    }

}
