package Conditions;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int a = in.nextInt();
        System.out.println("Enter the 2nd Number");
        int b = in.nextInt();
        System.out.println("Enter the 3rd Number");
        int c = in.nextInt();
        if (a>b && a>c){
            System.out.println("Largest number is "+a);
        }
        else if (b>a && b > c){
            System.out.println("Largest number is "+b);
        }
        else {
            System.out.println("Largest number is "+c);
        }
    }
}
