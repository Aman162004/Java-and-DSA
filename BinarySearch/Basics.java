package Binary_search;

public class Basics {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,9,10,45,76};
        int target=45;
        System.out.println(binary_search(arr,target));
    }
    static int binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle term
            //int mid = (start+end)/2;     maybe output will wxceed the int range so we will another format
            // (2*start + end - end)/2= start + (end - start)/2
            int mid = start + (end - start)/2;
 
            if (target<arr[mid]){
                end = mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}

