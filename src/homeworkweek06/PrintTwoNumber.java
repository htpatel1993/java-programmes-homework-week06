package homeworkweek06;

import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class PrintTwoNumber {
    //Declare Main Method
    public static void main(String[] args) {
        Scanner Cal = new Scanner(System.in);
        System.out.print("Enter first number: ");//Input First number print
        int num1 = Cal.nextInt();
        System.out.print("Enter second number: ");//Input Second number print
        int num2 = Cal.nextInt();
// Apply all condition below.
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
}
