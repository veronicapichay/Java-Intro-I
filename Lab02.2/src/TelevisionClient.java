/*
 * Client-side "main-class" (a class with the main() method).
 * Driver code for few instances of Television ie, Television objects
 */
class TelevisionClient {
    public static void main(String[] args) {

        /*
         * create an instance of Television (object) and set its properties
         * make each clock snooze
         */

        Television tele1 = new Television();
        tele1.brand = "Samsung";
        tele1.volume = 22;
        tele1.turnOn();

        /*
         * create an instance of Television (object) and set its properties
         * make each clock snooze
         */

        Television tele2 = new Television();
        tele2.brand = "Sony";
        tele2.volume = 35;
        tele2.turnOn();

        //create a third instance, but this time don't set its properties
        Television tele3 = new Television();

        //make tele 3 turn on/off
        tele3.turnOn();

        tele1.turnOff();
        tele2.turnOff();
        tele3.turnOff();
    }
}
