package Binary_search;

public class Find_mountain_array {
    public static void main(String[] args) {

    }

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int start = 0;
//        int end = mountainArr.
//    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firsttry = orderAgnosticBinarySearch(arr,target);
        if (firsttry!=1){
            return firsttry;
        }
        return -1;
    }

    public int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}


