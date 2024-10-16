package ArrayMediumProblem;

import java.util.*;

/**
 * @author iraki
 */
public class TwoSumProblem {

    public static int[] twoSum(int[] nums, int target)
    {
        int n=nums.length;
        int ans[]=new int[2];
        Arrays.fill(ans, -1);
        //Brute Force
//        for(int i=0;i<n;i++)
//        {
//            //for(int j=0;j<n;j++)
//            for(int j=i+1;j<n;j++)
//            {
//                //if(i==j) continue;
//                if(nums[i]+nums[j]==target)
//                {
//                    ans[0]=i;
//                    ans[1]=j;
//                }
//            }
//        }
        //Better
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for(int i=0;i<n;i++)
//        {
//            int rem=target-nums[i];
//            if(hm.containsKey(rem))
//            {
//                ans[0]=i;
//                ans[1]=hm.get(rem);
//            }
//            hm.put(nums[i],i);
//        }
        //Optimal
        int numsWithInd[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            numsWithInd[i][0]=nums[i];
            numsWithInd[i][1]=i;
        }
        Arrays.sort(numsWithInd,(a,b) -> Integer.compare(a[0], b[0]));
        int left=0,right=n-1;
        while(left<right)
        {
            int sum = numsWithInd[left][0] + numsWithInd[right][0];
            if(sum==target)
            {
                ans[0]=numsWithInd[left][1];
                ans[1]=numsWithInd[right][1];
                break;
            }
            else if(sum>target) right--;
            else left++;      
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {7, 6, 5, 8, 11};
        int target = 14;
        int ans[] = twoSum(arr, target);
        
        
        System.out.println("This is the answer for variant 1: ");
        if(ans[0]==-1)
            System.out.println("NO");
        else
            System.out.println("YES");
        
        
        
        System.out.println("This is the answer for variant 2: ");
        
        System.out.print("[");
        for(int i=0;i<ans.length;i++)
        {
            if(i<ans.length-1)
             System.out.print(ans[i]+",");
            else
                System.out.print(ans[i]);
        }
        System.out.print("]");
        System.out.println();
    }

}
