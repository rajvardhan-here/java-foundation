import java.util.*;

public class array{

    public static void main(String args[]){
        int marks [] = new int[99];
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(" physics = "  + marks[0]);
        System.out.println(" science = "  +marks[1]);
        System.out.println(" maths = "  +marks[3]);

                int percentage = (marks[0] + marks[1] + marks[2] )/3;
                System.out.println(percentage);
                System.out.println(marks.length);

    }
}
