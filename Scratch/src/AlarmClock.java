/*
 * Class definition to model the workings of an alarm clock.
 * This class does NOT have a main () method (most classes don't).
 * This is often called a "business" class or "system" class.
 */

class AlarmClock {

    //properties or characteristics - called "fields" or "instance variables"
    private int snoozeInterval = 5; //default value when client doesn't specify one (instead of 0)

    //functions or operations - called "methods" in Java
    //"business/action method"
    void snooze() {
        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes");
    }

    //accessor methods (getter/setter)
    //provide "controlled access" to the object's internal data
    //reading
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    //TODO: implement business rule: incoming value must be [1, 20] (inclusive)
    //writing
    public void setSnoozeInterval(int snoozeInterval) {
        this.snoozeInterval = snoozeInterval;                        //this -> reference to self

        //if (snoozeInterval > 5) && (snoozeInterval <= 20)
    }

    //overrides superclass
    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }






}
