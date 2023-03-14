package homeworkweek06;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class ConvertTemperatureValue {
    public static void main(String[] args) {
        //Declare main method and Temperature in fahrenheit.
        Scanner weather = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit : ");
        double fahrenheit = weather.nextDouble();
        ConvertTemperatureValue obj = new ConvertTemperatureValue(); //Call to Instance method in Main Method
        obj.weather(fahrenheit);
        weather.close();

    }

    public void weather(double fahrenheit) {
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0); //Declare Instance Method
        System.out.println(fahrenheit + "Temperature in fahrenheit :" + celsius + " In Celsius");


    }


}
