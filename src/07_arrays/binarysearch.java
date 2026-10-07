import java.util.*;

public class binarysearch {
    public static void Pairs(int number[]){

        for (int i = 0 ; i< number.length ;i++){
            int current = number[i];
            for(int j= i+1 ; i< number.length ; j++){
                System.out.println("(" +current +"," +number[j] +")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10};

        Pairs(number);
    }
}