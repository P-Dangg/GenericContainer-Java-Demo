//This class represent BTS song

public class Song {
    private String title;
    private int length;
    private int year;

    //constructor
    public Song(String title, int length, int year) {
        this.title = title;
        this.length = length;
        this.year = year;
    }
    //getters and setters
    public String getTitle() { return title; }
    public int getLength() { return length; }
    public int getYear() { return year; }

    public void setTitle(String title) { this.title = title; }
    public void setLength(int length) { this.length = length; }
    public void setYear(int year) { this.year = year; }

    //toString
    public String toString() {
        return "Song: " + title + " (" + length + " sec) - " + year;
    }

}