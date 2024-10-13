package ArrayEasyProblem;

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
        
        //Better(Using Hashing)
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }

}
