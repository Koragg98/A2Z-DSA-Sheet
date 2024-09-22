


package sorting;

import java.util.Scanner;

/**
 * @author iraki
 */
public class BasicSorting {

    public static void swap(int arr[],int i,int minInd)
    {
        int temp=arr[i];
        arr[i]=arr[minInd];
        arr[minInd]=temp;    
    }
    public static void selectionSort(int arr[])
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            int minInd=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minInd])
                    minInd=j;
            }
            if(minInd!=i)
                swap(arr,i,minInd);
        }
    }
    public static void bubbleSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
    }
    
    public static void insertionSort(int arr[])
    {
        
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int x=arr[i];
            while(j>-1 && arr[j]>x )
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //selectionSort(arr);
        //bubbleSort(arr);
        insertionSort(arr);
        for(int x:arr)
            System.out.print(x+" ");
        sc.close();
    }

}
