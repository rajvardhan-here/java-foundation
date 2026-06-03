import java.util.*;
public class conditional{
    public static void main (String args[]){
     /*  if else conditions
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


        // print largest of 2
        int a= 5;
        int b = 10;
        if (a>=b ){
            System.out.println("a is largest of 2");
        }else{
            System.out.println("b os largest of 2");
        }
        // FIND THE GIVEN NO. IS ODD OR EVEN

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2==0) {
            System.out.println("the given no. is evem");
        }else{
            System.out.println("the given no. is odd");  // INPUT = 332 - THE GIVEN NO.  IS EVEN
            }


        //performing if and esle if statement with unique example
        int cgpa = 5;
        if  (cgpa >= 8){
            System.out.println("google me jao  ");
        }else if(cgpa >  6 && cgpa < 8){
            System.out.println("tcs  me jao");
        }
        else {
            System.out.println("apne ghar jao");
        }

        // quesation - income tax calculator
        int income = 320000;
        int tax;

        if (income < 300000){
            tax = 0;
        }
        else if( income > 300000 && income < 7000000 ){
            tax = (int)(income *(5.0/1000));
        }
        else {
            tax = (int)(income *(10.0/1000));
        }
        System.out.println(tax);  // 1600



        // print the largest of 3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for A");
        int A = sc.nextInt();
        System.out.println("enter the number for B");
        int B = sc.nextInt();
        System.out.println("enter the number for C");
        int C = sc.nextInt();

        if (A >= B  && A >= C){
            System.out.println("A is the largest number ");
        }
        else if ( B >= C){
            System.out.println("B  is the largest number ");
        }
        else{
            System.out.println("C is the largest number ");  // c is the largest number
        }

        // TERNARY OPERATOR
        int num = 121212;
        String  value = ( (num % 2) ==0 )? "even" : " odd" ;
        System.out.println(value);  // even
      */

        // check the given student is pass or fail

        double marks =  81.3;

        String result = ( marks > 33)? "pass": "fail";
        System.out.println(result); // pass






    }
}