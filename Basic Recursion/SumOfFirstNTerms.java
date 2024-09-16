//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
//Sum of first n terms

class Solution {
    long sum=0l;
    long sumOfSeries(long n) {
        // code here
        if(n<1)
            return 0;
        return (n*n*n)+sumOfSeries(n-1);
    }
}
