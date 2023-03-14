package homeworkweek06;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class StringToLowerCase {

    //Declare Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: "); //print String
        String line = in.nextLine();//Use Next line Formula
        line = line.toLowerCase();
        System.out.println(line);
        in.close();
    }
}
