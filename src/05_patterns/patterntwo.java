import java.util.*;

public class patterntwo {


    /*   "PRINT HOLLOW  RECTANGLE  PATTERN")
    public static void hollow(int totlrows , int totlcol){
        for ( int i = 1; i <= totlrows ; i ++) {     // outer loop

            for (int j = 1; j  <= totlcol ; j++) {    //inner loop
                if(i  == 1 ||  i == totlrows || j ==1 || j == totlcol){
                System.out.print("* ");
              }
                else {
                System.out.print("  ");
                }
            }
         System.out.println();
        }
    }
    public static void main(String args[]){
    hollow(5,20);
    }
    */
            // * * * * * * * * * * * * * * * * * * * *
            // *                                     *
            // *                                     *
            // *                                     *
            // * * * * * * * * * * * * * * * * * * * *

    // -----------------------------------------------------------------------------------------------------------------------------------

    // half pyramid and inverted pattern
    public static void HAlFPYRAMID(int rows ){

        for (int i = 1; i <= rows ; i++){

            for (int j = 1 ; j <=  rows - i ; j++ ){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main (String args []){

        HAlFPYRAMID(6);

    }
    //     *
    //    **
    //   ***
    //  ****
    // *****
    //******

    // -----------------------------------------------------------------------------------------------------------------------------------







}