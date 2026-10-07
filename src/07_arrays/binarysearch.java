import java.util.*;

public class binarysearch {
    public static void Pairs(int number[]){

        int tp =0;
        for (int i = 0 ; i< number.length ;i++){
            int current = number[i];
            for(int j= i+1 ; j< number.length ; j++){
                System.out.print("(" +current +"," +number[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }

    public static void main(String args[]){
        int number[] = {2,4,6,8,10,231,12,12,31,231,321};

        Pairs(number);
    }
}