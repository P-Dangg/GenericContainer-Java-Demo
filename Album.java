//This class represent BTS album

public class Album {
    private String title;
    private int year;
    private int numberOfSongs;

    //constructor
    public Album(String title, int year, int numberOfSongs) {
        this.title = title;
        this.year = year;
        this.numberOfSongs = numberOfSongs;
    }

    //getters and setters
    public String getTitle() { return title; }
    public int getYear() { return year; }
    public int getNumberOfSongs() { return numberOfSongs; }

    public void setTitle(String title) { this.title = title; }
    public void setYear(int year) { this.year = year; }
    public void setNumberOfSongs(int numberOfSongs) { this.numberOfSongs = numberOfSongs; }

    // toString
    public String toString() {
        return "Album: " + title + " (" + year + ") - " + numberOfSongs + " songs";
    }
}
