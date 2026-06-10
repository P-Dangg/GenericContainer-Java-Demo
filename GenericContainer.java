//GenericContainer class can store and manage any type of data
//Provides methods to add, remove, retrieve, get size, sort, and print items


import java.util.ArrayList;
import java.util.Comparator;

public class GenericContainer<T> {
    private ArrayList<T> items;

    //constructor
    public GenericContainer(){
        items = new ArrayList<>();
    }
    //add
    public void add(T item) {
        items.add(item);
        System.out.println("  Added: " + item);
    }
    //remove
    public void remove(int item) {
        items.remove(item);
        System.out.println("  Removed: " + item);
    }
    //retrieve
    public T get(int index) {
        return items.get(index);
    }
    //size
    public int size() {
        return items.size();
    }
    //sort
    public void sort(Comparator<T> comparator) {
        items.sort(comparator);
    }
    //print
    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
