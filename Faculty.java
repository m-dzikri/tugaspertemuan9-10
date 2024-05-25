/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.no2polymorphism;

/**
 *
 * @author HP
 */
public class Faculty extends Employee{
    protected int officeHours;
    protected String rank;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, int officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Faculty\nName: %s\nAddress: %s\nPhone: %s\nEmail: %s\nOffice: %s\nSalary: %.2f\nDate Hired: %s\nOffice Hours: %d\nRank: %s", name, address, phoneNumber, emailAddress, office, salary, dateHired, officeHours, rank);
    }
}
