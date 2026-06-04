import java.util.*;

public class whileloop {
    public static void main (String args[]){

        Scanner  sc = new Scanner(System.in);

        /* WHILE LOOP K BASICS
        int counter = sc.nextInt();
        while(counter < 100){
            System.out.println(" RAJ ");
            counter ++;
        }
        System.out.println("RAJ is printed 100 time ");

        // PRINT A NUMBER 1 TO 10 USING WHILE LOOP
        int counter = 1;

        while(counter < 100){
            System.out.print(" " + counter);
            counter ++;
        }

        //print a nu,mber 1 to n
        System.out.println("enter the number ");
        int number = sc.nextInt();
        int counter = 0;

        while ( counter <= number ){
            System.out.print(counter+ "  ");
            counter ++;  //0  1  2  3  4  5  6  7  8  9  10  11
         */


        // PRINT SUM OF FIRST 5 NATURAL NUMBER
        int number = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while(counter <= number ){
            sum = sum +counter;
            counter ++;
            System.out.println("SUM IS - " +sum);  // SUM IS- 15

        }




    }
}