package e_18_17_modifiy_e18_15_append_elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Modify the method of Exercise E18.15 so that it leaves
 * the first array list unchanged and returns a new array
 * list containing the elements of both array lists.
 */
public class AppendGenericArraysElements
{
    public static void main(String[] args)
    {
        // Test strings

        List<String> a = new ArrayList<>();
        a.add("Tony");
        a.add("Carl");

        List<String> b = new ArrayList<>();
        b.add("Carl");
        b.add("Harry");
        b.add("Tony");
        b.add("Tony");

        List<String> strings = append(a, b);

        System.out.println(strings);
        System.out.println("Size: " + strings.size());

        // Test integers

        List<Integer> m = new ArrayList<>();
        m.add(1);
        m.add(2);

        List<Integer> n = new ArrayList<>();
        n.add(3);
        n.add(4);
        n.add(4);
        n.add(5);

        List<Integer> integers = append(m, n);

        System.out.println(integers);
        System.out.println("Size: " + integers.size());

        // Compilation error

//        List<Object> intsAndStrings = append(a, n);
    }

    /**
     * Appends the elements of array list b to the array list a.
     *
     * @param a   array list
     * @param b   array list
     * @param <E> the type of elements to append
     */
    public static <E> List<E> append(List<E> a, List<E> b)
    {
        List<E> elements = new ArrayList<>(a);
        elements.addAll(b);
        return elements;
    }
}
