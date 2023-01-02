package com.kder.streams;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeStreamExample {

    // Get All Employees Name
    // map -> <R> Stream<R> map(Function<? super T, ? extends R> var1);
    private static final Supplier<List<String>> getAllEmployeeByName = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    };

    // sorted -> By Default Ascending Order
    private static final Supplier<List<String>> getAllEmpNameByNameByAscendingOrd = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    };

    // sorted -> By Descending Order
    private static final Supplier<List<String>> getAllEmpNameByNameByDescOrd = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    };

    // Get All Employee by Name Sorting: sorted(Comparator.comparing(Employee::getName))
    private static final Supplier<List<Employee>> getAllEmployeeByNameAndAscendingOrd = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    };

    // Get All whose salary >= 55000
    // filter -> Stream<T> filter(Predicate<? super T> var1);
    private static final Supplier<List<Integer>> getEmpIDWithSalaryCond = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .filter(employee -> employee.getSalary() >= 55000)
                .map(Employee::getEmpId)
                .collect(Collectors.toList());
    };

    // Count Employee whose salary >= 55000
    // count
    private static final Supplier<Long> countNumberOfEmp = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .filter(employee -> employee.getSalary() >= 55000)
                .count();
    };

    // Get Emp Name whose salary greater than given
    private static final Function<Integer, List<String>> empNameBySalary = (salary) -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .filter(employee -> employee.getSalary() >= salary)
                .map(Employee::getName)
                .collect(Collectors.toList());
    };

    // Get Employee Name whose hobby is Cricket
    private final static Supplier<List<String>> empNameWithHobbyAsCricket = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .filter(employee -> employee.getHobbies().contains("Cricket"))
                .map(Employee::getName)
                .collect(Collectors.toList());
    };

    // Get All Hobbies of Employees
    // flatMap -> <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> var1);
    private final static Supplier<Set<String>> allHobbies = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .flatMap(employee -> employee.getHobbies().stream())
                .collect(Collectors.toSet());
    };

    public static void main(String[] args) {

        System.out.println("List of Employee Name: " + getAllEmployeeByName.get());

        System.out.println("List of Employee Name By Order: " + getAllEmpNameByNameByAscendingOrd.get());

        System.out.println("List of Employee Name By Desc Order: " + getAllEmpNameByNameByDescOrd.get());

        System.out.println("getAllEmployeeByNameAndAscendingOrd: ");
        getAllEmployeeByNameAndAscendingOrd.get().forEach(System.out::println);

        System.out.println("List Employee IDs who's Salary >= 55000: " + getEmpIDWithSalaryCond.get());

        System.out.println("Count Employee whose salary >= 55000: " + countNumberOfEmp.get());

        System.out.println("Get Emp Name whose salary greater than given: " + empNameBySalary.apply(55000));

        System.out.println("Get Employee Name whose hobby is Cricket: " + empNameWithHobbyAsCricket.get());

        System.out.println("Get All Hobbies of Employees: " + allHobbies.get());

    }

}