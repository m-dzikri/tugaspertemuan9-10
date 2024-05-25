/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.no2polymorphism;

/**
 *
 * @author HP
 */
public class No2polymorphism {

    public static void main(String[] args) {
        MyDate hireDate = new MyDate(2020, 5, 15);
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john@gmail.com");
        Student student = new Student("Jane Smith", "456 Elm St", "555-5678", "jane@gmail.com", Student.SENIOR);
        Employee employee = new Employee("Alice Johnson", "789 Oak St", "555-9876", "alice@gmail.com", "A101", 50000, hireDate);
        Faculty faculty = new Faculty("Bob Brown", "246 Pine St", "555-4321", "bob@gmail.com", "B202", 75000, hireDate, 40, "Professor");
        Staff staff = new Staff("Carol Williams", "135 Cedar St", "555-8765", "carol@gmail.com", "C303", 40000, hireDate, "Secretary");

        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff);
    }
}
