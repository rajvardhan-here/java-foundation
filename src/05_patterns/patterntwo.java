/*
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
    /*
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

     */

    // -----------------------------------------------------------------------------------------------------------------------------------

    // INVERTED HALF PYRAMID PATTERN  WITH NUMBERS

    /*
    public static void inverted_HAlFPYRAMID(int rows ){
        for (int i = 1; i <= rows ; i++){

            for (int j = 1 ; j <= rows - i + 1 ; j++ ){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main (String args []){

        inverted_HAlFPYRAMID(5);
    }

    //1 2 3 4 5
    //1 2 3 4
    //1 2 3
    //1 2
    //1

     */


    // -----------------------------------------------------------------------------------------------------------------------------------

    /* print floyd_triangle
    public static void floyd_triangle(int rows ){
        int counter = 1;
        for (int i = 1; i <= rows ; i++){

            for (int j = 1 ; j <= i ; j++ ){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main (String args []){

        floyd_triangle(5);
    }
    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    */

    // -----------------------------------------------------------------------------------------------------------------------------------


        /* print 0 - 1 TRIANGULAR PATTERN
        public static void triangle_patten(int rows ){

        for (int i = 1; i <= rows ; i++){

            for (int j = 1 ; j <= i ; j++ ){
                if((i + j) % 2 == 0 ){
                System.out.print("1");
             }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main (String args []){

        triangle_patten(5);
    }
    //1
    //01
    //101
    //0101
    //10101

         */

    // -----------------------------------------------------------------------------------------------------------------------------------

    /* BUTTERFLY PATTERN
    public static void butterfly_pattern(int rows ){

        for (int i = 1; i <= rows ; i++){

            for (int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            for(int j =1 ; j<= 2*(rows-i);j++) {
                System.out.print("  ");
            }
            for ( int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        // 2ND HALF
        for (int i = rows; i >= 1 ; i--){


        for (int j = 1 ; j <= i ; j++ ){
            System.out.print("* ");
        }
        for(int j =1 ; j<= 2*(rows-i);j++)
            System.out.print("  ");

        for ( int j = 1; j<= i; j++){
            System.out.print("* ");
        }

        System.out.println();
        }
    }

    public static void main (String args []){

        butterfly_pattern(5);
    }
    //*                 *
    //* *             * *
    //* * *         * * *
    //* * * *     * * * *
    //* * * * * * * * * *
    //* * * * * * * * * *
    //* * * *     * * * *
    //* * *         * * *
    //* *             * *
    //*                 *

    */


      //-----------------------------------------------------------------------------------------------------------------------------------


     /* SOLID RHOMBUS
     public static void solid_rohmbus(int rows ){
         for (int i = rows; i >=1 ; i--){

             for (int j = 1 ; j <= i ; j++ ){
                 System.out.print(" ");
             }
             for(int j =1 ; j<= rows;j++) {
                 System.out.print("*");
             }

             System.out.println();
         }
     }

    public static void main (String args []){

        solid_rohmbus(5);
    }
    */

    //-----------------------------------------------------------------------------------------------------------------------------------


    // HOLLOW RHOMBUS
    /* public static void hollow(int totlrows , int totlcol){
        for ( int i = 1; i <= totlrows ; i ++){                        // outer loop

                // SPACES PRINT
                for (int j = 1 ; j <= totlrows - i + 1 ; j++ ){
                    System.out.print(" ");
                }

                // HOLLOW RECTANGLE
                for (int j = 1; j  <= totlcol ; j++) {    //inner loop
                    if( i  == 1 ||  i == totlrows || j ==1 || j == totlcol){
                    System.out.print(" *");
                    }
                    else {
                    System.out.print("  ");
                  }
                }

            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow(5,5);
    }

    //      * * * * *
    //     *       *
    //    *       *
    //   *       *
    //  * * * * *

      //-----------------------------------------------------------------------------------------------------------------------------------


    // DIAMOND PATTERN
    public static void diamond_pattern(int rows ){
        for(int i = 1; i <= rows ; i++){

        for (int j = 1 ; j <=  rows - i ; j++ ){
            System.out.print(" ");
        }
        for (int j = 1 ; j <= (2*i) - 1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

        // 2nd half
        for(int i = rows; i >= 1 ; i--){

            for (int j = 1 ; j <=  rows - i ; j++ ){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}

public static void main (String args []) {

    diamond_pattern(4);
  }
    //   *
    //  ***
    // *****
    //*******
    //*******
    // *****
    //  ***
    //   *
}

*/