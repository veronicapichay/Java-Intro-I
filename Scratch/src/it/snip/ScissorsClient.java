package it.snip;

class ScissorsClient {

    public static void main(String[] args) {

        Scissors s1 = new Scissors();
        s1.setColor("red");
        s1.setBladeLength(5.5);
        s1.setSharpness(3);
        s1.setLefty(true);
        System.out.println(s1); //toString() automatically called

        Scissors s2 = new Scissors("orange", 7.5, 10); //calling the 3 arg ctor
        System.out.println(s2); //toString() automatically called

        s2.cut();
    }
}
