package temp;  // since you put it inside temp package

import com.dhanalaxmi.assignment1.employees.Developer;
import com.dhanalaxmi.assignment1.employees.Manager;
import com.dhanalaxmi.assignment1.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // create manager and developer objects
        Manager m1 = new Manager("Alice", 101, 80000, "IT");
        Developer d1 = new Developer("Bob", 102, 60000, "Java");

        // use utility methods
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(m1);
        System.out.println("Department: " + m1.getDepartment());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(d1);
        System.out.println("Programming Language: " + d1.getProgrammingLanguage());
    }
}

