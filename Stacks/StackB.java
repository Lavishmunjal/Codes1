import java.util.*;
public class StackB{
    public static void pushAtbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);
    }
    public static String reversestring(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);

        }
        return result.toString();
    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return; 
        }
        int top = s.pop();
        reverseStack(s);
        pushAtbottom(s, top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        printStack(s);
        //String str = "abc";
        // String result = reversestring(str);
        // System.out.println(result);

        // pushAtbottom(s,4);
        // pushAtbottom(s, 5);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }
        
    }
}