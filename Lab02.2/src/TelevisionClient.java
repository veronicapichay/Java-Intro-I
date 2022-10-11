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
        System.out.println(Television.getInstanceCount() + " instances");

        Television tele1 = new Television();
        tele1.setBrand("Samsung");
        tele1.setVolume(Television.MAX_VOLUME);
        tele1.setDisplay(DisplayType.PLASMA);
        tele1.turnOn();

        Television tele2 = new Television("Sony", 50, DisplayType.OLED);
        tele2.turnOn();

        Television tele3 = new Television("LG");
        tele3.turnOn();

        System.out.println();

        tele1.turnOff();
        tele2.turnOff();
        tele3.turnOff();

        System.out.println();

        //display toString() method
        System.out.println(tele1.toString());
        System.out.println(tele2.toString());
        System.out.println(tele3);

        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances");

    }
}
