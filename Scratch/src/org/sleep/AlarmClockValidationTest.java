package org.sleep;/*
 *  Test class focus on validation logic of snoozeInterval in the setter
 *  Boundary Value Testing (BVT): for a range of values [1, 20] we need to test:
 *  0, 1 and 20, 21
 */

import org.sleep.AlarmClock;

class AlarmClockValidationTest {

        public static void main(String[] args) {
                AlarmClock clock = new AlarmClock();

                //check boundaries for valid values
                clock.setSnoozeInterval(1); //valid - no error message and the 1 should stick
                System.out.println(clock.getSnoozeInterval());

                clock.setSnoozeInterval(20); //valid - no error message and the 1 should stick
                System.out.println(clock.getSnoozeInterval());

                clock.setSnoozeInterval(0); //error message and 0 should not be applied
                System.out.println(clock.getSnoozeInterval()); //should still be 20

                clock.setSnoozeInterval(21); //error
                System.out.println(clock.getSnoozeInterval()); //value still 20





        }
}
