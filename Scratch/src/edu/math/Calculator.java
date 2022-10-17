package edu.math;/*
 * Class which contains several functions (methods) to do some basic calculations.
 * business class
 * All-static class is one that has nothing except static methods
 * It has no "state"  i.e. no instance variables or fields
 */

class Calculator {
    /**
     *Return the average (mean) of the supplied integers
     * Note: Require that the client pass at least 1 value
     *
     */
    public static double average(int first, int...rest) { //3,4,8,8
        double result = 0.0;
        double sum = first;

        for (int value: rest) {
            sum += value; //sum = sum + value
        }

        result = sum / (rest.length + 1);
        //result = sum / values.length;
        return result;
    }

     /**
     * Returns a random integer between min and max (inclusive) eg 5 to 80
     * Returns a random integer between 1 and 21 (inclusive)
     * See a class called Math in document - Math.methodName();
     * Methods are all static
     */

        public static int randomInt(int min, int max) {
        //declare a local variable
        int result = 0;

        double rand = Math.random();
        double scaled = rand * (max - min + 1);
        result = (int) (scaled + min);
        return result;
        }

        //Overloading
        public static int randomInt() {

        return randomInt(1, 21); //delegates o the min-max version, passing 1 and 21 for min and max
        }

        public static double add(int a, int b) {
        return a + b;
        }

        public static double sub(int a, int b) {
        return a-b;
        }

        public static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
