import java.util.*;
public class ArrayCC{
    public static void update(int number[]){
        for(int i=0; i<number.length; i++){
            number[i] = number[i] +1;
        }
    }
    public static void main(String args[]){
        //int marks[] = new int[50];

        int number[] = {1,2,3};

        //String fruits[] = {"apple","banana","mango"};
        Syso
        update(number);
         // to print our marks
         for(int i=0; i<number.length; i++){
            System.out.print(number[i] + " ");
        }
        System.out.println();

        
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("lenght of array : " + marks.length);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy marks is " + marks[0]);
        System.out.println("chem marks is " + marks[1]);
        System.out.println("maths marks is " + marks[2]);

        marks[2] = 100;
        System.out.println("maths marks is " + marks[2]);
        
        //orr
        marks[2]= marks[2] +1; // we can do *,-,+,/ in the array
        System.out.println("maths marks is " + marks[2]);

        int percentage =  (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage :  " + percentage + "%");
*/
    }
}