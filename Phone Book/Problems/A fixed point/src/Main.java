
import java.util.*;

public class Main {

   static int binarySearch(int arr[], int low, int high) 
    { 
        if(high >= low) 
        {    
            /* low + (high - low)/2; */
            int mid = (low + high)/2;   
            if(mid == arr[mid]) 
                return mid; 
            if(mid > arr[mid]) 
                return binarySearch(arr, (mid + 1), high); 
            else
                return binarySearch(arr, low, (mid -1)); 
        } 
        
        /* Return -1 if there is  
           no Fixed Point */
        return -1; 
    } 
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i  < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = (binarySearch(arr, 0, arr.length - 1));
        
        if (x > -1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}
