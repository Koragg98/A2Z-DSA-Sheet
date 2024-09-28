import java.util.*;

/**
 * @author iraki
 */

public class SecondLargest {

    public static int getSecondLargest(int[] arr) {
        // Code Here
        //Brute Force Approach
        // Arrays.sort(arr);
        // int largest=arr[arr.length-1];
        // int secondLargest=-1;    //There may be a case where there is no secondLargest
        // for(int i=arr.length-2;i>=0;i--)
        // {
        //     if(arr[i]>secondLargest && arr[i]!=largest)
        //         secondLargest=arr[i];
        // }
        // return secondLargest;
        if (arr.length==0||arr.length==1)
            return -1;
        int largest=arr[0];
        int secondLargest=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]!=largest && arr[i]>secondLargest)
                secondLargest=arr[i];
        }
        return secondLargest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(getSecondLargest(arr));
    }

}
