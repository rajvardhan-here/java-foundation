import java.util.*;

public class Session2 {
    public static void main(String args[]){

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

    }
}