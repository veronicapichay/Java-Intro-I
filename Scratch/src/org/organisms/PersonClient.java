package org.organisms;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {

        Person p1 = new Person("Veronica", LocalDate.of(1988, 5, 12)); //if there is no setter, you need to hardcode
        System.out.println(p1);

        // print this message <name> is <years> old
        System.out.println(p1.getName() + " is " + p1.getAge() + " years old ");
        System.out.printf("%s is %s years old ", p1.getName(), p1.getBirthdate());
    }
}
