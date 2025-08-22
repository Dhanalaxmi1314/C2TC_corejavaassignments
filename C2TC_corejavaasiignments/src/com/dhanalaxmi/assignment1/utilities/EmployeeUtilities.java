package com.dhanalaxmi.assignment1.utilities;


import com.dhanalaxmi.assignment1.employees.Employee;

/**
 * Utility class for Employee operations.
 */
public class EmployeeUtilities {

    // Public method to display employee details
    public static void printEmployeeDetails(Employee e) {
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }

    // Protected method (only accessible within package or subclasses)
    protected static void increaseSalary(Employee e, double amount) {
        e.setSalary(e.getSalary() + amount);
    }
}


