package HashingPractice;
import java.util.*;
import java.util.Map.Entry;
/**
 * @author iraki
 */
public class FreqOfElementsInArray {

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
            
            for(Entry<Integer,Integer> entry:hm.entrySet())
            {
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
}
