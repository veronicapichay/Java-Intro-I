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
        clock1.snoozeInterval = 7;
        clock1.snooze();

        /*
        * create another AlarmClock object and set its properties, also
        * make each clock snooze
        */
        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;
        clock2.snooze();

        //create a third instance, but this time don't set its snoozeInterval
        AlarmClock clock3 = new AlarmClock();

        //make clock 3 snooze
        clock3.snooze();


    }
}
