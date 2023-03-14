package homeworkweek06;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */

public class TwoBinaryNumber {
    //Declare Main method
    public static void main(String[] args) {
        Scanner Bia = new Scanner(System.in);
        System.out.println("Enter first binary number :  ");//Print First number
        String first = Bia.next();
        System.out.println("Enter  second binary number : ");//Print Second Number
        String second = Bia.next();
        add(first, second);//call static method
        Bia.close();

    }

    //Declare outside static method
    public static String add(String first, String second) {
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int b3 = b1 + b2;
        System.out.println("Addition of Two binary number" + Integer.toBinaryString(b3));//print sum
        return first;
    }
}
