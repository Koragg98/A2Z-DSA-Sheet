package ArrayMediumProblem;

import java.util.*;

/**
 * @author iraki
 */
public class LongestConsecutiveSequence {

    public static int longestSuccessiveElements(int arr[])
    {
        int n=arr.length;
        if(n==0) return 0;
        
        //Brute force
        int longest=1;
//        for(int i=0;i<n;i++)
//        {
//            int x=arr[i];
//            int count=0;
//            while(lSearch(arr,x))
//            {
//                count++;
//                x++;
//            }
//            longest=Math.max(longest,count);
//        }

       //Better
//        int lastSmaller=Integer.MIN_VALUE;
//        int count=0;
//        //Sort the array
//        Arrays.sort(arr);
//        
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]-1==lastSmaller)
//            {
//                count++;
//                lastSmaller=arr[i];
//            }
//            else
//            {
//            count=1;
//            lastSmaller=arr[i];
//            }
//            longest=Math.max(longest, count);
//        }
        
        //OPtimal
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr) hs.add(x);
        
        for(int x:hs)   //O(n) 
        {
            if(!hs.contains(x-1))
            {
                int cnt=1;
                int el=x+1;
                while(hs.contains(el))
                {
                    el++;
                    cnt++;
                }
                longest=Math.max(cnt, longest);
            }
        }
        return longest;
    }
    public static boolean lSearch(int arr[],int key)
    {
        for(int x:arr)
        {
            if(x==key) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        //for 100 inner loop-2,101-0,102-0,1-3,2-0,3-0,4-0
        //total inner loop=5
        int[] a = {100, 101,102,200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }

}
