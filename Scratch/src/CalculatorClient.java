/*
 * Driver code
 */

class CalculatorClient {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum = calc.add(5, 2);
        System.out.println(sum);

        //method inline examples
        System.out.println("The difference is " + calc.sub(3, 5));

        System.out.println("The result is " + calc.isEven(10));

        System.out.println();

        int winner = calc.randomInt(5, 80);
        System.out.println("The winner is: " + winner);
    }
}
