import java.util.*;

public class binarysearch {
    public  static  int bsearch(int numbers[] , int key){
        int start = 0 ,  end = numbers.length-1;
        while( start <=  end ){
            int mid = (start + end )/2;
            if (numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key ){
                start = mid +1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

        public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,9,12,32,121};
        int key = 121;
            System.out.println("the number found at index  is - " + bsearch(numbers,key));

        }
}