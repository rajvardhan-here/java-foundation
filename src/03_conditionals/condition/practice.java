import java.util.*;
public class practice{
    public static void main (String args[]){

        /*
        // Question1: Write a Java program to get anumber from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0){
            System.out.println("this number is positve number");
        }
        else{
            System.out.println("this number is negative number");
        }  // input 2 -  this number is psitive number


        // Question2: Finish the following code so that it prints You have a fever if your temperature is
        // above 100 and otherwise prints You don't have a fever
        double temp = 103.05;
        if (temp >100){
            System.out.println("i have a fever ");
        }
        else {
            System.out.println("i don't have a fever ");
        } // i have a fever


        // Question 4 :What will be the value of x & y in the following program
        int a = 63, b = 36;
        boolean x = (a < b) ? true : false;
        int y= (a > b ) ? a : b;        // false  // y= 63
         */

        // Question 3:Write a Java program to input week number(1-7) and print day of week name using switch case.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the week number to know the day ");
        int week = sc.nextInt();

        switch (week){
            case 1 : System.out.println("monday");
            break;
            case 2 : System.out.println("TUESDAY");
            break;
            case 3 : System.out.println("WEDNESDAY");
                break;
                case 4 : System.out.println("THURSDAY");
                    break;
                    case 5 : System.out.println("FRIDAY");
                        break;
                        case 6 : System.out.println("SATURDAY");
                            break;
                            case 7 : System.out.println("SUNDAY");
        }  // input 4 --- THURSDAY




    }
}