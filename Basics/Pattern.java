package Basics;


import java.util.Scanner;

/**
 * @author iraki
 */
public class Pattern {

    public static void pattern1(int n)
    {
//        * * * * * 
//        * * * * * 
//        * * * * * 
//        * * * * * 
//        * * * * * 
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern2(int n)
    {
//        * 
//        * * 
//        * * * 
//        * * * * 
//        * * * * * 
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public static void pattern3(int n)
    {
//        1 
//        1 2 
//        1 2 3 
//        1 2 3 4 
//        1 2 3 4 5 
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern4(int n)
    {
//        1 
//        2 2 
//        3 3 3 
//        4 4 4 4 
//        5 5 5 5 5 
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern5(int n)
    {
//        * * * * * 
//        * * * * 
//        * * * 
//        * * 
//        *  
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern6(int n)
    {
//        1 2 3 4 5 
//        1 2 3 4 
//        1 2 3 
//        1 2 
//        1  
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern7(int n)
    {
//                * 
//               * * * 
//             * * * * * 
//           * * * * * * * 
//         * * * * * * * * *   
        
        for(int i=1;i<=n;i++)
        {
//            for(int j=1;j<=n-1;j++)
//            {
//                if(j<(n-i)+1)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");
//            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern8(int n)
    {
//               * * * * * * * * * 
//                * * * * * * *   
//                  * * * * *     
//                    * * *       
//                      *         
        
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=(2*i-1);j>=1;j--)
            {
                System.out.print("* ");
            }
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern9(int n)
    {
//              *         
//            * * *       
//          * * * * *     
//        * * * * * * *   
//      * * * * * * * * * 
//      * * * * * * * * * 
//        * * * * * * *   
//          * * * * *     
//            * * *       
//              *        
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
        System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
            for(int j=(2*i-1);j>=1;j--)
            {
                System.out.print("* ");
            }
            for(int j=n-i;j>=1;j--)
            {
                System.out.print("  ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern10(int n)
    {
//        * 
//        * * 
//        * * * 
//        * * * * 
//        * * * * * 
//        * * * * 
//        * * * 
//        * * 
//        *
        
        for(int i=1;i<=2*n-1;i++)
        {
            if(i>n)
            {
                for(int j=1;j<=2*n-i;j++)
                    System.out.print("* ");
            }
            else
                for(int j=1;j<=i;j++)
                {
                    System.out.print("* ");
                }
        System.out.println();
        }
    }
    
    
    public static void pattern11(int n)
    {
//        1 
//        0 1 
//        1 0 1 
//        0 1 0 1
//        1 0 1 0 1
        int start;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                start=0;
            else
                start=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(start+" ");
                start=1-start;
            }
        System.out.println();
        }
    }
    
    
    public static void pattern12(int n)
    {
//        1      1
//        12    21
//        123  321
//        12344321 
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=2*n-2*i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
        System.out.println();
        }
    }
    
    
    public static void pattern13(int n)
    {
//        1 
//        2 3 
//        4 5 6 
//        7 8 9 10 
//        11 12 13 14 15 
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count+++" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern14(int n)
    {
//        A 
//        A B 
//        A B C 
//        A B C D 
//        A B C D E 
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+++" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern15(int n)
    {
//        A B C D E 
//        A B C D 
//        A B C 
//        A B 
//        A
        char ch;
        for(int i=1;i<=n;i++)
        {
            ch='A';
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(ch+++" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern16(int n)
    {
//        A 
//        B B 
//        C C C 
//        D D D D 
//        E E E E E 
        char ch='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            ch++;
        System.out.println();
        }
    }
    
    
    public static void pattern17(int n)
    {
//          A 
//        A B A 
//      A B C B A 
//    A B C D C B A 
        char ch;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            ch='A';
            for(int j=1;j<=2*i-1;j++)
            {
                if(j<i)
                    System.out.print(ch+++" ");
                else
                    System.out.print(ch--+" ");
            }  
        System.out.println();
        }
    }
    
    
    public static void pattern18(int n)
    {
//        E 
//        D E 
//        C D E 
//        B C D E 
//        A B C D E 
        
        for(int i=1;i<=n;i++)
        {
            for(char j=(char)('E'-i+1);j<='E';j++)
            {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern19(int n)
    {
//        * * * * * * 
//        * *     * * 
//        *         * 
//        *         * 
//        * *     * * 
//        * * * * * *  
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-2;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=2*i-2;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=(n-i)+1;j++)
            {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    
    public static void pattern20(int n)
    {
//        *                 * 
//        * *             * * 
//        * * *         * * * 
//        * * * *     * * * * 
//        * * * * * * * * * * 
//        * * * *     * * * * 
//        * * *         * * * 
//        * *             * * 
//        *                 * 
        
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*"+" ");
//            }
//            for(int j=1;j<=2*n-2*i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print("*"+" ");
//            }
//        System.out.println();
//        }
//        for(int i=n-1;i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("*"+" ");
//            }
//            for(int j=1;j<=2*n-2*i;j++)
//            {
//                System.out.print("  ");
//            }
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print("*"+" ");
//            }
//        System.out.println();
//        }
        int spaces=2*n,stars;
        for(int i=1;i<=2*n-1;i++)
        {
            if(i>n)
            {
                stars=2*n-i;
                spaces+=2;
            }
            else
            {
                stars=i;
                spaces-=2;
            }
            for(int j=1;j<=stars;j++)
                System.out.print("*"+" ");
            for(int j=1;j<=spaces;j++)
                System.out.print("  ");
            for(int j=1;j<=stars;j++)
                System.out.print("*"+" ");
            System.out.println();
        }
    }
    
    
    public static void pattern21(int n)
    {
//        ***
//        * *
//        ***
        for(int i=1;i<=2*n-1;i++)
        {
            if(i%2==0)
            {
                System.out.println();
                continue;
            }
            else
            {
                for(int j=1;j<=n;j++)
                {
                    if(j<n && j>1 && i>1 && i<2*n-1)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void pattern22(int n)
    {
//        ***
//        * *
//        ***
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
               if(i==1||i==n||j==1||j==n)
                   System.out.print("*");
               else
                   System.out.print(" ");
           }
           System.out.println();
        }
    }
    
    
    public static void pattern23(int n)
    {
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444
        for(int i=1;i<=2*n-1;i++)
        {
           for(int j=1;j<=2*n-1;j++)
           {
              int top=i-1;
              int left=j-1;
              int bottom=(2*n-1)-i;
              int right=(2*n-1)-j;
              System.out.print(n-Math.min(Math.min(top, bottom), Math.min(left, right)));
           }
           System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            Pattern.pattern23(n);
        }
    }
}
