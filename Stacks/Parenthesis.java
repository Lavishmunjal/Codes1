import java.util.*;
public class Parenthesis {

    public static boolean Isvalid(String str){
        Stack<Character> s =new Stack<>();
        for(int  i =0;i<str.length();i++){
            char ch = str.charAt(i);
            // opening 
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);

            }else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch ==')')
                    || (s.peek() == '{' && ch =='}') ||
                    (s.peek() == '[' && ch == ']')){
                        s.pop();

                    
                    }else{
                return false;
            }
        }
    }

        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }


    }
    public static boolean isDuplicate(String str){
        Stack<Character> s =new Stack<>();
        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            //closing
            if(ch==')'){
                int count =0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void maxarea(int arr[]){ //O(n) - Optimised
        int maxarea = 0;
        int nsr[]= new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right  - O(n)
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //Next smaller left - O(n)

        s = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //calculate area : width = j-i-1 = nsr[i] -nsl[i] -1  - O(n)
        for(int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i] -nsl[i] - 1;
            int currArea = height * width;
            maxarea = Math.max(currArea,maxarea);

        }
        System.out.println("max area in histogram " + maxarea);

        

    }

    public static void main(String[] args) {
        //String str  = "({})[]";
        //String str = "((a+b))";
        int arr[] = {2,1,5,6,2,3};
        maxarea(arr);
        //System.out.println(isDuplicate(str));
    }
}
