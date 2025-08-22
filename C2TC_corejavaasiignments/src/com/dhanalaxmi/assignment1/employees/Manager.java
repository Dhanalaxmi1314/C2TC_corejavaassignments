package com.dhanalaxmi.assignment1.employees;

/**
 * Manager class extending Employee.
 */
public class Manager extends Employee {
    // additional attribute
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);  // call parent constructor
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
