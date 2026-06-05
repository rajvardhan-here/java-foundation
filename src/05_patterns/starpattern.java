import java.util.*;

public class starpattern {
    public static void main(String args[]){

        /*
        //"PRINT STAR PATTERN")
        for ( int line = 1; line <= 5 ; line ++){
            for( int star = 1; star <= line ; star++){
                System.out.print("*");
            }
            System.out.println();

            //*
            //**
            //***
            //****
            //*****

        }

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of line");
        int n = sc.nextInt();

        for ( int line = 1; line <= 4 ; line ++) {
            for (int star = 1; star <= n - line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*****
        //****
        //***
        //**
        //*

        // PRINT HALF PYRAMID PATTERN
        char n =4;
        for (int line = 1 ; line <= n; line++){
            for (int num = 1 ; num<=line  ; num++){
                System.out.print(num);
            }
            System.out.println( );
        }
        //1
        //12
        //123
        //1234

        */

        // PRINT CHARACTER PATTERN-

        int n =6;
        char ch = 'A';
        for (int line = 1 ; line <= n; line++){
            // inner loop
            for ( int chars= 1  ; chars <=line  ; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println( );
        }
        //A
        //BC
        //DEF
        //GHIJ
        //KLMNO
        //PQRSTU



    }

}