class Movie {
    String title;
    String genre;
    int rating;

    void playIt() {
        System.out.println("Playing the Movie");
    }
}

public class MovieTestDrive {
    public static void main (String[] args) {
        Movie one = new Movie();
        one.title = "Harry Potter 1";
        one.genre = "Fantasy";
        one.rating = 5;

        Movie two = new Movie();
        two.title = "Harry Potter 2";
        two.genre = "Fantasy";
        two.rating = 4;
        two.playIt();
    }
}
