/*public class linear_search{
    public static int linearsearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if(number[i]==key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int number[] ={1,2,3,4,5,6,7,8,9,10};
        int key = 10;

        int index = linearsearch(number,key);
        if(index==-1){
            System.out.print("not found");

        } else{
            System.out.print("Key is found at index : "  + index);
        }
        System.out.println();

    }
}


public class linear_search{
    public static String linearsearch(String menu[], String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        String menu[] ={"dosa","coke","chilipotato","icecream","idli"};
        String key = "coke";

        String index = linearsearch(menu,key);
        if((int)index==-1){
            System.out.print("not found");

        } else{
            System.out.print("Key is found at index : "  + index);
        }
        System.out.println();

    }
}

// Largest no in an array
import java.util.*;
public class linear_search{
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;


        for(int i=0; i<number.length; i++){
            if(largest< number[i]){
                largest = number[i];
            }
            if(smallest> number[i]){
                smallest = number[i];
            }

        }
        System.out.println("Smallest no is " + smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,3,4,5,6,7,8,9,0};
        
        System.out.println(getLargest(number));

    }
}*/

//Binary search

public class linear_search{
    public static int binarySearch(int number[], int key){
        int start =0;
        int end = number.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(number[mid]==key){ //found
                return mid;
            }
            if(number[mid]<key){//right
                start = mid+1;
            }
            else{//left
                end = mid -1;
            }

        }
        return -1;

        //Reverse an array
    }
    public static void reverseArray(int number[]){
        int first = 0; int last = number.length-1;
        while(first<last){
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;

            first++;
            last--;
        }
    }

    //pairs in an array
    public static void pair(int number[]){
        int totalpairs = 0;
        for(int i=0; i<number.length; i++){
            int curr = number[i];
            for(int j=i+1; j<number.length; j++ ){
                System.out.print("(" + curr + "," + number[j] + ") ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are" + totalpairs);
    }

    public static int ceil(int arr[], int target) {
        int  s = 0;
        int e = arr.length-1;
        int mid = s+ (e-s)/2;
        while(s<=e) {
            if(target < arr[mid]) {
                e  =mid-1;
            }
            else if (target > arr[mid]) {
                s= mid+1;
            }
            else {
                return mid;
            }
        }
        return s;
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5,6,7,8,9,11,12,13,14};
        int key = 10;
        //System.out.println("Index for key is "  + binarySearch(number,key));
        //reverseArray(number);
        int ans = ceil(number, key);
        System.out.println(ans);
        // for(int  i =0; i<10;i++) {
            // System.out.println(i + " ");
        // }


        /*//printing the array
        System.out.println(" Reverse array is");
        for(int i=0; i<number.length; i++){
            
            System.out.print(number[i] + " ");
        }
        System.out.println();*/
        //pair(number);

    }
}