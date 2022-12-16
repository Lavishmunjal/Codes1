public class binarysearch {
    public static int search(int arr[], int target) {
        int s = 0;
        int e =arr.length-1;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid] > target) {
                e = mid-1;
            }
            else if(arr[mid] < target) {
                s = mid+1;
            }
            else {
                return mid;
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,6,7,8};
        int target = 5;
        int ans = search(arr,target);
        System.out.println(ans);

    }
    
}
