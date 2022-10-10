/*
 * Constructors
 */

class Scissors {
    //fields or instance variables
    private String color;
    private double bladeLength;
    private int sharpness = 5; //constrain: [1, 10]
    private boolean isLefty;

    //constructors - special methods that get called when the client says "new"
    //they delegate to each setter for any validation/conversion
    public Scissors(){
        //no op
    }
    public Scissors (String color, double bladeLength, int sharpness, boolean isLefty){
        setColor(color);
        setBladeLength(bladeLength);
        setSharpness(sharpness);
        setLefty(isLefty);
    }

    //business or action methods
    //cut(), poke(), sharpen(), trim(), stab()

    //accessor methods (get and set)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void setSharpness(int sharpness) {
        this.sharpness = sharpness;
    }

    public boolean isLefty() {
        return isLefty;
    }

    public void setLefty(boolean lefty) {
        isLefty = lefty;
    }

    @Override
    public String toString() {
        return "Scissors: " +
                "color = " + getColor() +
                ", bladeLength = " + getBladeLength() +
                ", sharpness = " + getSharpness() +
                ", isLefty = " + isLefty();
    }
}