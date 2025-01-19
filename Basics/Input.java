package baasic;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);     //It's the input format for any data from system and in means keyboard
        System.out.print("Please Enter Your Roll Number: ");
        int roll_no = input.nextInt();
        System.out.println("Your roll number is " + roll_no);
        int number = 'A';
        System.out.println(number);
    }
}
