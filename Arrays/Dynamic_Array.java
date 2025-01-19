package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(45);
        list.add(435);
        list.add(443775);
        list.add(4435);
        list.add(45);
        list.add(455);
        list.add(45);
        list.add(475);
        list.add(45);
        list.add(425);
        list.add(45);
        list.add(45);
        list.add(4875);
        list.add(4554);
        list.add(445655);
        list.add(447565);
        list.add(4576);
        list.add(452524);
        list.add(4523);
        list.add(452);
        list.add(450);

        System.out.println(list);
        System.out.println(list.contains(58769));  //It will check weather it contains this element or not

        list.set(0,99); //It will change value of 0 index
        System.out.println(list);

        list.remove(2); //It will Remove the index number 2
        System.out.println(list);

        //To get item at any index
        for (int i = 0; i<5; i++){
            System.out.println(list.get(i));
        }

        //Add element
//        for (int i = 0; i<3;i++){
//            list.add(new ArrayList<>());
//        }
   }
}
