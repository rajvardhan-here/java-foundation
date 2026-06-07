import java.util.*;
public class primenumber {


    // PRIME NUMBER IN OPTIMIZED PATTER AND FIXED
    public static boolean isPrime(int n){
        if (n ==2){                                    // CORNER CODE -  BASE CASE HIT H YE
            return true;                               // agar n ki value 2 h toh vo prime hi h
        }
        for (int i = 2; i<= Math.sqrt(n); i++){        // check karo number squareroot n se chota  ya equal if yes then
            if(n % i ==0){                             // n or i ko divide krne pr 0 aagya toh vo prime nhi h
                return false;                          // false dede vrna
            }
        }
        return true;                                   // true dede
    }


    //  PRINT ALL THE PRIME NUMBER IN RANGE
    public static void primeinrange(int n){
        for (int i = 2 ; i<= n; i++){
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }System.out.println( );
    }


    public static void main(String args[]){             //  MAIN FUNCTION
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER---: ");
        int n = sc.nextInt();
        primeinrange(n);
    }
}
