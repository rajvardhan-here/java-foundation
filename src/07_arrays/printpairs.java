import java.util.*;

public class printpairs{
    public  static  int pairs(int numbers[]){
        int tp =0;
      for(int i = 0 ; i < numbers.length; i++){
          int curr = numbers[i];
          for (int j = i+1 ; j<numbers.length ; j++ ){
              System.out.print("(" +curr+ "," +numbers[j]+ ")");
              tp++;
          }
          System.out.println();
      }
      System.out.print("total pairs = " +tp);
      return 1;
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};

        pairs(numbers);
    }
    //(2,4)(2,6)(2,8)(2,10)
    //(4,6)(4,8)(4,10)
    //(6,8)(6,10)
    //(8,10)

    // total pairs = 10
}