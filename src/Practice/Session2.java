import java.util.*;
    public class Session2 {

        // ADDITION OF TWO NUMBER USING FUNCTION
        /*
        public static int raj(int num1 , int num2){
        int sum = num1 + num1;

        return sum;
    }
        public static void main(String args[]){
            int a = 3;
            int b = 4;
            int sum = raj(a,b);
            System.out.println(sum);
    }
         */

        // -------------------------------------------------------------------------------------------------------------------------------

        /* SWAP OF TWO NUMBER
        public static void main(String args[]){
            int a = 3;
            int b = 4;
            raj(a,b);
        }

        public static int raj(int a , int b) {
            int temp = a;
            a = b;
            b = temp;

            System.out.println(" swap of a = " + a);
            System.out.println(" swap of b = " + b);
            return 0;
        }
        */

        // -------------------------------------------------------------------------------------------------------------------------------

        /* PRODUCT OF TWO NUMBER MULTIPLE TIMES
        public static int raj(int num1 , int num2){
            int sum = num1 * num1;

            return sum;
        }
        public static void main(String args[]){
            int a = 3;
            int b = 4;
            int sum = raj(a,b);
            System.out.println(sum);
            sum = raj(55,33);
            System.out.println(sum);
        }
         */

        // -------------------------------------------------------------------------------------------------------------------------------

        /*  FIND FACTORIAL OF THE GIVEN NUMBER USING FUNCTION  "
        public static int factorial(int n) {
            int fact = 1;
            for (int i = 1; i <= n; i++){
                fact = fact * i;
        }
            return fact;
    }
        public static void main(String args []){
            Scanner sc = new Scanner(System.in);

            System.out.println("enter your number = ");       //5
            int n = sc.nextInt();
            System.out.println(factorial(n));   //120
        }
         */

        // -----------------------------------------------------------------------------------------------------------------------------

        // FUNCTION OVERLOADING
        /*
        public static int raj(int num1 , int num2){
            int sum = num1 - num2;
            return sum;
        }

        public static int raj(int num1 , int num2 , int num3) {
            int sum = num1 + num2 + num3;
            return sum;
        }

            public static float raj(float num1 , float num2) {
                float sum = num1 * num2;
                return sum;
            }
            public static void main(String args[]){

            System.out.println(raj(2,5,3));
            System.out.println(raj(2F,10F));
            System.out.println(raj(1001,23));

            }
            */

        // -----------------------------------------------------------------------------------------------------------------------------


        /* Prime  NUMBER
        public static boolean isPrime(int n) {
            if (n ==2) {
                return true;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        ///  print all prime in range
        public static void primeinrange(int n) {
             for ( int i = 1 ; i <=  n ; i++){
                 if(isPrime(i)){
                 System.out.print( i+ " ");
                 }
             }
             System.out.println();
        }
        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your number = ");       //100
            int n = sc.nextInt();
            primeinrange(n);   // 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
        }
        */

        // -----------------------------------------------------------------------------------------------------------------------------


        public static void bintodec(int binnum) {
            int mynum = binnum;
            int pow = 0;
            int dec=0;
            while (binnum >0){
                int lastdigit = binnum % 10;
                dec = dec + (lastdigit * (int) Math.pow(2,pow));
                binnum = binnum/10;
                pow++;

            }
            System.out.println("decimal of " +mynum + " is " +dec);
        }
        public static void main(String args []){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your number = ");       //105
            int binnum = sc.nextInt();
            bintodec(binnum);    // 5
        }




    }












        /*
        int line = 1;
        for (int i = 1 ; i <= line ; i++  ) {
            for ( line = 1 ; line <= 4  ; line++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //* * * *
        //* * * *
        //* * * *
        //* * * *
        //* * * *
        */

        //---------------------------------------------------------------------------------------------------------------------

        /*
        for (int line  = 1  ; line  <= 4 ; line ++){
            for ( int star = 1 ; star <= line ; star++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        //*
        //* *
        //* * *
        //* * * *
         */


        //--------------------------------------------------------------------------------------------------------------------------

        // inverted star pattern
        /*
        int n =4;
        for (int line  = 1  ; line  <= 4 ; line ++){
            for ( int star = 1   ; star <= n- line+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
        //****
        //***
        //**
        //*
               */
        //--------------------------------------------------------------------------------------------------------------------------

        //HALF PYRAMID PATTERN
        /*
        for (int line  = 1  ; line  <= 5 ; line ++){
            for ( int star = 1   ; star <= line ; star++){
                System.out.print(star);
            }
            System.out.println();
        }
        //1
        //12
        //123
        //1234
        //12345
         */

        //--------------------------------------------------------------------------------------------------------------------------------------

        /* PRINT CHARACTER PATTERN
        char ch = 'A';
        for (int line  = 1  ; line  <=  6 ; line ++){
            for ( int chars = 1 ; chars <= line ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //A
        //BC
        //DEF
        //GHIJ
        //KLMNO
        //PQRSTU
         */

        //--------------------------------------------------------------------------------------------------------------------------------------
