

public static void insertionSort(int arr[],int i)
    {
        //Recursive Approach
        if(i==arr.length)
            return;
        int j=i-1;
        int x=arr[i];
        while(j>-1 && arr[j]>x)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=x;
        insertionSort(arr,i+1);
    }
