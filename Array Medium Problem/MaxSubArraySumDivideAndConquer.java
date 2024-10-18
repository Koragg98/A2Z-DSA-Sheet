package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
class Result
{
    int maxSum;
    int start;
    int end;
    
    public Result(int maxSum,int start,int end){
        this.start=start;this.end=end;this.maxSum=maxSum;
    }
}
public class MaxSubArraySumDivideAndConquer {
    
    private static Result maxSubArraySum(int arr[])
    {
        return maxSubArrayHelper(arr,0,arr.length-1);
    }
    private static Result maxSubArrayHelper(int arr[],int left,int right)
    {
        if(left==right)
        {
            return new Result(arr[left],left,right);
        }
        int mid=left+(right-left)/2;
        Result leftMax=maxSubArrayHelper(arr,left,mid);
        Result rightMax=maxSubArrayHelper(arr,mid+1,right);
        Result crossMax=maxCrossingSubArray(arr,left,mid,right);
        
        if(leftMax.maxSum>=rightMax.maxSum && leftMax.maxSum>=crossMax.maxSum)
            return leftMax;
        else if(rightMax.maxSum>=leftMax.maxSum && rightMax.maxSum>=crossMax.maxSum)
            return rightMax;
        else
            return crossMax;
    }
    private static Result maxCrossingSubArray(int arr[],int left,int mid,int right)
    {
        int start=mid;
        int end=mid;
        int leftSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=left;i--)
        {
            sum+=arr[i];
            if(sum>leftSum)
            {
                leftSum=sum;
                start=i;
            }
        }
        
        int rightSum=Integer.MIN_VALUE;
        sum=0;
        for(int i=mid+1;i<=right;i++)
        {
            sum+=arr[i];
            if(sum>rightSum)
            {
                rightSum=sum;
                end=i;
            }
        }
        return new Result(leftSum+rightSum,start,end);
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        Result ans = maxSubArraySum(arr);
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, ans.start, ans.end+1)));
        System.out.println("The maximum subarray sum is: " + ans.maxSum);
    }

}
