package ArrayEasyProblem;

import java.util.Scanner;

/**
 * @author iraki
 */
public class SortedArraySearch {

    static int bSearch(int arr[],int l,int h, int key)
    {
        // while(l<=h)
        // {
        //     int mid=l+(h-l)/2;
        //     if(arr[mid]==key)
        //         //return mid;
        //         return 1;
        //     else if(arr[mid]>key)
        //         h=mid-1;
        //     else
        //         l=mid+1;
        // }
        // return -1;
        if(l<=h)
        {
            int mid=l+(h-l)/2;
            if(arr[mid]==key)
                return 1;
            else if(arr[mid]>key)
               return bSearch(arr,l,mid-1,key);
            else
               return bSearch(arr,mid+1,h,key);
        }
        return -1;
    }
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        //Linear Search
        
        /*
        int pos=-1;
    
        for (int i=0;i<N;i++)
        {
            if(arr[i]==K)
            {
                pos=1;
                break;
            }
        }
        return pos;
        */
        
        //Binary Search
        
        return bSearch(arr,0,N-1,K);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        int k=sc.nextInt(); //key
        System.out.println(searchInSorted(arr,n,k)); 
    }

}
