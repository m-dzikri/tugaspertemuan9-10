/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.no2polymorphism;

/**
 *
 * @author HP
 */
public class Employee extends Person{
    protected String office;
    protected double salary;
    protected MyDate dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return String.format("Employee\nName: %s\nAddress: %s\nPhone: %s\nEmail: %s\nOffice: %s\nSalary: %.2f\nDate Hired: %s", name, address, phoneNumber, emailAddress, office, salary, dateHired);
    }
}
