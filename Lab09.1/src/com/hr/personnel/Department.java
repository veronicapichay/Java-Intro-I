/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department { //a dept object has many emp working in 1 dept - 1 to many relationship
    // fields
    private String name;
    private String location;
    private final Employee[] employees = new Employee[100]; //will change to collection next week
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
        super();
    }

    public Department(String name, String location) {
        super();
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    public void payEmployee() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }

    /*
     * Department "forced vacation" due to office closure
     * For emp that takes vacation, make them take vacation
     */

    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            //emp[i] is a reference of type Employee, can only call Employee methods

            //NOTE: We must to a "type check" before blindly downcasting
            if (employees[i] instanceof SalariedEmployee) { //this is an IS-A check, or match
                //downcast and method call combined - better if 1 method call
                ((SalariedEmployee) employees[i]).takeVacation();

                //downcast this Employee reference to more specific type SalariedEmployee
                //better if calling multiple methods
                //SalariedEmployee semp = (SalariedEmployee) employees[i];
                //semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

  @Override  public String toString() {

        return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
    }
}