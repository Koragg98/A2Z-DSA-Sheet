//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
//Find all factorial numbers less than or equal to n

class Solution {
    static long fact(long n)
    {
        if(n<1)
            return 1;
        return n*fact(n-1);
    }
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        ArrayList<Long> l=new ArrayList<>();
        
        for(long i=1l;i<=n;i++)
        {
            if(fact(i)<=n)
                l.add(fact(i));
            else
                break;
        }
        
        return l;
    }
}
