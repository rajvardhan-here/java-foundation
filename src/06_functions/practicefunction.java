import java.util.*;

public class practicefunction {

    // Question 1 :Write a Java method to compute the averageof three numbers

    public static int average(int a , int b , int c){
        int aver = a + b + c/100;
        System.out.println(aver);
            return aver;
    }

    // -------------------------------------------------------------------------------------------------------------------

    // Question2 : Write a method named is Even that accepts an int argument.
    // The method should return true if the argument iseven,or false otherwise.
    // Also write a program to test your method.

    public static boolean isEven(int n){
            if (n%2==0){
                return true;
            }
            else{
                return false;
            }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number -:");
        int n = sc.nextInt();
        System.out.println(isEven(n));                   // 12  ---  true
    }
}