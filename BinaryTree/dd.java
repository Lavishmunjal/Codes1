import java.util.Scanner;

public class Nos {
    static String digits[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printDigits(int number){
        if(number==0){
            return ;
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