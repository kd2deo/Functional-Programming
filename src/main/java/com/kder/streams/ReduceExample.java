package com.kder.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ReduceExample {


    // Sum of List
    // reduce -> T reduce(T var1, BinaryOperator<T> var2);
    private static final Function<List<Integer>, Integer> sumOfList = (values) -> values.stream()
            .reduce(0, Integer::sum);

    // Multiplication of List
    // reduce -> T reduce(T var1, BinaryOperator<T> var2);
    private static final Function<List<Integer>, Integer> multiplicationOfList = (values) -> values.stream()
            .reduce(1, (val1, val2) -> val1 * val2);

    // Maximum from List
    private static final Function<List<Integer>, Integer> maximum = (values) -> values.stream()
            .reduce(0, Integer::max);

    // Maximum from List with Optional.
    // Optional<T> reduce(BinaryOperator<T> var1);
    private static final Function<List<Integer>, Optional<Integer>> maximumWithOptional = (values) -> values.stream()
            .reduce((val1, val2) -> val1 > val2 ? val1 : val2);

    // Minimum from List
    private static final Function<List<Integer>, Optional<Integer>> minimum = (values) -> values.stream()
            .reduce(Integer::min);

    // Find third-highest Number
    private static final Function<List<Integer>, Optional<Integer>> findThirdHighest = (values) -> values.stream()
            .sorted(Comparator.reverseOrder())
            .skip(2)
            .findFirst();


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 12, 34, 50, 34, 49, 60);

        System.out.println("Sum of List: " + sumOfList.apply(list));

        System.out.println("Multiplication of List: " + multiplicationOfList.apply(list));

        System.out.println("Maximum from List: " + maximum.apply(list));

        System.out.println("Minimum from List: " + minimum.apply(list));

        Optional<Integer> maximum = maximumWithOptional.apply(list);
        maximum.ifPresent(integer -> System.out.println("Maximum from List with Optional: " + integer));

        Optional<Integer> min = minimum.apply(list);
        min.ifPresent(integer -> System.out.println("Minimum from List: " + integer));

        Optional<Integer> thirdHighest = findThirdHighest.apply(list);
        thirdHighest.ifPresent((value) -> System.out.println("Third Highest Number: " + value));

    }

}
