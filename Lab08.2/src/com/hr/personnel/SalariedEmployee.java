package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //inherited ctor
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
    }

    //accessor
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + " Hire date: " + getHireDate() + " Salary rate:  " + getSalary();
    }
}
