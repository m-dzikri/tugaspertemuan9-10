/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.no2polymorphism;

/**
 *
 * @author HP
 */
public class Staff extends Employee{
    protected String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return String.format("Staff\nName: %s\nAddress: %s\nPhone: %s\nEmail: %s\nOffice: %s\nSalary: %.2f\nDate Hired: %s\nTitle: %s", name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
    }
}
