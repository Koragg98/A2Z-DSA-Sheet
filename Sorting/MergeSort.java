

class Solution
{
    void merge(int arr[], int l, int mid, int h)
    {
         // Your code here
         int i=l;
         int j=mid+1;
         ArrayList<Integer> temp=new ArrayList<>();
         
         while(i<=mid && j<=h)
         {
             if(arr[i]<=arr[j])
             {
                 temp.add(arr[i]);
                 i++;
             }
             else
             {
                 temp.add(arr[j]);
                 j++;
             }
         }
         while(i<=mid) { temp.add(arr[i]); i++; }
         while(j<=h) { temp.add(arr[j]); j++; }
         
         for(int k=l;k<=h;k++)
            arr[k]=temp.get(k-l);
    }
    void mergeSort(int arr[], int l, int h)
    {
        //code here
        //If at least two elements
        if(l<h)
        {
            int mid=(l+h)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            merge(arr,l,mid,h);
        }
    }
}
