package ArrayEasyProblem;

import java.util.*;

/**
 * @author iraki
 */
public class RemoveDuplicate {
    
    public static int removeDuplicates(int[] nums) 
    {
//        TreeSet<Integer> hs=new TreeSet();
//        for(int x:nums)
//            hs.add(x);
//        int ind=0;
//        for(Integer x:hs)
//            nums[ind++]=x;
//        // Iterator<Integer> it=hs.iterator();
//        // for(;it.hasNext();)
//        //     arr[ind++]=it.next();   
//        return hs.size();
        int i=0;
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1; //i indicate the current position upto unique element.As index start from 0,it i+1
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2};
        System.out.println(removeDuplicates(arr));
        for(int x:arr)
            System.out.print(x+" ");
    }

}
