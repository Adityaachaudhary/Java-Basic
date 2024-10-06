import java.util.*;

public class maxmin {
    public int max(int [] array) {
       int max = 0;
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]>max) {
             max = array[i];
          }
       }
       return max;
    }
    public int min(int [] array) {
       int min = array[0];
      
       for(int i=0; i<array.length; i++ ) {
          if(array[i]<min) {
             min = array[i];
          }
       }
       return min;
    }
    public static void main(String args[]) {
       int[] array = {23, 92, 56, 39, 93};
       maxmin m = new maxmin ();
       System.out.println("Maximum value in the array is::"+m.max(array));
       System.out.println("Minimum value in the array is::"+m.min(array));
    }
 }