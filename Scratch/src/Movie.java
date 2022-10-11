class Movie {

    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre = Genre.COMEDY;

    //constructors
    public Movie (String title) {
        setTitle(title);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
       this(title); //delegates to title only constructor
       setReleaseYear(releaseYear);
       setRevenue(revenue);
       setRating(rating);
       setGenre(genre);
    }

    //action methods - play(), pause(), rewind(), fastForward(), skipTo()

    //accessor
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String toString() {
        return "Movie: Title = " + getTitle() +
                ", Release Year = " + getReleaseYear() +
                ", Revenue = " + getRevenue() +
                ", Rating = " + getRating() +
                ", Genre = " + getGenre();
    }




}
