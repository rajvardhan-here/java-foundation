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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one = " );      //2
        int num1 = sc.nextInt();

        if (num1 % 2==0 ){
            System.out.println(num1 + " is even ");
        }else{
            System.out.println(num1+ " is odd");             // 4 is largest
        }









    }
}