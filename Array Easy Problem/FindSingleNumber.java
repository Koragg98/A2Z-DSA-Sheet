package ArrayEasyProblem;
import java.util.*;
import java.util.Map.Entry;
/**
 * @author iraki
 */
public class FindSingleNumber {

    public static int getSingleElement(int arr[])
    {
        //Brute Force
        //Complexity: T-> O(n^2) S-> O(1)
//        int cnt=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length;j++)
//            {
//                if(arr[i]==arr[j]) cnt++;
//            }
//            if(cnt==1)
//                return arr[i];
//        }
//        return -1;
        
        //Better Approach1: (Using hashing Technique)
        //Complexity: T-> O(n)[Finding maxElement]+O(n)[Storing each elemnt]+O(n)[Searching each element is hash], S->O(maxElement+1)
//        int maxElement=arr[0];
//        //Finding Max Element- O(n)
//        for(int x:arr)
//        {
//            if(x>maxElement) maxElement=x;
//        }
//        
//        //Creating Hash Array
//        int hashArr[]=new int[maxElement+1];
//        
//        //Storing element frequency in the hash array- O(n)
//        for(int x:arr)
//        {
//            hashArr[x]++;
//        }
//        
//        //Searching the element in the hashArr for which frequency is 1
//        for(int x:arr)
//        {
//            if(hashArr[x]==1)
//                return x;
//        }
//        return -1;
        //Disadvantage: Not possible for negative numbers. and also can create hashArr for very large element
        
        
        //Better Approach2: Using HashMap
        //Complexity: T->O(n)[inserting]+O(m)[m=n/2+1,no of entry in map for n element], S->O(m)
//        HashMap<Integer,Integer> hm=new HashMap<>();
//        //Storing the elements-O(n)
//         for(int i=0;i<arr.length;i++)
//        {
//            // if(hm.containsKey(arr[i]))
//            // {
//            //     //hm.replace(arr[i],hm.get(arr[i])+1);
//            //     hm.compute(arr[i],(k,v)->++v);
//            // }
//            // else
//            // {
//            //     hm.put(arr[i],1);
//            // }
//            hm.compute(arr[i],(k,v)->(v==null)?1:++v);
//        }
//        //Seraching the single element-O(m)
//        for(Entry<Integer,Integer> e:hm.entrySet())
//        {
//            if(e.getValue()==1)
//            {
//                return e.getKey();
//            }
//        }
//        return -1;
        //Optimal: Using xor concept
        //Complexity: T->O(n), S->O(1)
        int xor=0;
        for(int x:arr)
            xor^=x;
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }

}
