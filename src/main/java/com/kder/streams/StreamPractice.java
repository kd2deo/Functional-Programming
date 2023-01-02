package com.kder.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

        /*List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Aisha", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Bob", Gender.OTHER),
            new Person("Alice", Gender.FEMALE)
        );

        // Print Name
        System.out.println("===========List of Name===========");
        people.stream()
            .map(person -> person.name)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        // Print Gender
        System.out.println("===========List of Gender===========");
        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        // List Male
        System.out.println("===========List of Male List===========");*/



    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE, OTHER
    }

}
