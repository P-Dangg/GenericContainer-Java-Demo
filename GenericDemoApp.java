//Name  : Phuong Dang
//Course: COP-3330C-23598
//Date  : 03/13/2026
//Program objective: Demonstrates the functionality of GenericContainer class with BTS Member,
//Song, and Album objects. Shows add, remove, retrieve, size, sort, and print operations.
//User Inputs: No user input.
//Outputs: Displays container contents before and after each operation,
//showing how data can be managed generically.

//GenericDemoApp demonstrates all functionality of GenericContainer
//using Member, Song, and Album objects


import java.util.Comparator;

public class GenericDemoApp {
    public static void main(String[] args) {
        System.out.println("PART 2: GENERIC CONTAINER DEMO APP");

        //Create containers for each type
        GenericContainer<Member> members = new GenericContainer<>();
        GenericContainer<Song> songs = new GenericContainer<>();
        GenericContainer<Album> albums = new GenericContainer<>();

        //test with BTS member with add, print, size, sort bt age
        System.out.println("\n--- BTS MEMBERS ---");
        //add members
        System.out.println("\n1. Adding members:");
        members.add(new Member("RM", 29, "Leader"));
        members.add(new Member("Jin", 31, "Vocalist"));
        members.add(new Member("Suga", 30, "Rapper"));
        members.add(new Member("J-Hope", 29, "Dancer"));
        members.add(new Member("Jimin", 28, "Dancer"));
        members.add(new Member("V", 28, "Vocalist"));
        members.add(new Member("Jungkook", 26, "Main Vocalist"));

        //print all members
        System.out.println("\n2. All members:");
        members.printAll();
        //size
        System.out.println("3. Total members: " + members.size());
        //sort member by age
        members.sort(Comparator.comparing(Member::getAge));
        System.out.println("After sorting by age:");
        members.printAll();

        //test with Songs with add , retrieve and remove
        System.out.println("\n--- SONGS ---");
        songs.add(new Song("Dynamite", 200, 2020));
        songs.add(new Song("Butter", 195, 2021));
        songs.add(new Song("Spring Day", 300, 2016));

        //print all song
        songs.printAll();

        //retrieve song
        Song s = songs.get(1);
        System.out.println("Song at index 1: " + s);

        //remove
        songs.remove(1);
        System.out.println("After removing index 1:");
        songs.printAll();

        //test with albums with add, size, sort, remove
        System.out.println("\n--- ALBUMS ---");

        //add
        albums.add(new Album("Wings", 2016, 15));
        albums.add(new Album("BE", 2020, 8));
        albums.add(new Album("Love Yourself", 2018, 25));

        //print all albums
        albums.printAll();

        //size
        System.out.println("Number of albums: " + albums.size());

        //sort
        albums.sort(Comparator.comparing(Album::getYear));
        System.out.println("After sorting by year:");
        albums.printAll();

        //remove
        albums.remove(0);
        System.out.println("After removing index 0:");
        albums.printAll();





    }
}
