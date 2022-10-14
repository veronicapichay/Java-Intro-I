package com.entertainment;
/*
 * Business or system class to model the workings of a television set
 *  This class won't have a main() method.
 */

public class Television {

    //shared variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0;
    public static final String[] VALID_BRANDS = { "Samsung", "LG", "Sony", "Toshiba" }; //should be an enum, no validation required

    public static int getInstanceCount() {
        return instanceCount;
    }

    //properties or attributes - called "instance variables" or "fields"
    private String brand = "Toshiba";
    private int volume = 50;
    private DisplayType display = DisplayType.LED; //would be null if given no value
    private boolean isMuted; //for muting behavior
    private int oldVolume;  // internal use only, not exposed, no setter.getter

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

    public Television (String brand, int volume, DisplayType display) {
        this(brand, volume); //delegate to brand and volume ctor from top
        setDisplay(display); //handles display myself
    }

    //functions - action methods
   public void turnOn() {
       boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye!");
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void mute() {
        if (!isMuted()) {    // not currently muted
            oldVolume = getVolume();
            volume = 0;    //versus setVolume(0)
            isMuted = true;
        }
        else {    //currently muted
            setVolume(oldVolume);
           isMuted = false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (isValid(brand)) {
            this.brand = brand;
        }
        else {
            System.out.println("Invalid brand: " + brand + ". " + "You only have 4 choices: Samsung/Sony/LG/Toshiba");
        }
    }

    //Sony, Samsung, LG, Toshiba
    private static boolean isValid (String brand) {
        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                return true;
            }
        }
        return false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            this.isMuted = false;
        }
        else {
            System.out.printf("Invalid volume : %s. Select volume from %s and %s. \n", volume, MIN_VOLUME, MAX_VOLUME );
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        return true; //fake implementation
    }

    public String toString() {
        //getInstanceCount();
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: Brand = " + getBrand() + ", Volume = " + volumeString + " Display Type = " + getDisplay();
    }
}
