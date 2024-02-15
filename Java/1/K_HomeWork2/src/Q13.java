import java.util.*; 
 
 
public class Q13 { 
    public static void main(String[] args) { 
        int arr[] = {10,21,45,22,7,2,95,19,13,14,12,11,18,16,17,100,250,21,99}; 
        System.out.println("Length of sequence:"+longestSequence(arr)); 
    } 
 
    private static int longestSequence(int[] arr) { 
       Set<Integer> set=new HashSet<Integer>(); 

       for(int i:arr) set.add(i);  
       
       int max=0, start=0; 
       
       for(int i:arr){ 
           int left=i-1; 
           int right=i+1; 
           int count=1; 
           
           while(set.contains(left)){ 
               set.remove(left--); 
               count++; 
           } 
           while(set.contains(right)){ 
               set.remove(right++); 
               count++; 
           } 
            
           if(max<count){ 
               max=count; 
               start=left+1; 
           } 
       } 
       System.out.println("Sequence:"); 
       for(int i=start; i<start+max; i++)  System.out.print(i+","); 
       System.out.println(); 
       return max; 
    } 
} 