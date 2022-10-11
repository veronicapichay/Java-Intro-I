class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "27";
        int age = Integer.parseInt(ageInput); //returns int 27 from "27"
        Integer ageInteger = Integer.valueOf(ageInput); //returns Interger(27) from "27"

        String populationInput = "7500000000";
        long population = Long.parseLong(populationInput); //returns long from string
        Long populationLong = Long.valueOf(populationInput); //returns Long object from string

        String debtInput = "31000000000000";
        double debt = Double.parseDouble(debtInput);    //returns double from string
        Double debtDouble = Double.valueOf(debtInput);  //returns Double from string

        String shoesInput = "true";
        boolean wearShoes = Boolean.parseBoolean(shoesInput);

        System.out.println(age);
        System.out.println(ageInteger);

        System.out.println(population);
        System.out.println(populationLong);

        System.out.println(debt);
        System.out.println(debtDouble);

        System.out.println(wearShoes);

    }
}
