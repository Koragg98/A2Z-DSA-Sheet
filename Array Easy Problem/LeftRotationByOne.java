package ArrayEasyProblem;

import java.util.Scanner;

/**
 * @author iraki
 */
public class LeftRotationByOne {

    public static void leftRotation(int arr[],int n)
    {
        int temp=arr[0];
        
        for(int i=0;i<n-1;i++)
            arr[i]=arr[i+1];
        
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        
        leftRotation(arr,n);
        
        for(int x:arr)
            System.out.print(x+" ");
    }

}
