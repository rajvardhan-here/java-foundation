import java.util.*;

public class practice11 {
    public static void subarray(int array[] ){
        for (int i =  0 ; i < array.length ; i++){
            int current = array[i];
            for (int j = i+1 ; j < array.length; j++){
                System.out.println("(" +current +"," +array[j]);
            }
        }
        System.out.println();
    }

    public static void main(String args []){
        int array[] = {2,3,4,5};

        subarray(array);
    }
}