package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class GroupByExample {

    // Group All Employee By Department
    private static final Supplier<Map<String, List<Employee>>> groupByDepartment = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    };

    // Group By Custom Key
    // If salary >= 40000 then come under EXPERIENCED group otherwise FRESHER
    private static final Supplier<Map<String, List<Employee>>> groupByCustom = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary() >= 40000 ? "EXPERIENCED" : "FRESHER"));
    };

    // Two Level Grouping
    // Department -> City -> []
    private static final Supplier<Map<String, Map<String, List<Employee>>>> twoLevelGrouping = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(Employee::getCity)));
    };

    // Calculate Sum of Salaried paid based on Department
    private static final Supplier<Map<String, Integer>> salaryBasedOnDepartment = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.summingInt(Employee::getSalary)));
    };

    //
    private static final Supplier<Map<String, List<Employee>>> thirdArgument = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, LinkedHashMap::new, Collectors.toList()));
    };

    // Get Employees By Department whose salary is maximum
    private static final Supplier<Map<String, Optional<Employee>>> maximumSalaryByDepartment = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee::getDepartment))));
    };

    // Get Employees By Department whose salary is maximum, without Optional
    private static final Supplier<Map<String, Employee>> maximumSalaryByDepartmentWithoutOptional = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getDepartment)),
                                Optional::get
                        )));
    };

    // Get Employees By Department whose salary is minimum
    private static final Supplier<Map<String, Optional<Employee>>> minimumSalaryByDepartment = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.minBy(Comparator.comparing(Employee::getDepartment))));
    };

    // Get Employees By Department whose salary is minimum, without Optional
    private static final Supplier<Map<String, Employee>> minimumSalaryByDepartmentWithoutOptional = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Employee::getDepartment)),
                                Optional::get
                        )));
    };

    public static void main(String[] args) {
        System.out.println(groupByDepartment.get());
        System.out.println(groupByCustom.get());
        System.out.println(twoLevelGrouping.get());
        System.out.println(salaryBasedOnDepartment.get());
        System.out.println(thirdArgument.get());

        // maximumSalaryByDepartment
        Map<String, Optional<Employee>> stringOptionalMap = maximumSalaryByDepartment.get();
        System.out.println(stringOptionalMap);
        System.out.println(stringOptionalMap.get("Account").get());

        System.out.println(maximumSalaryByDepartmentWithoutOptional.get());

        Map<String, Optional<Employee>> stringOptionalMap2 = minimumSalaryByDepartment.get();
        System.out.println(stringOptionalMap2);
        System.out.println(stringOptionalMap2.get("Account").get());
        System.out.println(minimumSalaryByDepartmentWithoutOptional.get());

    }

}
