import java.util.*;

public class methods {
    public static void  swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("the value of a is " +a);
        System.out.println("the value of b is " +b);

    }



    public static int sum(int a , int b){

        return a+b;
    }

    public static float sum(float a , float b){
        return a+b;
    }

    public static void main(String args[]){

        System.out.println(sum(22.2,11.1));
    }




}