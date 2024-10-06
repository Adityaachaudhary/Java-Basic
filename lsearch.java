import java.util.*;

public class lsearch{
    public static void main(String[] args){
     {
        int []n={23,45,1,46,8,19,-3,-4,-89};
        int target=-98;
        int result = lsearch(n,target);
        System.out.println(result);
     }
 //search the array:return the index if item found
 //otherwise if item not found return -1
    
    public static int lsearch(int []arr,int target);
     
        if(arr.length==0)
        {
        return -1;
        }
 //run for loop
     for (int i=0;i<arr.length;i++)
     {
 //check for element at every index if it is target       
        if(arr[i]== target)
        return i;
     
    }
 //this line will execute if target no. is not found in given array   
     return -1;
    
 }
}


