//https://www.geeksforgeeks.org/problems/print-gfg-n-times/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-gfg-n-times
//Print GFG n times
class Solution {

    void printGfg(int N) {
        // code here
        if(N<1)
            return;
        System.out.print("GFG"+" ");
        printGfg(N-1);
        
    }
}
