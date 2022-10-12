//Genre is immutable

enum Genre {

    ACTION("Action"),
    ROMANCE("Romance"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    DOCUMENTARY("Documentary"),
    SCO_FI("Sci-fi"),
    DRAMA("Drama"),
    ANIMATION("Animation");

    //regular class definition stuff (fields, ctors, methods)

    private String display;

    Genre(String display) {
        this.display = display;
        //System.out.println("Genre ctor called");
    }

    public String getDisplay() {
        return display;
    }

    //returns friendly typed genre
    @Override
    public String toString() {
        return getDisplay();
    }
}
