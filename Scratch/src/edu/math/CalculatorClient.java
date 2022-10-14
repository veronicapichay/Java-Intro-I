package edu.math;/*
 * Driver code
 */

class CalculatorClient {
    public static void main(String[] args) {

        double sum = Calculator.add(5, 2);
        System.out.println(sum);

        //method inline examples
        System.out.println("The difference is " + Calculator.sub(3, 5));

        System.out.println("The result is " + Calculator.isEven(10));

        System.out.println();

        int winner = Calculator.randomInt(5, 80);
        System.out.println("The winner is: " + winner);
    }
}
