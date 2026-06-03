import java.util.*;
public class conditional{
    public static void main (String args[]){
     //  if else conditions
     Scanner sc = new Scanner(System.in);

    System.out.println("enter your age-");
    int age = sc.nextInt();

    if(age < 5 ){
        System.out.println("the girl age is gone for marriage ");
    }
    if (age > 10 && age < 15){
        System.out.println("kuch kam ki nhi h -");
        }
    else{
        System.out.println("you are eligible for marriage ");
    }


    }
}