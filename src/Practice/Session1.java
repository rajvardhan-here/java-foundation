import java.util.*;

public class Session1 {
    public static void main(String args[]){

        // practice session 1
        /*
        // Question1:In a program , input 3 numbers :A,B and C.You have to output the average of these 3 numbers.

        int a = 21;
        int b = 12;
        int c = 11;
        int sum = a+b+c/3;
        System.out.println("the sum of a b and c is -: " +sum);
         */

        // Question2:In a program ,input the side of a square.You have to output the area of the square
        /*
        int side = 21;
        System.out.println("area of sqaure =  " +(side * side));   //441
        */


        //Question3: Enter cost of 3 items from the user (using float data type)-a pencil , a pen and an eraser
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(" cost of pen = ");
        float pen = sc.nextFloat();
        System.out.println(" cost of eraser = ");
        float eraser = sc.nextFloat();
        System.out.println(" cost of pensil = ");
        float pensil = sc.nextFloat();

        float total = (pen + pensil + eraser);
        System.out.println("total cost = " + (total));   //total cost = 25.0

        float tax = total * 18f/100;
        System.out.println("total tax = " +tax);     // total tax = 4.5
         */


        // area of circle
        /*
        float rad = 5.3f;
        float area = 3.14f* rad * rad;
        System.out.println("area of circle is  -: " +area);   //area of circle is  -: 88.202614
         */


        //TYPE CONVERSION
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(" cost of pen = ");      //22
        float pen = sc.nextInt();
        System.out.println(" cost of pen = ");      //11
        float pencil = sc.nextInt();
        System.out.println(pen+pencil);         //----   33.0
         */


        // STARTING CONDITIONAL STATEMENT
        /*
        // LARGEST OF TWO NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one = " );      //2
        int num1 = sc.nextInt();
        System.out.println("enter number two = " );      //4
        int num2 = sc.nextInt();

        if (num1 > num2 ){
            System.out.println(num1 + " is largest ");
        }else{
            System.out.println(num2+ " is largest");             // 4 is largest
        }
         */


        // even or odd
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one = " );      //2
        int num1 = sc.nextInt();

            if (num1 % 2==0 ){
            System.out.println(num1 + " is even ");
        }else{
            System.out.println(num1+ " is odd");             // 2 is eve
        }
        */

        // income tax calculator
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR YEARLY NINCOME = ");
        int income = sc.nextInt();
        int tax;

        if ( income < 500000 ){
            tax = 0;
        }
        else if(income > 500000 && income < 1000000 ){
            tax = (int)(income * 0.2f);
        }
        else{
            tax = (int)(income * 0.3f);
        }
        System.out.println("total tax is  = " +tax);
         */


        // given number is  positive or negative
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one = " );      //2
        int num1 = sc.nextInt();

        if (num1 > 0 ){
            System.out.println(num1 + " is positive ");
        }else{
            System.out.println(num1+ " is negative");             // 2 is positive
        }
         */



        //check fever or not with temp above 100
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one = " );      // 103.31
        double temp = sc.nextDouble();

        if (temp > 100 ){
            System.out.println("you have a fever");
        }else{
            System.out.println("you dont have a fever");             // you have a fever
        }
         */


        // Write a Java program to input week number (1-7) and print day of week name using switch case.
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number of the week = ");
        int num = sc.nextInt();

        switch ( num ){
            case 1 : System.out.println(" today is sunday");
            break;
            case 2 : System.out.println(" today is monday");
            break;
            case 3 : System.out.println(" today is tuesday");
            break;
            case 4 : System.out.println(" today is wednesday");
            break;
            case 5 : System.out.println(" today is thursday");
            break;
            case 6 : System.out.println(" today is friday");
            break;
            case 7 : System.out.println(" today is saturday");
            break;
            default: System.out.println(" this is out of syllabus");
        }
        */




        //  FIND The GIVEN YEAR IS LEAP YEAR OR NOT
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER your year  = ");
        int year = sc.nextInt();

        boolean x = year % 4 ==0;
        boolean y = year % 100 != 0;
        boolean z = (year % 100 ==0 && year % 400 ==0);

        if (  x && ( y || z) ){
            System.out.println( year+  "is  leap year ");
        }
        else{
            System.out.println ( year +"is not leap year" );
        }
        */

        //-----------------------------------------------------------------------------------------------------------------------------------------------



                                                        // STARTIING LOOPS FOR PRACTICE

        // PRINT NUMBER FROM 1 TO 10 USING WHILE LOOP
        /*
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
         */

        // print number from one to n
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number");     //4
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            System.out.print(i+ " ");          // 1 2 3 4
            i++;
        }
        */


        // SUM OF FIRST N NATURAL NUMBER
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter your number");     //5
        int n = sc.nextInt();
        int i =1 ;
        int sum=0;
        while (i <= n){
            sum += i;
            System.out.print(sum+ " ");          // 1 3 6 10 15
            i++;
        }
         */

        // PRINT SQUARE PATTERN
        /*
        int n = 4;
        for (int i = 1 ; i <= n ; i ++){
            System.out.println("*****");
        }
        //*****
        //*****
        //*****
        //*****

         */

        // PRINT REVERSE OF THE NUMBER
        /*
        int n = 412;
        for (int i = 0 ; i <= n ; i ++){
            i = n%10 ;
            System.out.print(i);           //214
            n = n/ 10;
        }
        */



        // PRINT REVERSE OF THE GIVEN NUMBER
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number ");        //4321
        int n = sc.nextInt();
        int rev =0;
        for (int i = 0 ; i <= n ; i ++){
            i = n%10 ;
            rev = (rev * 10)+i;
            System.out.print(i);           //1234
            n = n/ 10;
        }
    }
}