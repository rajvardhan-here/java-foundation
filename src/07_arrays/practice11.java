import java.util.*;

public class practice11 {
    public static void subarray(int array[] ){
        for (int i =  0 ; i < array.length ; i++){
            for (int j = i+1 ; j < array.length; j++){
                for (int k = j ; j< array.length ; k++ ){
                    System.out.println( +array[j] +",");
                }
            }
        }
        System.out.println();
    }

    public static void main(String args []){
        int array[] = {2,3,4,5};

        subarray(array);
    }
}