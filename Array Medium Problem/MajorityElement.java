package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
public class MajorityElement {

    public static int majorityElement(int nums[])
    {
        int el=-1;
        int n=nums.length;
        
        //Brute Force
//        for(int i=0;i<n;i++)
//        {
//            int cnt=0;
//            for(int j=0;j<n;j++)
//            {
//                if(nums[i]==nums[j]) cnt++;
//            }
//            if(cnt>(n/2))
//                el=nums[i];
//        }
        
        //Better
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        for(int i=0;i<n;i++)
//        {
//            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
//        }
//        for(Map.Entry<Integer,Integer> e:hm.entrySet())
//        {
//            if(e.getValue()>(n/2))
//                el=e.getKey();
//        }
//        return el;

        //Optimal(Moore's Voting algo)
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                el=nums[i];
                cnt=1;
            }
            else if(el==nums[i]) cnt++;
            else cnt--;
        }
        //Finding the el is majority element or not in case of their may or may not contain a majority element
        cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==el) cnt++;
        }
        if(cnt>(n/2)) return el;
        else return -1;
    }
    public static void main(String[] args) {
         int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

}
