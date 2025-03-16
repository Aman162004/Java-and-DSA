package Conditions;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        if (a==10){
            System.out.println("The Number is 10");
        }
        else{
            System.out.println("The number is not 10");
        }
    }
}
