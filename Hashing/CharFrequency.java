package HashingPractice;

import java.util.Scanner;

/**
 * @author iraki
 */
public class CharFrequency {

    static int HashArray[]=new int[26];
    static int HashArray2[]=new int[256];
    static int printFrequency(char c,String str)
    {
        //Brute force approach
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        /*
        Mapping the String to HashArray
        if all contains either small or capital letter only
        HashArray[string.charAt(i)-'a']++ => will map each alphabet to 0 to 25
        For any character use size 256
        and map using HashArray[String.charAt(i)]++ 
        */
        
//        for(int i=0;i<str.length();i++)
//        {
//            HashArray[str.charAt(i)-'a']++;
//        }
        
        for(int i=0;i<str.length();i++)
        {
            HashArray2[str.charAt(i)]++;
        }
        
        System.out.println("Enter the test case: ");
        int t=sc.nextInt();
        while(t-->0)
        {
            char c=sc.next().charAt(0);
            
            //System.out.println(printFrequency(c,str));
            //System.out.println(HashArray[c-'a']);
            System.out.println(HashArray2[c]);
           
        }
    }

}
