/*
 * An immutable class
 * More correct = tje class definition is written in such a way that
 * instances of it. i.e. Person objects, once created, cannot have their properties change value
 * Simply put, getters but no setter
 *
 *
 */

import java.time.LocalDate;
import java.time.Period;

class Person {

    private final String name;
    private final LocalDate birthdate;

    //constructor
    public Person (String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    /*
     * Returns person's age in whole year
     * HINT: you can calculate this from two dates: birthdate and today's date
     * You want the period of time between these two dates, whole years
     *
     */

    public int getAge() {
        //derived property - calculated from 2 dates
        return Period.between(getBirthdate(), LocalDate.now()).getYears();
    }




    public String getName () {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return String.format("Person: name = %s, birthDate = %s", getName(), getBirthdate());
    }
}

