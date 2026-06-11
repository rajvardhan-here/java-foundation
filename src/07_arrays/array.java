import java.util.*;

public class array   {
    public static void main (String args[]){

        // create  an array
         int numbers[] =  new int[100];

         Scanner sc = new Scanner(System.in);

         numbers [0] =  sc.nextInt();
         numbers [1] =  sc.nextInt();
         numbers [2] =  sc.nextInt();

        System.out.println("no. of numbers in java   = " +numbers[0]);
        System.out.println("no. of numbers in  c      = " +numbers[1]);
        System.out.println("no. of numbers in  python = " +numbers[2]);

        System.out.println(numbers.length);

        numbers[2] = 1001;
        System.out.println(numbers[2]);
    }
}