import kotlin.jvm.internal.Ref;

import java.util.*;

public class loop {
    public static void main(String args[]){

        /*
        System.out.print("enter the number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum  = 0;
        int i = 1;
        while( i <= n){
            sum = sum+i;
            System.out.print(sum +" " );
            i++;

         */
         // --------------------------------------------------------------------------------
/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int ld = n % 10;
            System.out.print(ld);
            n  = n / 10;
        }

        Scanner sc = new Scanner(System.in);
       int num ;

       do {
           System.out.print("enter a number = ");
            num = sc.nextInt();
       }while ( num % 10 != 0 );

       System.out.println(" numbwer mil gayaaaa");
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        for(int i = 1 ; i <=10; i++){
            System.out.println(n +" * "  +i   +" = " +n*i);
        }

    }
}
