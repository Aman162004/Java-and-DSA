package Binary_search;

public class Order_AgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 4, 5, 67, 87, 232, 654};
        int target = 1;
        System.out.println(orderAgnosticBinarySearch(arr, target));
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