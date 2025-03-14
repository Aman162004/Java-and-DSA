package Binary_search;

public class Infinite_series {
    public static void main(String[] args) {
    int[] arr = {3,5,7,8,10,67,110,278,576,876,987,1000};
    int target = 576;
    System.out.println(ans(arr,target));
    }
    static int ans(int[] arr, int target){
        //first find range
        //first start with a box of size then simuleniosly we will double the box size
        int start = 0;
        int end = 1;
        int newstart=end+1;
        //condition for the target to lie in the range
        while (target>arr[end]){
            start=newstart;
            end=end*2;
        }
        return binarysearch(arr,target);
    }
    static int binarysearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;
    while (start<=end){
        int mid = start+(end-start)/2;
        if (target<arr[mid]){
            end=mid-1;
        } else if (target>arr[mid]) {
            start=mid+1;
        }else {
            return mid;
        }
    }
    return -1;
    }
}
