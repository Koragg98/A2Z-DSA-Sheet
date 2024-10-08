package ArrayEasyProblem;
import java.util.*;
/**
 * @author iraki
 */
public class UnionOfArray {

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        //Brute Force Complexity: O((n+m)log(m+n))
        // ArrayList<Integer> union=new ArrayList<>();
        
        // TreeSet<Integer> ts=new TreeSet<>();
        
        // for(int i=0;i<n;i++)
        //     ts.add(arr1[i]);
            
        // for(int i=0;i<m;i++)
        //     ts.add(arr2[i]);
            
        // for(int x:ts)
        // {
        //     union.add(x);
        // }
        // return union;
        
        //Optimal Complexity: O(n)
        ArrayList<Integer> union=new ArrayList<>();
        
        int i=0,j=0;
        
        while(i<n && j<m)
        {
            if(arr1[i]<=arr2[j])
            {
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            
            else
            {
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while(i<n)
        {
            if(union.get(union.size()-1)!=arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while(j<m)
        {
            if(union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
            j++;
        }
        
        return union;
    }
    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        ArrayList<Integer> Union = findUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }
}
