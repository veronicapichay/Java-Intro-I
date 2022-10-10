/*
 * Business or system class to model the workings of a television set
 *  This class won't have a main() method.
 */

class Television {
    //properties or attributes - called "instance variables" or "fields"
    private String brand = "Toshiba";
    private int volume = 50;

    //empty ctor
    public Television () {

    }

    public Television (String brand) {
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
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }

    public String toString() {
        return "Television: Brand = " + getBrand() + ", Volume = " + getVolume();
    }
}
