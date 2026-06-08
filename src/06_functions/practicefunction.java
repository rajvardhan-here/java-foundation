/*import java.util.*;

public class practicefunction {

    // Question 1 :Write a Java method to compute the averageof three numbers

    public static int average(int a , int b , int c){
        int aver = a + b + c/100;
        System.out.println(aver);
            return aver;
    }

    // -------------------------------------------------------------------------------------------------------------------

    /*
    //Question2 : Write a method named is Even that accepts an int argument.
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
    */

    // -------------------------------------------------------------------------------------------------------------------


    /*

   //  Write a Java program to check if a number is a palindrome in Java

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number -:");
        int plaindrone = sc.nextInt();
        if(isPalindrome(plaindrone)){
            System.out.println(plaindrone+ " is plaindrome");
        }
        else{
            System.out.println(plaindrone+ " is not plaindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int plaindrome = number;
        int reverse = 0;

        while( plaindrome >0){
            int reminder = plaindrome % 10;
            reverse = reverse * 10 + reminder;
            plaindrome =  plaindrome/10;
        }
        if (reverse == number ){
            return true;
        }else{
            return false;
        }

    }
       // input as integer and find the sum
    public static int sumof(int n){
        int sum = 0;
        while(n > 0){
            int lstd = n % 10;
            sum += lstd;
            n = n /10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input an integer  -:");
        int number = sc.nextInt();
        System.out.println("the sum is " +sumof(number));
    }
}
*/