import java.util.*;

public class Function {


    /*
    // "STUDYING FUNCTION FROM SCRATCH - 7 JUNE"
    public static void helloraj(){
        int i = 24;
        System.out.println("hello raj");
        System.out.println("hello raj");
        System.out.println("hello raj");
        System.out.println(i);
        return;
    }
    public static void main(String[] args){
        helloraj();
        */



        // parameter and  arguments  in function
    public static void calculatesum( int a , int b){
            int sum = a+b;
        System.out.println("sum is : " + sum);
            return ;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a :");
        int a = sc.nextInt();
        System.out.println("enter number b :");
        int b = sc.nextInt();
        calculatesum(a,b);
    }

}