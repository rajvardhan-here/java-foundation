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

    public static double sum(double a , double b){
        return a+b;
    }

    public static boolean isPrime(int n ){
        if (n ==2){
            return true;
        }
        for(int i = 2 ; i<= Math.sqrt(n); i++){
            
        }
    }

    public static void main(String args[]){

        System.out.println(isPrime(3));
    }
}