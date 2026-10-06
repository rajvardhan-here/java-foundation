import java.util.*;

public class binarysearch {
//    public  static  int bsearch(int numbers[] , int key){
//        int start = 0 ,  end = numbers.length-1;
//        while( start <=  end ){
//            int mid = (start + end )/2;
//            if (numbers[mid] == key){
//                return mid;
//            }
//            if(numbers[mid] < key ){
//                start = mid +1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//
//        public static void main(String args[]){
//        int numbers[] = {2,3,4,5,6,9,12,32,121};
//        int key = 4;
//            System.out.println("the number found at index  is = " + bsearch(numbers,key));
//
//        }

//        public static void reverse(int arr[]){
//
//            int first = 0 ,  last = arr.length-1;
//
//            while(first < last){
//
//                int temp = arr[last];
//                arr[last] = arr[first];
//                arr[first] =  temp;
//
//                first++;
//                last--;
//            }
//
//        }
//
//        public static void main(String args[]){
//
//            int arr[] = {2,4,6,8,10,12,14};
//
//            reverse(arr);
//            for(int i = 0; i < arr.length ; i++){
//                System.out.print(arr[i] +" ");
//            }
//        }


    public static void pairs(int num[]){

        for (int i = 0; i < num.length; i++){
            int curr = num[i];
            for (int j = i +1 ; j < num.length ; j++ ){
                System.out.print("(" + curr +"," +num[j]  +")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int num[] = {2, 4, 6, 8, 10, 14};

        pairs(num);
    }
}