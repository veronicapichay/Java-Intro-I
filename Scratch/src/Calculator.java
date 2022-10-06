/*
 * Class which contains several functions (methods) to do some basic calculations.
 * business class
 */

class Calculator {

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
