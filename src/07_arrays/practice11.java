import java.util.*;

public class practice11 {
    public static void main(String args []){
        int array[] = {2,3,4,5,6,7,8};

        int key= ;


        int index = linear(array,key);
        if(index == -1){
            System.out.println("key not found ");
        }else{
            System.out.println("key found at index " +index);
        }
    }

    public static int linear(int array[] , int key){
        for (int i =  0 ; i <= array.length ; i++){
            if(i == key) {
                return i;
               }
            }
        return-1;
    }
}