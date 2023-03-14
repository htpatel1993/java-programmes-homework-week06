package homeworkweek06;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

//Declare one instance and one static variable.
public class Ans03InstanceVariableStaticVariable {
    static int x = 25;
    int y = 15;

    //Declare one main method.
    public static void main(String[] args) {
        Ans03InstanceVariableStaticVariable obj = new Ans03InstanceVariableStaticVariable();
        //Call instance and static variables into both instance and static methods .
        obj.myMethod1();
        myMethod2();
    }


    public void myMethod1() {
        System.out.println("Instance Method");  //Declare Instance Methods
        System.out.println(x);
        System.out.println(y);
    }

    public static void myMethod2() {
        Ans03InstanceVariableStaticVariable obj = new Ans03InstanceVariableStaticVariable();
        System.out.println("Static Method");// Declare Static Method
        System.out.println(x);
        System.out.println(obj.y);


    }
}
