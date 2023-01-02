package com.kder.optional;

import java.util.Optional;

public class OptionalExample2 {

    // return Optional.ofNullable -> Use if not sure about value could be null
    private static Optional<String> ofNullableExample() {
        String name = "Krishan";
        return Optional.ofNullable(name);
    }

    // Optional.of -> Used only if sure about value couldn't be null
    private static Optional<String> ofExample() {
        String name = "Krishan";
        return Optional.of(name);
    }

    // Optional.empty()
    private static Optional<String> emptyExample() {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println(ofNullableExample());
        System.out.println(ofExample());
        System.out.println(emptyExample());
    }

}
