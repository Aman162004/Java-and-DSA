package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Basics_1D {
    public static void main(String[] args) {

    //Syntax
    //datatype[] variable_name = new datatype[size];
    //store 5 roll numbers
//    int[] Roll_nos = new int[5];
//    // or directly
//    int[] Roll_nos2 = {1,2,3,4,5};
//

        int[] RoLL_no;  //declaration of an array
        RoLL_no = new int[5];//initialization: actually here object are created in the memory(heap)
        RoLL_no[1]=1;
        RoLL_no[2]=2;
        RoLL_no[3]=3;
        RoLL_no[4]=4;
        RoLL_no[0]=5;

        for (int i = 0; i<5; i++){
            System.out.print(RoLL_no[i] + " , ");
        }
        String[] arr = new String[6];
        System.out.println(arr[0]);


        //Array of objects
        Scanner in = new Scanner(System.in);
        String[] str = new String[5];
        for (int j=0;j<str.length;j++){
            System.out.print("Enter"+ (j+1) +"Element of the Array");
            str[j]=in.next();
        }
        System.out.print(Arrays.toString(str));
    }
}
