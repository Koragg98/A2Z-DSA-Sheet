package ArrayMediumProblem;

/**
 * @author iraki
 */
public class RotateMatrixBy90 {

    public static int[][] rotate(int arr[][])
    {
        int n=arr.length;
//        int ans[][]=new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                //ans[i][j]=arr[n-1-j][i];
//                ans[j][n-1-i]=arr[i][j];
//            }
//        }
//        return ans;

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            reverse(arr[i],0,n-1);
        }
        return arr;
    }
    public static void reverse(int arr[],int l,int h)
    {
        while(l<h)
        {
            int temp=arr[l];
            arr[l]=arr[h];
            arr[h]=temp;
            l++;h--;
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Initial Image");
        
        for(int[] row:arr)
        {
            for(int x:row)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        int rotated[][] = rotate(arr);
        System.out.println("Rotated Image");
        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated.length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }

}
