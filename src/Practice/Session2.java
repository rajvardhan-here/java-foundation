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

    }
}