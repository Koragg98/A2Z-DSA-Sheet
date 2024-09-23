

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int l, int h)
    {
        // code here
        if(l<h)
        {
            int j=partition(arr,l,h);
            quickSort(arr,l,j-1);
            quickSort(arr,j+1,h);
        }
    }
    static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[], int l, int h)
    {
        // your code here
        int pivot=arr[l];
        int i=l;
        int j=h;
        while(i<j)
        {
            while(arr[i]<=pivot && i<h) {i++;}
            
            while(arr[j]>pivot && j>l){j--;}
            
            if(i<j)
                swap(arr,i,j);
        }
        swap(arr,l,j);
        return j;
    } 
}
