    import java.util.*;

    public class subarray{

        public static void Subarray(int array[]){
            for (int i = 0 ; i < array.length ; i++){
                int current = array[i];
                for (int j = i+1 ; j< array.length ; j++){
                        System.out.print("(" + current +","  +array[j] +") ");
                    }
                    System.out.println();
                }
            }

        public static void main(String args[]){
            int array[] ={1,2,3,4};

            Subarray(array);
        }

    }



    //  THIS IS THE LAST DAY OF LECTURE 7  AND I HAD COMPLETED
//    BINARY SEARCH
//            LINEAR SEARCH
//                    REVERSE AN ARRAY
//    SUB ARRAY
//            PAIRS IN ARRAY
//    LARGEST IN ARRAY