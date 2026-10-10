import java.util.*;
public class bruteforce{

    public static void maxSubarraySum(int array[]){

        if(array[4] >  30){
            System.out.println("ok");
        }
        else{
            System.out.println("not");
        }
    }

    public static void main(String args[]){
        int array[] = {2,4,6,8,10};

        int result = maxSubarraySum(array);

        System.out.println("Maximum Subarray Sum: " + result);
    }

}