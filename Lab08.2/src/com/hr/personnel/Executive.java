package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    //generate ctor
    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
        //give them membership at the club
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }


    //business methods
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying a nice round of golf at the club");
    }
}
