package Binary_search;

public class Smallest_letter {
    public static void main(String[] args) {
        char[] arr={'a','e','f','h'};
        char target = 'g';
        System.out.println(smallest(arr,target));
    }
    static int smallest(char[] arr, char target){
        int start = 0;
        int end = arr.length-1;
        if (end>arr.length){
            return -1;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<=arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
