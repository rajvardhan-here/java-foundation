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


        // parameter and  arguments  in function
    public static void calculatesum( int num1, int num2){
            int sum = num1 + num2 ;
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
     */


    // Ek method banao printTable(int n) jo kisi bhi number ki table print kare. main se 5 ki table print karao.
    public static void printTAble(int n ){
        for (int i = 1 ; i <= 10 ; i++ ){
            System.out.println( n+  "*" +i+ "=" +(i*n) );
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTAble(n);






    }

}