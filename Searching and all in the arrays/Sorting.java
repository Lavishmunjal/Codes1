public class Sorting{
    public static void bubblesort(int arr[]){
        for(int turn =0; turn<arr.length-1; turn++){
            int swap = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                //for arrange in Ascending order
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                    

                }
                
                //for arrange in descending order
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
                

            }
            
            System.out.println(swap);
            
            
        }
    }
    public static void printArr(int arr[]){
        for(int i= 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
            
            
        }

    }  
    public static void selectioSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insertionSort(int arr[]){
        for(int i= 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //findind the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
         int j=0;
        for(int i = 0; i<count.length; i++){
            while(count[i] >0){
                arr[j] = i;
                j++;
                count[i]--;
            }

        }

    }


    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
       // bubblesort(arr);
        //selectioSort(arr);
        //insertionSort(arr);
        countingSort(arr);
        printArr(arr);

    }
}




