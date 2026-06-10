//Part1Demo class demonstrates the generic findIndex method from IndexFinder class.
//It tests the method with three different types of arrays: Integer, String, and Double.

import java.util.Arrays;

public class Part1Demo {
    public static void  main (String[] args){
        System.out.println("PART 1: GENERIC METHOD DEMO");
        //test integer array
         Integer[] numbers = {10,20,30,40,50};
        System.out.println("Integer Array: " + Arrays.toString(numbers));
        System.out.println("Index of 20: " + IndexFinder.findIndex(numbers, 20));//should return 1
        System.out.println("Index of 100: " + IndexFinder.findIndex(numbers, 100));//should return -1

        //test string array
        String[] btsMembers = {"RM", "Jin", "Suga", "J-Hope", "Jimin", "V", "Jungkook"};
        System.out.println("String Array: " + Arrays.toString(btsMembers)); //should return 5
        System.out.println("Index of V: " + IndexFinder.findIndex(btsMembers, "V"));

        //test double array
        Double[] ratings = {4.5, 5.0, 5.5, 6.0, 6.5};
        System.out.println("Double Array: " + Arrays.toString(ratings));
        System.out.println("Index of 6.5: " + IndexFinder.findIndex(ratings, 6.5));//should return 4
    }
}
