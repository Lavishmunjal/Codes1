/*public class Subarray{
    public static void printsubarray(int number[]){
        int totalpairs =0;
        for(int i = 0; i<number.length; i++){
            int start = i;
            
            for(int j= i; j<number.length; j++){
                int end =j;
                int sum = 0;
                
                for(int k= start; k<=end; k++){
                    System.out.print(number[k] + " ");
                    
                    
                    
                    

                    

                    
                } 
                
                
                totalpairs++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total pairs are " + totalpairs);
    }


    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        printsubarray(number);

    }
}*/



//MAX subarray sum -I(Brute Force)

/*public class Subarray{
    public static void maxsubarray(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE; 
        for(int i = 0; i<number.length; i++){
            int start = i;
            
            for(int j= i; j<number.length; j++){
                int end =j;
                int sum = 0;
                
                for(int k= start; k<=end; k++){
                    
                    sum = sum  + number[k];
                    
                }
                System.out.println(sum);
                if(maxsum < sum){
                    maxsum = sum;
                } 
                if(minsum>sum){
                    minsum = sum;
                }
                
            }
        }
        System.out.println("Maximum sum  are " + maxsum);
        System.out.println("Minimum sum  are " + minsum);
        

    }


    public static void main(String args[]){
        int number[] = {2,4,6,8,10};
        maxsubarray(number);

    }
}

// MAX SUBARRAY -II (PREFIX SUM)

import java.util.*;
public class Subarray{
    public static void maxsubarray(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int prefix[] =  new int[number.length];
        prefix[0] = number[0];

        //calculate prefix array
        for(int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] +number[i];
            System.out.println(prefix[i]);
        }

        for(int i = 0; i<number.length; i++){
            int start = i;
            
            
            for(int j= i; j<number.length; j++){
                int end =j;
                int sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start-1];
                
                
                
                if(maxsum < sum){
                    maxsum = sum;
                } 
                if(minsum>sum){
                    minsum = sum;
                }
                
            }
        }
        System.out.println("Maximum sum  are " + maxsum);
        System.out.println("Minimum sum  are " + minsum);
        

    }


    public static void main(String args[]){
        int number[] = {1,-2,6,-1,3};
        maxsubarray(number);

    }
}*/

// MAX SUBARRAY -III (KADANE'S ALGORITHM)
import java.util.*;
public class Subarray{
    public static void kadane(int number[]){
        int maxsum = Integer.MIN_VALUE;
        int cs = 0;
        
        for(int i = 0 ; i<number.length; i++){
            cs = cs + number[i];
            if(cs<0){
                cs = 0;
                

            }
            

            maxsum = Math.max(cs, maxsum);
        }
        System.out.println("Maximum sum :"  +  maxsum);


        
        

    }
    public static void main(String args[]){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(number);

    }
}