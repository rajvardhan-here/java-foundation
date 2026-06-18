import java.util.*;

public class subarray {
    public static void subary(int numbers[]){
        int tp= 0;
        for (int i =0 ; i <numbers.length ; i++){
            int start = i;
            for (int j = i; j< numbers.length ;j++){
              int end = j   ;

              for (int k = start ; k <=  end ;k++){
                  System.out.print(numbers[k]+ " ");
                  tp++;
              }
              System.out.println();
        }
            System.out.println();
        }
        System.out.print("total pairs = " +tp);
    }


    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        subary(numbers);
    }
    //2
    //2 4
    //2 4 6
    //2 4 6 8
    //
    //4
    //4 6
    //4 6 8
    //
    //6
    //6 8
    //
    //8
}