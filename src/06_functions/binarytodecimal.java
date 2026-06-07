import java.util.*;

public class binarytodecimal {


    //  BINARY TO DECIMAL CONVERSION OF THE GIVEN NUMBER
   /* public static void binarynum(int n){
        int newnum =  n;
        int pow = 0;
        int dec = 0;
        while(n > 0){
            int lastd = n % 10;
            dec = dec + (lastd * (int) Math.pow(2,pow) );
            pow++;
            n  = n / 10;
        }
        System.out.println("decimal of " +newnum+ " is " +dec);
    }

    */

    // -------------------------------------------------------------------------------------------------

    // DECIMAL TO BINARY CONVERSION
    /*
      public static void decnum(int n){
        int newnum =  n;
        int pow = 0;
        int dec = 0;
        while(n > 0){
            int rem = n % 2;
            dec = dec + (rem *   (int) Math.pow(10,pow) );
            pow++;
            n  = n / 2;
        }
        System.out.println("binay of " +newnum+ " is " +dec);       // binay of 8 is 1000
    }
     */

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number --: ");
        int n = sc.nextInt();
    }
 }