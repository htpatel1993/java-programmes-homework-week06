package homeworkweek06;

import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Calculator {
    // Declare Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First value : ");
        int a = scanner.nextInt();
        System.out.println("Enter Second value : ");
        int b = scanner.nextInt();
        addition(a, b); //Call all static method into the main method
        subtraction(a, b);
        Calculator obj = new Calculator();
        obj.multiplication(a, b);
        obj.division(a, b);
        scanner.close();
    }

    public static void addition(int m, int n) {
        int ans = m + n;
        System.out.println("Addition of two number : " + ans); //Declare  two Static Method.
    }

    public static void subtraction(int m, int n) {
        int ans = m - n;
        System.out.println("Subtraction of two number : " + ans);
    }

    public void multiplication(int m, int n) {
        int ans = m * n;
        System.out.println("Multiplication of two number : " + ans); //Declare two instance method.
    }

    public void division(int m, int n) {
        int ans = m / n;
        System.out.println("Division of two number : " + ans);
    }
}
