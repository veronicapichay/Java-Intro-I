/*
 * Class definition to model the workings of an alarm clock.
 * This class does NOT have a main () method (most classes don't).
 * This is often called a "business" class or "system" class.
 */

class AlarmClock {

    //properties or characteristics - called "fields" or "instance variables"
    int snoozeInterval = 5; //default value when client doesn't specify one (instead of 0)

    //functions or operations - called "methods" in Java
    void snooze() {
        System.out.println("Snoozing for " + snoozeInterval + " minutes");





    }
}
