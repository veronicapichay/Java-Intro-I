package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    //inherited ctor
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
    }

    //accessor
    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Employee: " + getName() + " Hire date: " + getHireDate() + " Hours: " + getHours() + " Pay: " + getRate();
    }
}
