import java.util.Stack;

public class StockSpan {
    public static void stockspan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for(int i = 1;i<stocks.length;i++){
            int currprice = stocks[i];
            while(!s.isEmpty() && currprice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;

            }else{
                int prevhigh = s.peek();
                span[i] = i-prevhigh;
            }
            s.push(i);
        }


    }
    public static void main(String[] args) {
        int stocks[] = {100,80,60,70,60,85,100};
        int span[] = new int[stocks.length];
        stockspan(stocks, span);
        for(int i = 0; i<span.length; i++){
            System.out.println(span[i] + " ");
        }
          
    }
}


import java.util.Scanner;

public class Nos {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if(number==0){
            return ;
        }
        if(number>9){
            System.out.println("Greater than 9");
            return;
        }
        int lastdigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastdigit] + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
    }
    
}