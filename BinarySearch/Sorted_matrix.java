package Binary_search;

import java.util.Arrays;

public class Sorted_matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,5)));
    }

    //Search in the row provided between the cols provided
    static int[] binary_search(int[][] matrix, int row, int cstart, int cend, int target){
        while (cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if (matrix[row][mid]<target){
                cstart=mid-1;
            }else {
                cend=mid+1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length-1;    //be cautious, matrix maybe empty
        if (rows==1){
            return binary_search(matrix,0,0,col,target);
        }

        int rstart = 0;
        int rend = rows-1;;
        int cmid = col/2;

        //run the loop till 2 rows are remaining
        while (rstart<(rend-1)){
            int mid = rstart+(rend-rstart)/2;
            if (matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if (matrix[mid][cmid]<target){
                rstart=mid;
            }else {
                rend=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the column
        if (matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }if (matrix[rstart][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //Search in the 1st half
        if (target<=matrix[rstart][cmid-1]){
            return binary_search(matrix,rstart,0,cmid-1,target);
        }
        //Search in the 2nd half
        if (target>=matrix[rstart][cmid+1]&&target<=matrix[rstart][cmid+1]){
            return binary_search(matrix,rstart,cmid+1,col-1,target);
        }
        //Search in the 3rd half
        if (target>=matrix[rstart][cmid+1]&&target<=matrix[rstart][cmid+1]){
            return binary_search(matrix,rstart,cmid+1,col-1,target);
        }
        //Search in the 4th half
        else {
            return binary_search(matrix,rstart+1,cmid+1,col-1,target);
        }
    }
}
