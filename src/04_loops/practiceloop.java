import java.util.*;

public class practiceloop {
    public static void main(String args[]) {

        /*
        // quesation no. 1 -  how many time hello is printed
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            i += 2;
        }       // 2 times

        //quesation 2 --wap that    reads set of integer and then print sum of the even or odd integer

        Scanner sc= new Scanner(System.in);
        int number;
        int evensum = 0;
        int oddsum =0 ;

        do {
            System.out.println("enter your number --");
            number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }
        }while (true);

            System.out.println("sum of even number is = " + evensum);
            System.out.println("sum of odd number is = " + oddsum);
            //sum of even number is = 158   sum of odd number is = 13143

        //quesation 3  -  find the reverse  of the given number

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to reverse --");
        int n = sc.nextInt();
        while (n >0) {
            int i = n % 10;
            System.out.print(i);
            n = n / 10;          // input - 54321     // 12345
        }

         */


        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int rev =0;
        int i;
        while (n > 0){
            i = n% 10;
            rev = (rev*10) + i;
            System.out.print(rev + " ");
            n = n/10;            // 11012007  ---->   // 70021011
        }



    }
}