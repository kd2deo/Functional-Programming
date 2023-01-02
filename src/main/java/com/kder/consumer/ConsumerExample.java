package com.kder.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    // To Display a Number
    static Consumer<Integer> displayNumber = (num) -> System.out.println("The Number is " + num);

    // Multiply Number by 10
    static Consumer<Integer> multiplyNumberBy10 = (num) -> {
        int result = num * 10;
        System.out.println("After Multiplying a Number by 10: " + result);
    };

    // Multiply each element of list by 10
    static Consumer<List<Integer>> multiplyElementsBy10 = (elements) -> {
        elements.replaceAll(integer -> integer * 10);
    };

    // Display List of Number
    static Consumer<List<Integer>> displayListOfNumber = (list) -> {
      list.forEach(System.out::println);
    };

    public static void main(String[] args) {

        displayNumber.accept(10);

        multiplyNumberBy10.accept(10);

        List<Integer> elements = Arrays.asList(10, 20, 30, 40, 50, 60);
        multiplyElementsBy10.accept(elements);

        displayListOfNumber.accept(elements);

        // andThen
        multiplyElementsBy10.andThen(displayListOfNumber).accept(elements);

    }

}
