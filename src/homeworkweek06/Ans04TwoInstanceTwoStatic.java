package homeworkweek06;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Ans04TwoInstanceTwoStatic {
    //Declare two instance and two static variables.
    static int m = 30;
    static int n = 40;
    int a = 10;
    int b = 20;

    //Declare the Main method.
    public static void main(String[] args) {
        Ans04TwoInstanceTwoStatic obj = new Ans04TwoInstanceTwoStatic();
        obj.iphone(); //Call both instance and static methods into the Main method
        android();
    }

    //Declare one instance method.
    public void iphone() {
        System.out.println("Instance Method"); //Declare Instance Methods
        Ans04TwoInstanceTwoStatic obj = new Ans04TwoInstanceTwoStatic();//Call all four instance variables
        //inside the main method.
        System.out.println(a);
        System.out.println(b);
        System.out.println(m);
        System.out.println(n);
    }

    //Declare one static method.
    public static void android() {
        Ans04TwoInstanceTwoStatic obj = new Ans04TwoInstanceTwoStatic();//Call all four static variable methods inside
        // the main method.
        System.out.println("Static Method");// Declare Static Method
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(m);
        System.out.println(n);

    }
}