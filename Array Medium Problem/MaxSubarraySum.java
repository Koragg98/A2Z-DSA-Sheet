package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
public class MaxSubarraySum {

    public static int maxSubarraySum(int arr[])
    {
        //Brute & Better
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int ansStart=-1,ansEnd=-1;
//        for(int i=0;i<n;i++)
//        {
//            int sum=0;
//            for(int j=i;j<n;j++)
//            {
////                int sum=0;
////                for(int k=i;k<=j;k++)
////                    sum+=arr[k];
////                maxSum=Math.max(sum, maxSum);
//                sum+=arr[j];
//                if(sum>maxSum)
//                {
//                    maxSum=sum;
//                    ansStart=i;
//                    ansEnd=j;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, ansStart, ansEnd+1)));

        //Better
        int sum=0;
        int start=0;
        for(int i=0;i<n;i++)
        {
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        //For empty array
//        if(maxSum<0)
//        {
//            maxSum=0;
//            ansStart=-1;
//            ansEnd=-1;
//        }
        if(ansStart!=-1 && ansEnd!=-1)
            System.out.println(Arrays.toString(Arrays.copyOfRange(arr, ansStart, ansEnd+1)));
        else
            System.out.println("[]");
        
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

}
