import java.util.*;

public class reversearray{
    public  static  void arrayrev(int numbers[]){

        int start= 0 , end = numbers.length-1;

        while (start < end ) {
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]){
        int numbers[] = {2,3,4,5,6,7,8,9,10};

        arrayrev(numbers);
        for (int i = 0 ; i < numbers.length ; i++){
            System.out.print(numbers[i]+ " ");                         // 10 9 8 7 6 5 4 3 2
        }
        System.out.println();

    }
}