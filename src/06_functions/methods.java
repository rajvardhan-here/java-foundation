import java.util.*;

public class methods {
    public static void main(String args[]){

        int a = 22;
        int b = 2;
        swap(a,b);
    }

    public static void  swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);


    }
}