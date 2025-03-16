package Conditions;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter the name of the fruit");
        // Press option and Enter button to change its formate
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.print("It's the king of fruits");
            case "Apple" -> System.out.print("It's a red fruit");
            case "Orange" -> System.out.print("Round fruit");
            case "Grapes" -> System.out.print("small fruit");
            default -> System.out.print("Please Enter a valid fruit");
        }
    }
}

