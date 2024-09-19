package RecursionPractice;

import java.util.Scanner;

/**
 * @author iraki
 */
public class PrintFrequency {
    
    private static int HashArray[]=new int[12];
    
    static int printFrequency(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        /*
        This is the introduction to Hashing.
        how you print the frequency of number in a array?
        let us first see the brute force approach
        */
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"="+printFrequency(arr,arr[i]));
        }
        
        
        /*
        Now the above complexity is O(Q*n)
        To reduce it we can use hashing which based on two main concept Prestore & Fetch
        Now we assume that maximum elemnt in the array can be 12
        So, we create an array of size 13 to get the index fromm 0 to 12 and inilized it to zero
        Now, we store the element by iterating through the array and store the elements in the following array
            for(int i=0;i<n;i++)
            {
                HashArray[arr[i]]+=1;   //Complexity of pre storing is O(n)
            }
        To,retrieve we just use the element as index of HashArray and can get the frequency of that element
            return HashArray[element];    //gives the frequency and complextiy O(1)
        
        So, the overall complexity is O(n)
        */
        System.out.println("Hashing Technique");
        for(int i=0;i<n;i++)
        {
            HashArray[arr[i]]+=1;   //O(n)
        }
       
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"="+HashArray[arr[i]]);  //O(n)
        }
        /*
        Problem: is the limitation of array size in main method array size can be at most 10^6 and globally 10^7
        but the maximum element of the provided array may be 10^9
        So we can't use this technique in that case. For this we use HashMap which use diffent HashFunction to store the element
        */
    }

}
