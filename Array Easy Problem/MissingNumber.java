package ArrayEasyProblem;

/**
 * @author iraki
 */
public class MissingNumber {

    public static int missingNumber(int nums[])
    {
        //Brute Force
        //Complexity: T-> O(n^2), S-> O(1)
        // for(int i=1;i<=nums.length;i++)
        // {
        //     int flag=0;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(nums[j]==i)
        //         {
        //             flag=1;
        //             break;
        //         }
        //     }
        //     if(flag==0) return i;
        // }
        // return 0;

        //Better: Using Hashing Technique
        //Complexity: T-> O(n), S-> O(n)   

        // //Create a hash array of size n+1
        // int hashArr[]=new int[nums.length+1];

        // //Storing the number with 0 & 1
        // for(int i=0;i<nums.length;i++)
        // {
        //     hashArr[nums[i]]++;
        // }

        // //Find the index for which value is O
        // for(int i=1;i<hashArr.length;i++)
        // {
        //     if(hashArr[i]==0)
        //         return i;
        // } 
        // return 0;

        //Optimal 1: using sum
        //Complexity: T-> O(n), S-> O(1) 

        // int sum1=0;
        // for(int i=0;i<nums.length;i++)
        //     sum1+=nums[i];
        // int sum2=(nums.length*(nums.length+1))/2;

        // return (sum2-sum1);

        //Optimal 2: using xor
        //Complexity: T-> O(n), S-> O(1) 

        int xor1=0,xor2=0;
        // for(int i=1;i<=nums.length;i++)
        // {
        //     xor2=xor2^i;
        // }
        for(int i=0;i<nums.length;i++)
        {
            xor1=xor1^nums[i];
            xor2^=i+1;
        }
        return (xor1^xor2);
    }
    
    public static void main(String[] args) {
        
        int a[] = {1, 2, 0, 3};

        int ans = missingNumber(a);
        System.out.println("The missing number is: " + ans);
    }

}
