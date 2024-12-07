package ArrayHardProblem;
import java.util.*;
/**
 * @author iraki
 */
public class MajorityElement2 {

    //Brute Force
    public static List<Integer> majorityElementBrute(int arr[])
    {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            if(list.isEmpty() || list.getLast()!=arr[i])
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i]==arr[j])
                        cnt++;
                }
            }
            if(cnt>n/3) list.add(arr[i]);
            if(list.size()==2) break;
        }
        return list;
    }
    
    //Better
    public static List<Integer> majorityElementBetter(int arr[])
    {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int min=(n/3)+1;
        
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
            //Not >N/3 bcz there may exist el whose freq is far more than N/3, 
            //in that case we may add same el multiple times
            if(hm.get(arr[i])==min) list.add(arr[i]);
            if(list.size()==2) break;
        }
        
        Collections.sort(list);
        return list;
    }
    
    //Optimal
    public static List<Integer> majorityElementOptimal(int arr[])
    {
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        int cnt1=0,cnt2=0;

        for(int i=0;i<n;i++)
        {
            if(cnt1==0 && arr[i]!=el2)
            {
                cnt1=1;
                el1=arr[i];
            }
            else if(cnt2==0 && arr[i]!=el1)
            {
                cnt2=1;
                el2=arr[i];
            }
            else if(arr[i]==el1) cnt1++;
            else if(arr[i]==el2) cnt2++;
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==el1) cnt1++;
            if(arr[i]==el2) cnt2++;
        }
        if(cnt1>n/3) list.add(el1);
        if(cnt2>n/3) list.add(el2);
        Collections.sort(list);
        return list;
    }
    
    //Helper Function
    public static List<Integer> majorityElement(int arr[])
    {
        //List<Integer> ans=majorityElementBrute(arr);
        //List<Integer> ans=majorityElementBetter(arr);
        List<Integer> ans=majorityElementOptimal(arr);
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

}
