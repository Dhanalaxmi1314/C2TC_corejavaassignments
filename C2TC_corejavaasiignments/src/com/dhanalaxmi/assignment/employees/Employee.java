//package com.dhanalaxmi.assignment.employees;
//
//public class Employee {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//
//	}
//
//}
package com.dhanalaxmi.assignment.employees;

/**
 * Base Employee class demonstrating use of access modifiers.
 */
public class Employee {
    // private attributes
    private String name;
    private int employeeId;
    private double salary;

    // public constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // public getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


