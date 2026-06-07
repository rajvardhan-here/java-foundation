import java.util.*;

public class practicefunction {

    // Question 1 :Write a Java method to compute the averageof three numbers

    public static int average(int a , int b , int c){
        int aver = a + b + c/100;
        System.out.println(aver);
            return aver;
    }
    public static void main (String args[]){
        average(12,21,44);
    }

    // -------------------------------------------------------------------------------------------------------------------

}