package com.kder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapPractice {

    public static void main(String[] args) {

        // convertStrArrayToInt();

        distinctSalary();

    }

    private static void convertStrArrayToInt() {

        List<String> listOfString = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> distinctSal = listOfString.stream()
            .map(value -> Integer.parseInt(value))
            .collect(Collectors.toList());

        System.out.println(distinctSal);

        // Alternate
        List<Integer> distinctSal2 = listOfString.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());

        System.out.println(distinctSal2);



    }

    private static void distinctSalary() {

        List<Employee> employees = Arrays.asList(
            new Employee("1", "Alex", 85000D),
            new Employee("2", "John", 86000D),
            new Employee("3", "Bob", 85000D),
            new Employee("4", "David", 86000D),
            new Employee("5", "Alice", 84000D)
        );

        employees.stream()
            .map(employee -> employee.getSalary())
            .distinct()
            .collect(Collectors.toList())
            .forEach(salary -> System.out.println(salary));

        // Alternate
        System.out.println("=========Alternate====");
        employees.stream()
            .map(Employee::getSalary)
            .distinct()
            .collect(Collectors.toList())
            .forEach(System.out::println);

    }

    static class Employee {

        private String id;
        private String name;
        private Double salary;

        public Employee(String id, String name, Double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public Double getSalary() {
            return salary;
        }
    }

}
