class MovieClient {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Avatar", 2009, 750_000_000.0, Rating.R, Genre.ANIMATION);
        System.out.println(movie1);

        Movie movie2 = new Movie("American Beauty");
        System.out.println(movie2);




    }
}
