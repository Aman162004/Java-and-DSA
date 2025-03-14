package Binary_search;

public class Ceiling_no {
    public static void main(String[] args) {
        int[] arr={1,2,2,4,5,6,7,9};
        int target = 8;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr,int target){
        //Ceiling = smallest element in array which is greater than or equal to target
        if (target>arr[arr.length-1]){
            System.out.println("Number not found");
        }
        int start = 0;
        int end = arr.length;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else if (target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
}
