package ArrayMediumProblem;

import java.util.*;

/**
 * @author iraki
 */
public class MatrixZero {

    public static void markCol(ArrayList<ArrayList<Integer>> matrix,int j)
    {
        int n=matrix.size();
        for(int i=0;i<n;i++)
        {
            if(matrix.get(i).get(j)!=0)
                matrix.get(i).set(j, -1);
        }
    }
    public static void markRow(ArrayList<ArrayList<Integer>> matrix,int i)
    {
        int m=matrix.get(0).size();
        
        for(int j=0;j<m;j++)
        {
            if(matrix.get(i).get(j)!=0)
                matrix.get(i).set(j, -1);
        }
    }
    public static void zeroMatrix(ArrayList<ArrayList<Integer>> matrix)
    {
        int n = matrix.size();
        int m = matrix.get(0).size();
        
        //Brute Force T->O(nm(n+m))+O(nm)
        //change all nonzero el to -1 in the row and col wherer we encounter 0
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(matrix.get(i).get(j)==0)
//                {
//                    markCol(matrix,j);
//                    markRow(matrix,i);
//                }
//            }
//        }
////        [1, -1, 1]
////        [-1, 0, -1]
////        [1, -1, 1]
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(matrix.get(i).get(j)==-1)
//                {
//                    matrix.get(i).set(j, 0);
//                }
//            }
//        }
//        [1, 0, 1]
//        [0, 0, 0]
//        [1, 0, 1]

        //Better
//        int row[]=new int[n];
//        int col[]=new int[m];
//        
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(matrix.get(i).get(j)==0)
//                {
//                    row[i]=1;
//                    col[j]=1;
//                }
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                if(row[i]==1 || col[j]==1)
//                {
//                    matrix.get(i).set(j, 0);
//                }
//            }
//        }
//        
        //Optimal
        int col0=1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix.get(i).get(j)==0)
                {
                    matrix.get(i).set(0, 0);
                    if(j!=0)
                        matrix.get(0).set(j, 0);
                    else col0=0;
                }
            }
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix.get(i).get(j)!=0)
                {
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0)
                        matrix.get(i).set(j, 0);
                }
            }
        }
        for(int j=1;j<m;j++)
        {
            if(matrix.get(0).get(0)==0)
                matrix.get(0).set(j, 0);
        }
        for(int i=0;i<n;i++)
        {
            if(col0==0)
                matrix.get(i).set(0, 0);
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        System.out.println("The Initial matrix is: ");
        for(ArrayList l:matrix)
        {
            System.out.println(l);
        }
        
        
        zeroMatrix(matrix);
        
        System.out.println("The Final matrix is: ");
        for(ArrayList l:matrix)
        {
            System.out.println(l);
        }
    }
}
