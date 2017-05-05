package p_03_10_HelloWorld_OOP;

/**
 * Demo of the {@code Greeter} class.
 */
public class GreeterDemo
{
    public static void main(String[] args)
    {
        Greeter greeter = new Greeter("Dave");

        System.out.print("Greeter: ");
        System.out.println(greeter.sayHello());

        System.out.print("Refuse: ");
        System.out.println(greeter.refuseHelp());

        System.out.print("Goodbye: ");
        System.out.println(greeter.sayGoodbye());
    }
}
