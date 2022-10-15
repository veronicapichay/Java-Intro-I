package io.click;/*
 *
 *
 */

import java.util.EnumMap;

public class Camera {

    public static final int MIN_SHOTS = 1;
    public static final int MAX_SHOTS = 36;

    //attributes
    private String brand = "K100";
    private int lens;
    private double price;
    private int capacity;
    private String aperture;
    private final WeatherType weather = WeatherType.SUNNY;
    private boolean isEmpty;
    private int oldCapacity;

    //constructor

    public Camera() {

    }


    public Camera (String brand) {
        setBrand(brand);
    }

    public Camera (String brand, int capacity) {
        this(brand);
        setCapacity(capacity);

    }

    public Camera (String brand, int lens, double price) {
        this(brand, lens);
        setPrice(price);
    }

    public void takePicture() {


    }

    public boolean isEmpty() {
        return isEmpty;

    }

    public void empty() {
        if (!isEmpty()) {
            oldCapacity = getCapacity();
            capacity = 0;
            isEmpty = true;

        }
        else {
            setCapacity(oldCapacity);
            isEmpty = false;
        }

        System.out.println();
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLens() {
        return lens;
    }

    public void setLens(int lens) {
        this.lens = lens;
    }

    public String getAperture() {
        return aperture;
    }

    public String setAperture(String aperture) {
        switch (weather) {
            case SNOWSAND:
                setAperture("f22");
                System.out.println("Click!");
                break;
            case SUNNY:
                setAperture("f16");
                System.out.println("Click!");
                break;
            case SLIGHTOVERCAST:
                setAperture("f11");
                System.out.println("Click!");
                break;
            case OVERCAST:
                setAperture("f8");
                System.out.println("Click!");
                break;
            case CLOUDY:
                setAperture("f5.6");
                System.out.println("Click!");
                break;
            case SUNSET:
                setAperture("f4");
                System.out.println("Click!");
                break;
            default:
                System.out.println("WARNING! Please follow Sunny 16 Rule!");
        }
        return aperture;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity >= MIN_SHOTS && capacity <= MAX_SHOTS) {
            this.capacity = capacity;
            this.isEmpty = false;
        }
        else {
            System.out.printf("Sorry! You ran out of film : %s. Capacity is between %s and %s. \n", capacity, MIN_SHOTS, MAX_SHOTS);
        }
    }

    @Override
    public String toString() {

        String capacityString = isEmpty() ? "<empty>" : String.valueOf(getCapacity());
        return "Your " + getBrand() + " camera " + " with " + getLens() + "mm lens has " + capacityString + " shots left";

    }
}
