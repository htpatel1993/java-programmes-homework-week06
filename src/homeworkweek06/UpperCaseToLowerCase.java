package homeworkweek06;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class UpperCaseToLowerCase {

    // Declare Main method
    public static void main(String[] args) {
        char Name; //Create variable.
        System.out.println("Enter any characters");//
        Scanner convert = new Scanner(System.in);
        Name = convert.next().charAt(0);//Variable convert to Lowercase.
        if (Name >= 'A' & Name <= 'Z') {
            Name = Character.toLowerCase(Name);
            System.out.println("Lowercase  " + Name);
            convert.close();

        }
    }
}

