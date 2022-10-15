package io.click;

public class Camera {

    public static final int MIN_SHOTS = 1;
    public static final int MAX_SHOTS = 36;

    public static final String[] BRANDS = { "Fuji", "Leica", "Nikon", "Canon" };
    private String brand = "Rollei";
    private int lens = 300;
    private double price;
    private int capacity;
    private ApertureTypes aperture = ApertureTypes.F4;
    private WeatherType weather = WeatherType.SUNNY;
    private boolean isEmpty;
    private int oldCapacity;

    public Camera() {
    }

    public Camera (String brand, int lens) {
        this();
        setBrand(brand);
        setLens(lens);
    }

    public Camera (String brand, int lens, double price) {
        this(brand, lens);
        setPrice(price);
    }

    public Camera (String brand,int lens, int price, int capacity, WeatherType weather, ApertureTypes aperture) {
        this(brand, lens, price);
        setCapacity(capacity);
        setWeather(weather);
        setAperture(aperture);
    }

    public void takePicture() {
        if(isValid(aperture) && !isEmpty()) {
            System.out.println("Your " + getBrand() + " camera " + " with " + getLens() + "mm lens is ready to use");
            System.out.println("CLICK!");
        }
        else {
            System.out.println("Please load a fresh film!");
        }
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
        System.out.println("Reload!");
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

    public void setAperture(ApertureTypes aperture) {
        if (isValid(aperture)) {
        this.aperture = aperture;
    }
        else {
            System.out.println("WARNING! Aperture " + aperture + " is not suitable for this weather." + " Please follow Sunny 16 Rule!");
        }
    }

    public String getAperture() {
        return String.valueOf(aperture);
    }

    private static boolean isValid(ApertureTypes aperture) {
        for (ApertureTypes a: ApertureTypes.values() ) {
            if (aperture.equals(aperture)) {
                return true;
            }
        }
        return false;
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

    public WeatherType getWeather() {
        return weather;
    }

    public void setWeather(WeatherType weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Brand = " + getBrand() + ", Lens: " + getLens() + " Price:  = " + getPrice();
    }
}
