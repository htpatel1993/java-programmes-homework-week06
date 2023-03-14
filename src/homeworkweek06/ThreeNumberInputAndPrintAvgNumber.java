package homeworkweek06;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */
//Declare Main Method
public class ThreeNumberInputAndPrintAvgNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in); //Create Scanner Method
        System.out.println("Enter First Number :  ");
        double m = num.nextDouble();
        System.out.println("Enter Second Number : ");
        double n = num.nextDouble();
        System.out.println("Enter Third Number :  ");
        double p = num.nextDouble();
        average(m, n, p);// Call to static method in main method
        num.close();

    }

    public static void average(double m, double n, double p) {
        double x = (m + n + p) / 3;//Declare Static Method
        System.out.println("The average :  " + x);


    }


}
