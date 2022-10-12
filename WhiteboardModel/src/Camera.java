/*
 *
 *
 */

class Camera {
    //attributes
    private String brand;
    private int lens;
    private double price;
    private double aperture;  //[1.4, 2, 2.8, 4, 5.6, 8, 11, 16]
    private int shutterSpeed;
    private int filmISO;
    private boolean withFlash;

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

    void takePicture() {

    }

    void focus () {

    }

    void adjustAperture () {

    }


    void rewind() {

    }


    void click () {

    }

    void reloadFilm () {

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

    public double getAperture() {
        return aperture;
    }

    public void setAperture(double aperture) {
        this.aperture = aperture;
    }

    public int getShutterSpeed() {
        return shutterSpeed;
    }

    public void setShutterSpeed(int shutterSpeed) {
        this.shutterSpeed = shutterSpeed;
    }

    public int getFilmISO() {
        return filmISO;
    }

    public void setFilmISO(int filmISO) {
        this.filmISO = filmISO;
    }

    public boolean isWithFlash() {
        return withFlash;
    }

    public void setWithFlash(boolean withFlash) {
        this.withFlash = withFlash;
    }

    @Override
    public String toString() {
        return "Camera " +
                "brand = " + getBrand() +
                ", lens = " + getLens() +
                ", aperture = " + getAperture() +
                ", shutterSpeed = " + getShutterSpeed() +
                ", filmISO = " + getFilmISO() +
                ", withFlash = " + isWithFlash();
    }
}
