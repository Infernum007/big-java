package p_03_10_HelloWorld_OOP;

/**
 * In this project, you will explore an object-oriented alternative to the
 * "Hello, World" program in Chapter 1.
 * <p>
 * Begin with a simple {@code Greeter} class that has a single method, {@code
 * sayHello}. That method should <em>return</em> a string, not print it. Create
 * two objects of this class and invoke their {@code sayHello} methods.
 * Of course, both objects return the same answer.
 * <p>
 * Enhance the {@code Greeter} class so that each object produces a customized
 * greeting. For example, the object constructed as {@code new Greeter("Dave")}
 * should say {@code "Hello, Dave"}. (Use the {@code concat} method to combine
 * strings to form a longer string, or peek ahead at Section 4.5 to see how you
 * can use the + operator for the same purpose.)
 * <p>
 * Add a method {@code sayGoodbye} to the {@code Greeter} class.
 * <p>
 * Finally, add a method {@code refuseHelp} to the {@code Greeter} class.
 * It should return a string such as {@code "I am sorry, Dave. I am afraid I
 * can’t do that."}
 * <p>
 * If you use BlueJ, place two {@code Greeter} objects on the workbench (one
 * that greets the world and one that greets Dave) and invoke methods on them.
 * Otherwise, write a tester program that constructs these objects, invokes
 * methods, and prints the results.
 */
public class Greeter
{
    private String name;

    /**
     * Constructs a Greeter object.
     */
    Greeter(String aName)
    {
        name = aName.concat(".");
    }

    /**
     * Builds a string to say hello.
     *
     * @return the string
     */
    String sayHello()
    {
        return "Hello, " + name;
    }

    /**
     * Builds a string that refuses help.
     *
     * @return the string
     */
    String refuseHelp()
    {
        return "I am sorry, " + name + " I am afraid I can't do that";
    }

    /**
     * Builds a string to say goodbye.
     *
     * @return the string
     */
    String sayGoodbye()
    {
        return "Goodbye, " + name;
    }
}
