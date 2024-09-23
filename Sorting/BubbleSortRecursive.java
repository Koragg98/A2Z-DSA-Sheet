

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
       
        //Recursive Approach:
        
        //if size becomes 1 we return
        if(n==1) return;
        //Else swap the elements
        //Before doing swap we'll set flag to track swaping
        int flag=0;
        for(int j=0;j<n-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        }
        //Now recursively call to do swap to the rest of the array
        //before calling recursive call check the flag
        if(flag==0)
            return;
        bubbleSort(arr,n-1);
    }
}
