package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class PartitioningByExample {

    // Collectors.partitioningBy(emp -> emp.getSalary() >= 40000)
    private static final Supplier<Map<Boolean, List<Employee>>> partitioningBySalary = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() >= 40000));
    };

    // Collectors.partitioningBy(emp -> emp.getSalary() >= 40000) toSet
    private static final Supplier<Map<Boolean, Set<Employee>>> partitioningBySalary2 = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() >= 40000, Collectors.toSet()));
    };


    public static void main(String[] args) {
        System.out.println(partitioningBySalary.get());
        System.out.println(partitioningBySalary2.get());
    }

}
