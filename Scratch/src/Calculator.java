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

        return result;
        }

        int randomInt() {
            //declare a local variable
        int result = 0;

        double rand = Math.random();  //0.00000 to 0.99999
        double scaled = rand * 22;   //1.00000 to 21.99999
        result = (int) scaled;       //1 to 21

        return result;
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
