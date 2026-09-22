import java.util.*;

public class loop {
    public static void main(String args[]){

        System.out.print("enter the number n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum  = 0;
        int i = 1;
        while( i <= n){
            sum = sum+i;
            System.out.print(sum +" " );
            i++;

        }
    }
}
