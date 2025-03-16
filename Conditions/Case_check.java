package Conditions;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Character");
        char ch = in.next().trim().charAt(0);
        if (ch>='a'&&ch<='z'){
            System.out.print("The character is small case");
        }if (ch>='A'&&ch<='Z'){
            System.out.print("The character is Large case");
        }
    }
}
