package com.dhanalaxmi.assignment1.employees;

/**
 * Developer class extending Employee.
 */
public class Developer extends Employee {
    // additional attribute
    private String programmingLanguage;

    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);  // call parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}

