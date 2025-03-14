package Binary_search;

public class Floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,7,12,43,54};
        int target = 3;
        System.out.println(floor(arr,target));
    }
    static int floor(int[] arr,int target){
        //floor=greatest number smaller or equal to target
        int start=0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while (start<end){
            if (target<arr[mid]){
                end=mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else return mid;
        }
        return end;
    }
}
