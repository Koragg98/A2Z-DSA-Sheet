package ArrayMediumProblem;
import java.util.*;
/**
 * @author iraki
 */
public class SpiralPrinting {

    public static List<Integer> printSpiral(int [][] mat)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        int top=0,bottom=n-1,left=0,right=m-1;
        
        while(left<=right && top<=bottom)
        {
            
            for(int i=left;i<=right;i++)
                ans.add(mat[top][i]);
            top++;
            
            for(int i=top;i<=bottom;i++)
                ans.add(mat[i][right]);
            right--;
            
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                    ans.add(mat[bottom][i]);
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                    ans.add(mat[i][left]);
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12}};
        
        List<Integer> ans = printSpiral(mat);
        
        System.out.println(ans);
    }

}
