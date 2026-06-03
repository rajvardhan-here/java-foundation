import java.util.*;
public class conditional{
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your age-");
    int age = sc.nextInt();

    if(age >= 5 ){
        System.out.println("the girl age is gone for marriage ");
    }
    else{
        System.out.println("you are eligible for marriage ");
    }

    }
}