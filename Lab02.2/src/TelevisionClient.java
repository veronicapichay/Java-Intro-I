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
//        tele1.brand = "Samsung";
//        tele1.volume = 22;


        tele1.setBrand("Vizio");
        tele1.setVolume(60);
        tele1.turnOn();

        /*
         * create an instance of Television (object) and set its properties
         * make each clock snooze
         */

        Television tele2 = new Television();
//        tele2.brand = "Sony";
//        tele2.volume = 50;

        tele2.setBrand("RG");
        tele2.setVolume(70);
        tele2.turnOn();

        //create a third instance, but this time don't set its properties
        Television tele3 = new Television();

        //make tele 3 turn on/off
        tele3.turnOn();
        tele2.turnOn();


        tele1.turnOff();
        tele2.turnOff();
        tele3.turnOff();

        System.out.println();

        //display toString() method
        System.out.println(tele1.toString());
        System.out.println(tele2.toString());
        System.out.println(tele3);
    }
}
