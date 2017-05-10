package e_18_12_iterable;

import java.util.HashSet;

/**
 * Write a generic static method {@code print} that prints the elements of any
 * object that implements the {@code Iterable<E>} interface. The elements should
 * be separated by commas. Place your method into an appropriate utility class.
 */
public class IterableDemo
{
    public static void main(String[] args)
    {
        HashSet<String> list = new HashSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        IterableUtil.print(list);
    }
}
