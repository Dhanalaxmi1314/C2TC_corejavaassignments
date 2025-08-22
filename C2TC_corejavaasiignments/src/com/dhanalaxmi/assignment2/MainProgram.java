package com.dhanalaxmi.assignment2;


public class MainProgram {
    public static void main(String[] args) {
        // Create Student object -> calls default constructor
        Student s1 = new Student();

        // Create Commission object
        Commission emp = new Commission();
        emp.acceptDetails();        // get employee details
        emp.calculateCommission();  // calculate and display commission
    }
}

