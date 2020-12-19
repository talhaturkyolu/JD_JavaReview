package com.cybertek.lambda.sorting;

import com.cybertek.oop.encapsulation.Role;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Mike","Smith","Virginia",
                new Role(1,"Developer"));
        Employee e2 = new Employee(11,"Ozzy","Smith","Illinois",
                new Role(1,"SDET"));
        Employee e3 = new Employee(67,"Amy","Smith","DC",
                new Role(1,"DBA"));
        Employee e4 = new Employee(33,"Adam","Smith","Tennessee",
                new Role(1,"Project Manager"));
        Employee e5 = new Employee(8,"Tammy","Smith","Georgia",
                new Role(1,"SM"));

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println(employeeList);

        // Sort based on employee id
        employeeList.sort((emp1,emp2) -> emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));
        System.out.println(employeeList);

        employeeList.sort((emp1,emp2) -> (emp1.getRole().getId().compareTo(emp1.getRole().getId())));
        System.out.println(employeeList);
    }
}
