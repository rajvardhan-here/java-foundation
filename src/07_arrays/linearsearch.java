import java.util.*;

public class linearsearch {
//    public static int linearsearch(int numbers[], int key){
//
//        for(int i = 0 ; i< numbers.length ; i++){
//            if(numbers[i] == key )
//            return i;
//        }
//        return -1;
//    }
//
//    public static void main(String args[]){
//        int numbers[] = {2,4,6,8,10,12,14,16};
//
//        System.out.println("enter the key you want to search");
//
//        while (true) {
//
//            Scanner sc = new Scanner(System.in);
//            int key = sc.nextInt();
//
//            int index = linearsearch(numbers, key);
//
//            if (index == -1) {
//                System.out.println("kkey not found");
//            } else {
//                System.out.println("key found at index = " + index);
//            }
//        }
//    }


    //  largest in array now

    public static int largest(int numbers[]) {

        int largest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
         if(largest > i) {
             return largest;
         }
        }
    }


    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};

        System.out.println("enter the key you want to search");

}