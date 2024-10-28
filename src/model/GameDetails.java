package model;

public class GameDetails {

    private String gameTitle;
    private String genre;
    private int ageRange;
    private String description;
    private double rating;

    public GameDetails(String gameTitle, String genre, int ageRange, String description, double rating) {
        this.gameTitle = gameTitle;
        this.genre = genre;
        this.ageRange = ageRange;
        this.description = description;
        this.rating = rating;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getGenre() {
        return genre;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }
}
