package ArrayEasyProblem;
import java.util.*;
/**
 * @author iraki
 */
public class LongestSubarray {

    public static int getLongestSubarray(int []arr, long k)
    {
        int n=arr.length;
        int maxLen=0;
        //Brute Force O(n^3)
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//               long sum=0;
//               for(int l=i;l<=j;l++)
//               {
//                   sum+=arr[l];
//               }
//               if(sum==k) 
//                   maxLen=Math.max(maxLen,j-i+1);
//            }
//        }
//        return maxLen;


        //Brute Force 2 Optimized O(n^2)
//        for(int i=0;i<n;i++)
//        {
//            long sum=0;
//            for(int j=0;j<n;j++)
//            {
//               sum+=arr[j];
//               if(sum==k)
//                   maxLen=Math.max(maxLen, j-i+1);
//            }
//        }
//        return maxLen;
        
        //Better(Using Hashing) O(n) best , O(nlogn) worst
        //***This code is optimal if the array contains both positive and negative***
        
//        long sum=0;
//        HashMap <Long,Integer> prefixSum=new HashMap<>();
//        //Iterate over the array
//        for(int i=0;i<n;i++)
//        {
//            //Whenever we find k in original array
//            sum+=arr[i];
//            if(sum==k)
//                maxLen=Math.max(maxLen, i+1);
//            //Find the remaining sum to search is hashmap
//            long rem=sum-k;
//            //If rem contain in the map, find the len of sub array and compare
//            if(prefixSum.containsKey(rem))
//            {
//                int len=i-prefixSum.get(rem);
//                maxLen=Math.max(maxLen, len);
//            }
//            //Add the rem to hashmap only if it doesn't present in the map
//            //bcz we need to find rem as left as possible
//            if(!prefixSum.containsKey(sum))
//                prefixSum.put(sum, i);
//        }


        //Optimal: Two pointer approach O(2n)
        int right=0,left=0;
        long sum=arr[0];
        //Iterate until right moves to the end
        while(right<n)
        {
            //while sum is >k, trim & also check that it is valid subarray
            while(left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==k)
                maxLen=Math.max(maxLen, right-left+1);
            //we increment right by one place and find the sum
            right++;
            //before finding the sum always check we shold not acess index out of bound
            if(right<n)
                sum+=arr[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

}
