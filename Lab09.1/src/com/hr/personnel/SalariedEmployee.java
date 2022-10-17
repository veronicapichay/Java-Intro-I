package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    //inherited ctor
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation ");
    }

    public void payTaxes() {
        System.out.println(getName() + " paid taxes of " + (getSalary() * SALARIED_TAX_RATE));
    }


    //accessor
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + getSalary();
        //return "Employee: " + getName() + " Hire date: " + getHireDate() + " Salary rate:  " + getSalary();
    }
}
