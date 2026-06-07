/*
import java.security.PublicKey;
import java.util.*;

public class Function {


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

    // -------------------------------------------------------------------------------------------

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

     // -----------------------------------------------------------------------------------------------------


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

    // --------------------------------------------------------------------------------------------------------


    // SWA[ING OF TWO NUMBER --- CALL BY VALUE
    public static int swap (int a, int b){
        int temp = a;
        a=b;
        b= temp;

        System.out.println("value of a =" +a);
        System.out.println("value of b = "  +b);
        return temp;
    }
    public static void main (String args[]){
        int a = 10;
        int b= 21;
        swap(a,b);
    }

    //--------------------------------------------------------------------------------------------------------

    //  product of two numbers using  function
    public static int multi(int a, int b){
        int product = a*b;
        product  = a+b;
        return product;
    }
    public static void main(String args []){
        int a = 31;
        int b = 2;
        int product = multi(a,b);
        System.out.println("a * b = " +product);
        product = multi(10,20);
        System.out.println("a * b = " +product);
        product = multi(5,2);
        System.out.println("a + b = " +product);
    }
      //--------------------------------------------------------------------------------------------------------

    // FACTORIAL OF THE GIVEN NUMBER
    public static int factorial(int n){
        int fact = 1;
            for (int i = 1 ; i <= n ; i++){
                fact = fact*i;
            }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number --:");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);           // --> 5 ---> 120
    }

    // ----------------------------------------------------------------------------------------------------------------------------------------------

    //FIND BINOMIAL COEFFICIENT
    public static int raj(int n , int r ){
        int fact_1 = factorial(n);
        int fact_2  = factorial(r);
        int fact_3 = factorial(n-r);

        int bino = fact_1 / (fact_2 * fact_3);
        return bino;

    }
    public static void main(String args []){

        System.out.println (raj(5,2));             // 10
    }

    // ---------------------------------------------------------------------------------------------------------------------------------


          // OVERLOADING USING PARAMETERS
    public static int multiply(int a , int b ){
        return a * b ;
    }
    public static int multiply(int a , int b, int c){
        return a*b*c;
    }
    public static void main (String args[]){
        System.out.println(multiply(5,3));                    //15
        System.out.println(multiply(2,4,3));               // 24
    }

// -----------------------------------------------------------------------------------------------------------------------------

    // function overloading using datatype

    public static int addition(int a , int b ){
        return a+b ;
    }
    public static double addition(double a , double b){
        return  a + b;
    }
    public static void main (String args[]){
        System.out.println(addition(5,3));                    //8
        System.out.println(addition(2.343f,4.234f));               // 6.577000141143799
    }

 // -----------------------------------------------------------------------------------------------------------------------------
}

 */