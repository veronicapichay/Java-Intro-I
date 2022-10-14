package org.sleep;/*
 * Class definition to model the workings of an alarm clock.
 * This class does NOT have a main () method (most classes don't).
 * This is often called a "business" class or "system" class.
 */

class AlarmClock {

    //shared variables - independent of each object's bubble - does NOT change instance to instance
    //do not expose it via getters/setters
    public static final int MIN_INTERVAL = 1; //refactor rename if changing to final
    public static final int MAX_INTERVAL = 20;

    //properties or characteristics - called "fields" or "instance variables"
    private int snoozeInterval = 5; //default value when client doesn't specify one (instead of 0)
    private int repeat; //number of times it goes off (default is 0)

    //constructor
    public AlarmClock(){
        //no op
    }

    public AlarmClock (int snoozeInterval) {
        setSnoozeInterval(snoozeInterval); //delegate to setter for any validation/confirmation
    }

    public AlarmClock (int snoozeInterval, int repeat) {
        this(snoozeInterval); //delegate 1 arg ctor for snoozeinterval
        setRepeat(repeat); //handles repeat myself

    }

    //functions or operations - called "methods" in Java
    //"business/action method"
    public void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    //accessor methods (getter/setter)
    //provide "controlled access" to the object's internal data
    //reading
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //business rule: incoming value must be [1, 20] (inclusive)
    public void setSnoozeInterval(int snoozeInterval) {

        //to be in a valid state
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
            this.snoozeInterval = snoozeInterval; //this -> reference to self
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ". " +
                    "Pick numbers from "  + MIN_INTERVAL + " and " + MAX_INTERVAL);
            }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    //overrides superclass
    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval() + " repeat = " + getRepeat();
    }






}
