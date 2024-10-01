

package ArrayEasyProblem;

import java.util.Scanner;

/**
 * @author iraki
 */
public class RotateArrayByK {

    public static void reverse(int arr[],int l,int h) {
        while(l<h)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;h--;
        }
    }
    public static void rotate(int[] nums, int k) {
        
        //if k is in multiple of size of nums
        k=k%nums.length;
        // //Create an temporary array to store the first k elements
        // int temp[]=new int[k];
        // //Coyping the last k element of the array to the temp arr
        // for(int i=nums.length-k;i<nums.length;i++)
        //     temp[i-nums.length+k]=nums[i];
        // //Shift the elements in array by k places
        // for(int i=nums.length-k-1;i>=0;i--)
        //     nums[i+k]=nums[i];
        // //Replace the 1st k elements of the array by the elemets in the temp
        // for(int i=0;i<k;i++)
        //     nums[i]=temp[i];

        //Optimal Approach
        reverse(nums,0,nums.length-k-1);
        reverse(nums,nums.length-k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int k=sc.nextInt();
        rotate(arr,k);
        
        for(int x:arr)
            System.out.print(x+" ");
    }
    // Both Approach take O(n) but the optimal take zero extra space
}
