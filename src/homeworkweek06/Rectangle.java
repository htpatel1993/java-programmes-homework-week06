package homeworkweek06;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 * Test Data: Width = 5.5 Height = 8.5
 * Expected Output: Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Rectangle {

    public static void main(String[] strings) {
        double width = 5.6;
        double height = 8.5;
        re(width, height);


    }

    public static void re(double width, double height) {
        double size = width * height;
        double peri = 2 * (width + height);

        System.out.println("Area is  : " + (width + "x" + height) + " = " + size);
        System.out.println("Perimeter is :  " + "2" + " x " + ("(5.6" + "+" + "8.5)") + " = " + peri);
    }

}
