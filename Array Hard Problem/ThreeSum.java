package ArrayHardProblem;
import java.util.*;
/**
 * @author iraki
 */
public class ThreeSum {

    public static List<List<Integer>> tripletBruteForce(int nums[])
    {
        int n=nums.length;
        HashSet<List<Integer>> temp2=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {    
                        List<Integer> temp=new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
                        temp.sort(null);
                        temp2.add(temp);
                    }   
                }
            }
        }
        return new ArrayList<>(temp2);
    }
    
    public static List<List<Integer>> tripletBetter(int nums[])
    {
        int n=nums.length;
        HashSet<List<Integer>> temp2=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int third=-(nums[i]+nums[j]);
                if(hs.contains(third))
                {
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    temp2.add(temp);
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList<>(temp2);
    }
    
    public static List<List<Integer>> tripletOptimal(int nums[])
    {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;

        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else
                {
                    ans.add(List.of(nums[i],nums[j],nums[k]));
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        //List<List<Integer>> ans = tripletBruteForce(arr);
        //List<List<Integer>> ans = tripletBetter(arr);
        List<List<Integer>> ans = tripletOptimal(arr);
        System.out.println(ans);
    }
}
