import java.util.*;

public class dowhile {
    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        /*
        // KEEP ENTERING NUMBER UNTIL USERS ENTER MULTIPLE OF 10
        do {
            System.out.println("enter the number ");
            int counter = sc.nextInt();
            if (counter % 10 == 0) {
                System.out.print( counter);
                break;
            }
        }while (true) ;

         */
        // DISPLAY ALL THE NUMBER ENTER BY USER EXPECT MULTIPLE IF 10

        do {
            System.out.println("enter your number ");
            int counter = sc.nextInt();
            if (counter % 10 == 0) {
                continue;
            }
            System.out.println("your number was - "+ counter);
        }while (true);
    }
}