/*
 * Business or system class to model the workings of a television set
 *  This class won't have a main() method.
 */

class Television {
    //properties or attributes - called "instance variables" or "fields"
    String brand ="Toshiba";
    int volume = 50;

    //functions
    void turnOn() {
        System.out.println("Turning on your " + brand + " TV to volume " + volume);
    }

    void turnOff() {
        System.out.println("Shutting down...goodbye!");
    }
}
