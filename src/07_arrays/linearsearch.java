import java.util.*;

public class linearsearch {

    /*
    public static void main(String[] args) {                 // [] lagaya

        int marks[] = {2, 10, 6, 8, 10, 12, 10, 16};
        int key = 10;

        int index = linearsearch(marks, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("index of key is " + index);
        }
    }


    public static int linearsearch(int marks[], int key) {

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {                    //  key use kiya
                return i;
            }
        }
        return -1;
    }

        */

//     -------------------------------------------------------------------------------------------------------------

     // largest in array
//    public static void main(String[] args) {
//        int[] numbers = { 112, 4, 2, 12, 31, 21, 4123, 31, 1 };
//        System.out.println("Largest: " + largestNumber(numbers));
//        System.out.println("Smallest: " + smallestNumber(numbers));
//    }
//
//    public static int largestNumber(int[] numbers) {
//        int largest = Integer.MIN_VALUE;
//        for (int num : numbers) {
//            if (num > largest) largest = num;
//        }
//        return largest;
//    }
//
//    public static int smallestNumber(int[] numbers) {
//        int smallest = Integer.MAX_VALUE;
//        for (int num : numbers) {
//            if (num < smallest) smallest = num;
//        }
//        //Smallest: 1
//        return smallest;
//    }
//    //Largest: 4123


    // ----------------------------------------------------------------------------------------------------------------------------

       // LINEAR SEARCH IN JAVA DSA - JUNE 13
    public static void main (String args[]){
        int number[] = { 10 , 20 , 30 , 40 , 50 ,60};
        int key = 50;

        int index = findnum( number , key);
        if ( index == -1){
            System.out.println("not found " + index);
        }
        else{
            System.out.println(" number is found at index " + index);
        }
    }

    public static int findnum(int number[] ,int key ){

        for (int i = 0 ; i < number.length ; i++) {

            if (number[i] == key) {
                return i;
           }
        }
            return -1;
    }
}           //  number is found at index 4