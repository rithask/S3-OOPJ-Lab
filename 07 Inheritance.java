/*
 * Write a Java program which creates a class named 'Employee' having the following members:
 * Name, Age, Phone number, Address, Salary. It also has a method named 'printSalary( )' which
 * prints the salary of the Employee. Two classes 'Officer' and 'Manager' inherits the 'Employee' class.
 * The 'Officer' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 * Now, assign name, age, phone number, address and salary to an officer and a manager by making
 * an object of both of these classes and print the same

 * ALGORITHM
 * 
 * 1. Start
 * 2. Create objects of the Officer and Manager class
 * 3. Read the details of the officer
 * 4. Read the details of the manager
 * 5. Print the details of the officer
 * 6. Print the details of the manager
 * 7. Stop
 * 
 * Algorithm for the Employee class
 * 1. Start
 * 2. Declare variables
 * 3. Declare a method to print the salary
 * 4. Stop
 * 
 * Algorithm for the Officer class
 * 1. Start
 * 2. Inherit the Employee class
 * 3. Declare a variable specialization
 * 4. Stop
 * 
 * Algorithm for the Manager class
 * 1. Start
 * 2. Inherit the Employee class
 * 3. Declare a variable department
 * 4. Stop
 */

import java.util.Scanner;

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Officer officer = new Officer();
        Manager manager = new Manager();

        System.out.println("Enter the details of the officer: ");
        System.out.print("Name: ");
        officer.name = sc.nextLine();
        System.out.print("Age: ");
        officer.age = sc.nextInt();
        System.out.print("Phone: ");
        officer.phone = sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        officer.address = sc.nextLine();
        System.out.print("Salary: ");
        officer.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Specialization: ");
        officer.specialization = sc.nextLine();
        System.out.println();

        System.out.println("Enter the details of the manager: ");
        System.out.print("Name: ");
        manager.name = sc.nextLine();
        System.out.print("Age: ");
        manager.age = sc.nextInt();
        System.out.print("Phone: ");
        manager.phone = sc.nextLong();
        sc.nextLine();
        System.out.print("Address: ");
        manager.address = sc.nextLine();
        System.out.print("Salary: ");
        manager.salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        manager.department = sc.nextLine();
        System.out.println();
        
        System.out.println("Details of the officer: ");
        System.out.println("Name: " + officer.name);
        System.out.println("Age: " + officer.age);
        System.out.println("Phone: " + officer.phone);
        System.out.println("Address: " + officer.address);
        System.out.println("Specialization: " + officer.specialization);
        officer.printSalary();
        System.out.println();

        System.out.println("Details of the manager: ");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phone);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}

class Employee {
    String name;
    int age;
    long phone;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}