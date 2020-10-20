public class Movie {
    String title;
    String studio;
    String rating;

    Movie()
    {
        title = "Casino Royale";
        studio = "Eon Productions";
        rating = "R";
    }

    Movie(String film_name, String film_studio, String film_rating)
    {
        title = film_name;
        studio = film_studio;
        rating = film_rating;
    }

}
