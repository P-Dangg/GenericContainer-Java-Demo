//Generic method to find index of a value in an array
//Returns position if found, -1 if not found

public class IndexFinder {
    public static <T> int findIndex(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(value)) {
                return i;//return the index
            }
        }
        return -1;//return -1 if not found
    }
}
