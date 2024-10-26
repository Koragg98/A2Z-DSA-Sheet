package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
public class LeadersInArray {

    public static ArrayList<Integer> printLeaders(int arr[])
    {
        int n=arr.length;
    
        int leader=arr[n-1];
        
        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=leader)
            {
                ans.add(arr[i]);
                leader=arr[i];
            }
        }
        
        int l=0,h=ans.size()-1;
        while(l<h)
        {
            int temp=ans.get(l);
            ans.set(l,ans.get(h));
            ans.set(h,temp);
            l++;h--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]=  {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans= printLeaders(arr);
        System.out.println(ans);
    }
}
