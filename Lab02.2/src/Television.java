/*
 * Business or system class to model the workings of a television set
 *  This class won't have a main() method.
 */

class Television {

    //shared variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //properties or attributes - called "instance variables" or "fields"
    private String brand = "Toshiba";
    private int volume = 50;

    //empty ctor
    public Television () {
        instanceCount++;
    }

    public Television (String brand) {
        this();
        setBrand(brand);
    }

    public Television (String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    //functions
   public void turnOn() {
       boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    void turnOff() {
        System.out.println("Shutting down...goodbye!");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.equals("Samsung") || brand.equals("Sony") || brand.equals("LG") || brand.equals("Toshiba"))
        this.brand = brand;
        else {
            System.out.println("Invalid brand: " + brand + ". " +
                    "You only have 4 choices: Samsung/Sony/LG/Toshiba");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.println("Invalid volume: " + volume + ". " +
                    "Select volume from "  + MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }

    public String toString() {
        getInstanceCount();
        return "Television: Brand = " + getBrand() + ", Volume = " + getVolume();
    }
}
