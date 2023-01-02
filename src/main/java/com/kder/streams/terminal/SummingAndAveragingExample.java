package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SummingAndAveragingExample {

    // Collectors.summingInt(Employee::getSalary)
    private static final Supplier<Integer> sumOfAllEmpSalary = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.summingInt(Employee::getSalary));
    };

    // Collectors.averagingInt(Employee::getSalary)
    private static final Supplier<Double> avgOfAllEmpSalary = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.averagingInt(Employee::getSalary));
    };

    public static void main(String[] args) {
        System.out.println(sumOfAllEmpSalary.get());
        System.out.println(avgOfAllEmpSalary.get());
    }

}
