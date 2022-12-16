import java.util.*;
public class bitwise{
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) ==0){
            System.out.println("even number");

        }else{
            System.out.println("odd number");
        }
    }
    public static int getIthbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) ==0){
            return 0;

        }else{
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitmark = 1<<i;
        return n|bitmark;
    }
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n&bitmask;
    }
    public static int updateIthbit(int n, int i , int newbit){
       /* if(newbit == 0){
            return clearIthBit(n,i);
        
        }else{
            return setithbit(n,i);
        }
*/
        //2nd method
        n =clearIthBit(n,i);
        int Bitmask = newbit<<i;
        return n|Bitmask;
    }
    public static int clearIbit(int n , int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static int clearrangebit(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i) -1;
        int bitmask = a|b;
        return n&bitmask;
    }
    public static boolean ispoweroftwo(int n){
        return (n & (n-1)) ==0;
    }
    public static int countsetbits(int n){
        int count =0;
        while(n>0){
            if ((n&1)!=0){
                count++;
            

            }
            n = n>>1;

        } 
        return count;
    }
    public static int fastExp(int a, int n){
        int ans =1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;

        }
        return ans;
    }

    public static void main(String args[]){
        /*System.out.println((5 & 6));
        System.out.println((5 | 6));
        System.out.println((5 ^ 6));
        System.out.println((~5));
        System.out.println((~0));
        System.out.println((5 << 2));
        System.out.println((6>>1));*/
        //oddoreven(3);
        //oddoreven(11);
       // System.out.println(getIthbit(10,2));
        //System.out.println(setithbit(10,2));
       // System.out.println(clearIthBit(10,1));
        //System.out.println(updateIthbit(10,2,1));
        //System.out.println(clearIbit(15,2));
        //System.out.println(clearrangebit(10,2,4));
        //System.out.println(ispoweroftwo(10));
        //System.out.println(countsetbits(10));
        System.out.println(fastExp(3,5));

    }
}