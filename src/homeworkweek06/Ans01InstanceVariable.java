package homeworkweek06;

/**
 * Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Ans01InstanceVariable {
    //Declare two instance variables.
    int x = 5;
    int y = 10;
    //Declare one instance method.

    public static void main(String[] args) {
        Ans01InstanceVariable obj = new Ans01InstanceVariable();
        obj.myMethod();// Call instance method in main method


    }

    // declare instance method
    public void myMethod() {
        System.out.println("Instance Method");
        System.out.println(x);
        System.out.println(y);
    }


}
