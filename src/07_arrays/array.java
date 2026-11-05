import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"Physics", "Science", "Maths"};
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter " + subjects[i] + " marks: ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + " = " + marks[i]);
        }

        double percentage = total / (double) marks.length;
        System.out.printf("Average marks = %.2f%n", percentage);
        System.out.println("Number of subjects = " + marks.length);
        sc.close();
    }
}
