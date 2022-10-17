package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    //inherited ctor
    public HourlyEmployee() {
        //ctor chaining
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }


    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    //accessor
    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString() {
        //return "Employee: " + getName() + " Hire date: " + getHireDate() + " Hours: " + getHours() + " Pay: " + getRate();
        return super.toString() +  ", rate + " + getRate() + ", hours " + getHours();
    }
}
