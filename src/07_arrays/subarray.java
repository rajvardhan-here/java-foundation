    import java.util.*;

    public class subarray{

        public static void Subarray(int array[]){
            for (int i = 0 ; i < array.length ; i++){
                int current = array.length;
                for (int j = i ; j< array.length ; j++){
                        System.out.print("(" + current +","  +array[j] +") ");
                    }
                    System.out.println();
                }
            }
        }

        public static void main(String args[]){
            int array[] ={1,2,3,4};

            Subarray(array);
        }

    }