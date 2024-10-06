import java.util.*;
public class reversearray
{
    static void reversearr(int arr[],int n)
    {
        int[] b = new int[n];
        int i = n;
        for(int j=0;j<n;j++)
        {
            b[i-1] = arr[j];
            i =i-1;
        }
        System.out.println("reversed array is :  ");
        for(int k =0;k<n;k++)
        {
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args)
    {
        int []arr = {1,2,3,4,5,6,7,8};
        reversearr(arr,arr.length);
    }
}