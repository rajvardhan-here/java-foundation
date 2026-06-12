import java.util.*;

public class parameterpassing {
    public static void main(String args[]){

        int marks[] = {10,20,21};                                     // enter total marks in array[] (marks)
        update(marks);                                                 // call update function

        // PRINMT MARKS AND VERIFIED
        for(int i = 0 ; i < marks.length ;  i++){                      // i 0 se array ki length tk chlega  update hone k bad
            System.out.print(marks[i] + " ");                          //  print kardo
       }
        System.out.println( );
        System.out.println(marks.length);

    }

    public static void  update(int marks[]){

        for(int i = 0 ; i < marks.length ;  i++){
            marks[i] = marks[i]+1;                                      //  marks ko +1 se badha do sabhi
        }
    }


}