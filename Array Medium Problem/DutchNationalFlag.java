package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
public class DutchNationalFlag {

    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sortColors(int[] nums)
    {
        //Brute Force:
        //Arrays.sort(nums);
        
        //Better:
        /*int cnt0=0,cnt1=0,cnt2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) cnt0++;
            if(nums[i]==1) cnt1++;
            if(nums[i]==2) cnt2++;
        }
        for(int i=0;i<cnt0;i++) nums[i]=0;
        for(int i=cnt0;i<cnt0+cnt1;i++) nums[i]=1;
        for(int i=cnt0+cnt1;i<nums.length;i++) nums[i]=2;*/
        
        //Optimal(Dutch National Flag Algo):
        
        int low=0,mid=0,high=(nums.length-1);
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                mid++;low++;
            }
            else if(nums[mid]==1) mid++;
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
