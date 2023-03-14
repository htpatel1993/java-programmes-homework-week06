package homeworkweek06;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class CalculateOfTriangle {
    //Declare Main Method.
    public static void main(String[] args) {
        int m, n, p, area;

        System.out.println("Enter value for sides of Triangle");
        Scanner Angle = new Scanner(System.in); // Create Input

        m = Angle.nextInt();
        n = Angle.nextInt();
        p = Angle.nextInt();
        area = (m + n + n) / 2; // Use Formula for area
        area = (area * (area - m) * (area - n) * (area - p));
        System.out.println("Area of Triangle" + area);
        Angle.close();


    }


}
