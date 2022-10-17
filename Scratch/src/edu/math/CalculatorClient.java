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

        System.out.println();

        System.out.println("***The average is: " + Calculator.average(3,4,8,8)); //can pass 1 or multiple args

        int[] ages = {7, 2, 6, 9, 3, 3, 6, 5, 8};
        System.out.println("The average age at the party was: " + Calculator.average(0, ages));

        //System.out.println("The average of no inputs is: " + Calculator.average());
    }
}
