package homeworkweek06;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class RadiusCircle {
    // Declare Main Method
    public static void main(String[] args) {
        double radius, area;
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the radius value of the circle");
        radius = value.nextDouble();
        value.close();
        area = Math.PI * radius * radius; // Declare Formula
        System.out.println("Area of the circle is : " + area);
        value.close();
    }
}
