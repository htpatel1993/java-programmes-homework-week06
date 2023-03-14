import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 * Input Data: Input a Decimal Number : 5
 * Expected Output: Binary number is: 101
 */
public class DecimalToBinaryNumber {

    //Declare Main method
    public static void main(String args[]) {
        int dec_num, Exam, i = 1, b;//input int
        int bin_num[] = new int[100];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Decimal Number : "); //print decimal number
        dec_num = scan.nextInt();
        Exam = dec_num;
        scan.close();

        while (Exam != 0) {
            bin_num[i++] = Exam % 2;
            Exam = Exam / 2;
        }

        System.out.print("Binary number is: "); //print binary number
        for (b = i - 1; b > 0; b--) {
            System.out.print(bin_num[b]);
        }
        System.out.print("\n");
    }
}
