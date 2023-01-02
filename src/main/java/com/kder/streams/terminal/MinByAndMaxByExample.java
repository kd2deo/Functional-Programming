package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MinByAndMaxByExample {

    // Collectors.minBy(Comparator.comparing(Employee::getSalary)
    private static final Supplier<Optional<Employee>> minSalaryEmp = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
    };

    // Collectors.maxBy(Comparator.comparing(Employee::getSalary)
    private static final Supplier<Optional<Employee>> maxSalaryEmp = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
    };

    public static void main(String[] args) {
        minSalaryEmp.get().ifPresent(System.out::println);
        maxSalaryEmp.get().ifPresent(System.out::println);
    }

}
