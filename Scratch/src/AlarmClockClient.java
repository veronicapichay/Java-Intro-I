/*
 * Client-side "main-class" (a class with the main() method).
 * Create a few AlarmClock objects and give them a basic test-drive
 */

class AlarmClockClient {

    //entry point for every standalone Java application
    public static void main(String[] args) {

        /*
        * create an instance of AlarmClock (object) and set its properties
        * make each clock snooze
        */
        AlarmClock clock1 = new AlarmClock();
        //clock1.snoozeInterval = -7; //bad practice; giving client direct access
        //call the setter instead
        clock1.setSnoozeInterval(7);
        clock1.snooze();

        /*
        * create another AlarmClock object and set its properties, also
        * make each clock snooze
        */
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);
        clock2.snooze();

        //create a third instance, but this time don't set its snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        //make clock 3 snooze
        clock3.snooze();

        System.out.println();

        //display toString() method
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3.toString());

    }
}
