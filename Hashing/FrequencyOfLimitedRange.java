//Frequencies of Limited Range Array Elements
//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0


//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // testcases
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            // size of array
            int N = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[N];
            String inputLine[] = br.readLine().trim().split(" ");

            // adding elements to the array
            for (int i = 0; i < N; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            int P = Integer.parseInt(br.readLine().trim());
            // calling frequncycount() function
            Solution ob = new Solution();
            ob.frequencyCount(arr, N, P);

            // printing array elements
            for (int i = 0; i < N; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        // do modify in the given array
        // int res[]=new int[N+1];
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]<=N)
        //         res[arr[i]]++;
        // }
        // System.arraycopy(res,1,arr,0,N);
        
        //creating hashmap and putting all values
        HashMap <Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.compute(arr[i],(k,v)->v+1);
            else
                hm.put(arr[i],1);
        }
        // Now,copying the arr
        for(int i=0;i<N;i++)
        {
            int res=(hm.get(i+1)==null)?0:hm.get(i+1);
            arr[i]=res;
        }
    }
}
