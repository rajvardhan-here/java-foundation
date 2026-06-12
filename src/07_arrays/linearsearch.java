import java.util.*;

public class linearsearch {

    public static void main(String[] args) {                 // [] lagaya

        int marks[] = {2, 10, 6, 8, 10, 12, 10, 16};
        int key = 10;

        int index = linearsearch(marks, key);
        if (index == -1) {
            System.out.println("key not found");
        } else {
            System.out.println("index of key is " + index);
        }
    }

    public static int linearsearch(int marks[], int key) {

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == key) {                    //  key use kiya
                return i;
            }
        }
        return -1;
    }
}