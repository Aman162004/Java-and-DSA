package Arrays;

import java.util.Scanner;

public class Basics_2D {
    public static void main(String[] args) {
        /*1 2 3
          3 4 6
          4 5 7
         */

        //int[][] arr = new int[3][3];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr[i].length;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
