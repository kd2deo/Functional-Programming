package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MappingTerminalExample {

    // Collect Name without mapping Collector
    private static final Supplier<List<String>> listOfEmpNameWithoutMapping = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    };

    // // Collect Name with mapping Collector
    private static final Supplier<List<String>> listOfEmpNameWithMappingList = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.mapping(Employee::getName, Collectors.toList()));
    };

    // // Collect Name with mapping Collector
    private static final Supplier<Set<String>> listOfEmpNameWithMappingSet = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.mapping(Employee::getName, Collectors.toSet()));
    };


    public static void main(String[] args) {
        System.out.println(listOfEmpNameWithoutMapping.get());
        System.out.println(listOfEmpNameWithMappingList.get());
        System.out.println(listOfEmpNameWithMappingSet.get());
    }

}
