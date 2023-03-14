package homeworkweek06;

import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */
public class SwapTwoVariable {
    //Declare Main Method
    public static void main(String[] args) {
        int x, y, z;
        Scanner swap = new Scanner(System.in);

        System.out.println("Input the first number: ");
        x = swap.nextInt();
        System.out.println("Input the second number: ");
        y = swap.nextInt();
        swap.close();

        z = x;
        x = y;
        y = z;

        System.out.println(" Swapped values are : " + x + " and " + y);
    }

}
