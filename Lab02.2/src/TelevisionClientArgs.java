/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {

        Television clientTv = new Television();
        switch (args.length) {
            case 3:
                // 3 arg ctor - third one being the display
                String display = args[2].toUpperCase(); //uppercase for them
                clientTv.setDisplay(DisplayType.valueOf(display)); //convert to value of display type
            case 2:
                // 2 arg ctor - second one is being the volume
                String volume = args[1];
                clientTv.setVolume(Integer.parseInt(volume));
            case 1:
                // 1 arg ctor - brand
                String brand = args[0];
                clientTv.setBrand(brand);
        }

        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) { //# of arg in a ctor
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display> \n" + //call specfic ctor
                            "Example: java TelevisionClientArgs Samsung 32 PLASMA \n" +
                            "Notes: \n" +
                            "1. Supported brands are " + Arrays.toString(Television.VALID_BRANDS) + ".\n" +
                            "2. Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + "(inclusive). \n" +
                            "3. Supported displays are " +  Arrays.toString(DisplayType.values()) + ".";
            System.out.println(usage);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //System.out.println(Arrays.toString(args));

        //Step 1: Convert each argument as necessary to the proper types
        // args[0] for brand needs to be String, and already is
        String brand = args[0];

        // args[1] for volume needs to be int, you'll need to convert [Integer.parseInt()]
        int volume = Integer.parseInt(args[1]);

        // args[2] for display needs to be DisplayType, you'll need to convert [SisplayType.valueof()]
        DisplayType displayType = DisplayType.valueOf(args[2].toUpperCase());

        //Step 2: Create a new Television object with your converted values
        //You can use the 3 arg brand-volume-display ctor
        Television tv = new Television(brand, volume, displayType);
        //Step 3: Print the Television object and congratulations them on their purchase

        System.out.printf("Thank you for buying %s from Amazon Prime", tv);
    }
}