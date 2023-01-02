package com.kder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTest {
    
    
    public static void main(String[] args) {
        
        //filterOnAge();
        
        //countEmpWithSameAge();
        
        listByName();
    }
    
    /**
     * 
     * Given a list of employees, you need to filter all the employee whose 
     * age is greater than equals 15 and print the employee names.
     * 
     */
    private static void filterOnAge() {
        
        List<Employee> emps = getEmpObject();
        
        List<Employee> result = emps.stream().filter(emp -> emp.getAge() >= 15).collect(Collectors.toList());
        
        print(result);
        
    }
    
    /**
     * Given the list of employees, count number of employees with age 17?
     * 
     */
    private static void countEmpWithSameAge() {
        
        List<Employee> emps = getEmpObject();
        
        long count = emps.stream().filter(emp -> emp.getAge() == 17).count();
        
        System.out.println("Number of EMployee with Age 17: " + count);
        
    }
    
    /**
     * 
     * Given the list of employees, find the employee with name “Mary”
     * 
     */
    private static void listByName() {
        
        List<Employee> emps = getEmpObject();
        
        Optional<Employee> emp = emps.stream().filter(e -> e.getName().equals("Akriti")).findAny();
        
        if(emp.isPresent()) {
            System.out.println(emp.get());
        }
        
    }
    
    
    private static List<Employee> getEmpObject() {
        return Arrays.asList(
                    new Employee("Saurabh", 21),
                    new Employee("Anu", 19),
                    new Employee("Komal", 18),
                    new Employee("Karan", 17),
                    new Employee("Tanu", 17),
                    new Employee("Gaurabh", 15),
                    new Employee("Prince", 14),
                    new Employee("Subham", 13),
                    new Employee("Priyanshu", 12),
                    new Employee("Himanshu", 11),
                    new Employee("Pihu", 10),
                    new Employee("Suhani", 9),
                    new Employee("Shaurya", 8),
                    new Employee("Shudhanshu", 7),
                    new Employee("Akriti", 3)
                );
    }
    
    private static void print( List<Employee> emps) {
        emps.forEach(emp -> System.out.println("Name: " + emp.getName() + ", Age: " + emp.getAge()));
    }

}


class Employee {
    private String name;
    private int age;
 
    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
        public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
