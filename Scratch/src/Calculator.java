/*
 * Class which contains several functions (methods) to do some basic calculations.
 * business class
 */

class Calculator {

    /**
     *
     * Returns a random integer between min and max (inclusive) eg 5 to 80
     * Returns a random integer between 1 and 21 (inclusive)
     *See a class called Math in document - Math.methodName();
     *
     * Methods are all static
     *
     */
        int randomInt(int min, int max) {
        //declare a local variable
        int result = 0;

        double rand = Math.random();
        double scaled = rand * (max - min + 1);
        result = (int) (scaled + min);
        return result;
        }

        //Overloading
        int randomInt() {

        return randomInt(1, 21); //delegates o the min-max version, passing 1 and 21 for min and max
        }

        int add(int a, int b) {
        return a + b;
        }

         int sub(int a, int b) {
        return a-b;
        }

        boolean isEven(int value) {
        return value % 2 == 0;
    }
}
