/*
 *  Test class focus on validation logic of volume in the setter
 *  Boundary Value Testing (BVT): for a range of values [1, 100] we need to test:
 *  0, 1 and 100, 101
 */

class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv1 = new Television();

        //check boundaries for valid values in volume
        tv1.setVolume(0); //valid - no error message and the 1 should stick
        System.out.println(tv1.getVolume());

        tv1.setVolume(100); //valid - no error message and the 1 should stick
        System.out.println(tv1.getVolume());

        tv1.setVolume(-1); //valid - no error message and the 1 should stick
        System.out.println(tv1.getVolume());

        tv1.setVolume(101); //valid - no error message and the 1 should stick
        System.out.println(tv1.getVolume());

        Television tv2 = new Television();

        //check boundaries for valid values in volume
        tv2.setBrand("Samsung"); //valid - no error message and the 1 should stick
        System.out.println(tv2.getBrand());

        tv2.setBrand("Sony"); //valid - no error message and the 1 should stick
        System.out.println(tv2.getBrand());

        tv2.setBrand("LG"); //valid - no error message and the 1 should stick
        System.out.println(tv2.getBrand());

        tv2.setBrand("Toshiba"); //valid - no error message and the 1 should stick
        System.out.println(tv2.getBrand());

        tv2.setBrand("Vizio"); //valid - no error message and the 1 should stick
        System.out.println(tv2.getBrand());
    }
}
