package ArrayEasyProblem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author iraki
 */
public class MoveAllZeroes {

    public static void moveZeroes(int nums[])
    {
        //Two pointer approch 1 
        
        int i=0;
        int j=0;

        while(j<nums.length)
        {
            //If j encounter non zero then swap with i th element and forward i by 1
            if(nums[j]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            //j traverse the whole array
            j++;
        }
        // Two pointer approach 2
        
//         int j=-1;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]==0)
//             {
//                 j=i;
//                 break;
//             }
//         }
//         if(j==-1) return;
//         for(int i=j+1;i<nums.length;i++)
//         {
//             if(nums[i]!=0)
//             {
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 j++;
//             }
//         }
        //Brute force approace using another array
//        ArrayList<Integer> nz=new ArrayList<Integer>();
//        for(int i=0;i<nums.length;i++)
//        {
//            if(nums[i]!=0)
//                nz.add(nums[i]);
//        }
//        for(int i=0;i<nz.size();i++)
//        {
//            nums[i]=nz.get(i);
//        }
//        for(int i=nz.size();i<nums.length;i++)
//            nums[i]=0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        moveZeroes(arr);
        
        for(int x:arr)
            System.out.print(x+" ");
    }

}
