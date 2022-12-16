public class Recursio{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);


    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n + " ");
            return;

        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int fact(int n){
        if(n ==0){
            return 1;
        }
        int fnm = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static int sumnnatno(int n){
        if (n == 1){
            return 1;

        }
        int sumnm = sumnnatno(n-1);
        int sumn = n + sumnm;
        return sumn; 

    }
    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }
    public static int FirstOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
        

    }
    public static int LastOccurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = LastOccurence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;
               //or
        return x * power(x, n-1);       
    }
    // OPTIMED CODE OF POWER
    public static int optimizedpower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedpower(a, n/2);
        int halfpowersqr = halfpower * halfpower;

        //n is odd
        if(n%2!=0){
            halfpowersqr = a * halfpowersqr;
        }
        return halfpowersqr;
    }
    public static int tilingproblem(int n){
        //base case
        if( n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical
        int fnm1 = tilingproblem(n-1);

        //horizontal
        int fnm2 = tilingproblem(n-2);
        int totways = fnm1 + fnm2;
        return totways;

    }
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void printBinStrings(int n, int lastplace,  String str){
        if(n==0){
            System.out.println(str);
            return;


        }
        printBinStrings(n-1, 0, str + "0");
        if(lastplace == 0){
            printBinStrings(n-1, 1, str + "1");
        }
    }
    public static void main(String args[]) {
        
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int n=5;
        String str = "appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        //printDec(n);
        //intInc(n);
     // //     System.out.println(fact(n));
     //     System.out.println(sumnnatno(n));
     //     System.out.println(issorted(arr, 0));
        // System.out.println(FirstOccurence(arr, 5, 0));
        // System.out.println(LastOccurence(arr, 5, 0));
        // System.out.println(power(2, 10));
         //System.out.println(optimizedpower(2, 10));
         System.err.println(tilingproblem(5));
        //System.out.println(friendsPairing(3));
        printBinStrings(4, 0, "");
    }
}
