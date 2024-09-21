package HashingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author iraki
 */
public class HighestLowestFrequency {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            //Taking size of array
            int n=sc.nextInt();
            int arr[]=new int[n];
            //Taking value of array
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            //creating hashmap and mapping value
            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                if(hm.containsKey(arr[i]))
                    hm.put(arr[i],hm.get(arr[i])+1);
                else
                    hm.put(arr[i],1);
            }
            int highestElement=0,lowestElement=0;
            int lowest=Integer.MAX_VALUE;
            int highest=Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> entry:hm.entrySet())
            {
                if(entry.getValue()>highest)
                {
                    highest=entry.getValue();
                    highestElement=entry.getKey();
                }
                if(entry.getValue()<lowest)
                {
                    lowest=entry.getValue();
                    lowestElement=entry.getKey();
                }
            }
            System.out.println(highestElement+" "+lowestElement);
        }
       
    }

}
