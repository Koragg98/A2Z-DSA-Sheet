package ArrayHardProblem;

import java.util.ArrayList;

/**
 * @author iraki
 */
public class PascalTriangle {

    public static long nCr(int n,int r)
    {
        long ans=1;
        for(int i=0;i<r;i++)
        {
            ans*=n-i;
            ans/=i+1;
        }
        return ans;
    }
    public static ArrayList<Integer> getRow(int row)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        long temp=1;
        //Adding 0th entry
        ans.add((int)temp);
        //Adding rest of 1 to row entries
        for(int col=1;col<=row;col++)
        {
            temp*=row-(col-1);
            temp/=col;
            ans.add((int)temp);
        }
        return ans;
    }
    public static int pascalTriangle1(int r,int c)
    {
        return (int)nCr(r-1,c-1);
    }
    public static void pascalTriangle2(int n)
    {
        int row=n-1;
        System.out.println(getRow(row));
    }
    public static void pascalTriangle3(int n)
    {
        for(int row=0;row<=n;row++)
        {
            pascalTriangle2(row);
        }
    }
    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle1(r, c);
        System.out.println("The element at position (r,c) is: " + element);
        pascalTriangle2(r);
        pascalTriangle3(r);
    }

}
