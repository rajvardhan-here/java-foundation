import java.util.*;
public class practice{
    public static void main (String args[]){

        // Question1: Write a Java program to get anumber from the user and print whether it is positive or negative.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0){
            System.out.println("this number is positve number");
        }
        else{
            System.out.println("this number is negative number");
        }  // input 2 -  this number is psitive number


    }
}