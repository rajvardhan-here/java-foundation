import java.util.*;

public class methods {
    public static void  swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("the value of a is " +a);
        System.out.println("the value of b is " +b);

    }

    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b ");
        int b = sc.nextInt();
        swap(a,b);
    }
}