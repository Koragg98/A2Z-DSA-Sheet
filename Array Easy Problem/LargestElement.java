package ArrayEasyProblem;

import java.util.Scanner;

/**
 * @author iraki
 */

public class LargestElement {

    //Recursive approach
    static int max=Integer.MIN_VALUE;
    static int maxElement(int arr[],int n,int i)
    {
     if(i<n)
        {
            if(arr[i]>max)
            max=arr[i];
            maxElement(arr,n,i+1);
        }
      return max;  
    }
    public static int getLargest(int[] arr) 
    {
        // code here
        
        //Brute force Approach
        // Arrays.sort(arr);    //O(nlogn)
        // return arr[arr.length-1];    
        
        //Optimal Approach
        int largest=arr[0];  //There will be always one single largest element
        for(int i=1;i<arr.length;i++)   //O(n)
        {
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(getLargest(arr));
    }

}
