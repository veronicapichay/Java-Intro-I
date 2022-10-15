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
    private int filmISO = 400;
    private int capacity;
    private String aperture;
    private WeatherType weather = WeatherType.SUNNY;
    private boolean isEmpty;
    private int oldCapacity;

    //constructor

    public Camera() {

    }


    public Camera (String brand) {
        setBrand(brand);
    }

    public Camera (String brand, int lens) {
        this(brand);
        setLens(lens);

    }

    public Camera (String brand, int lens, double price) {
        this(brand, lens);
        setPrice(price);
    }



    //business methods
    public void takePicture(WeatherType weather, String aperture) {


    }

    public boolean isEmpty() {
        return isEmpty;

    }

    public void rewind() {
        if (!isEmpty()) {
            oldCapacity = getCapacity();
            capacity = 0;
            isEmpty = true;
            System.out.println("You'");
        }
        else {
            setCapacity(oldCapacity);
            isEmpty = false;
        }

        System.out.println();
    }

    //accessor methods (getter/setter)
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

    public void setAperture(String aperture) {
        this.aperture = aperture;
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

    public int getFilmISO() {
        return filmISO;
    }

    public void setFilmISO(int filmISO) {
        this.filmISO = filmISO;
    }

    @Override
    public String toString() {
        return "Your " + getBrand() + " camera " + " with " + getLens() + "mm lens has " + getCapacity() + "shots left";

    }
}
