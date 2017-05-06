package e_18_16_array_list_store_elements_of_subclass;

import java.util.ArrayList;

/**
 * Modify the method of Exercise E18.15 so that the second array list can contain
 * elements of a subclass. For example, if people is an {@code ArrayList<Person>}
 * and students is an {@code ArrayList<Student>}, then {@code append(people, students)}
 * should compile but {@code append(students, people)} should not.
 */
public class AppendGenericArraysElements
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Tony", "Tester", 30));
        people.add(new Person("Carl", "Cracker", 31));
        people.add(new Person("Harry", "Hacker", 32));

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Adam", "Smith", 30, "Computing"));
        students.add(new Student("Tom", "Sawyer", 31, "Law"));
        students.add(new Student("Bob", "The Bob", 32, "Finance"));


        // Will compile
        append(people, students);

        // Will not compile
        // append(students, people);

        for (Person p : people)
        {
            System.out.println(p.getFirstName() + " " + p.getClass().getSimpleName());
        }

    }

    /**
     * Appends the elements of array list b to the array list a.
     *
     * @param a   array list
     * @param b   array list
     * @param <T> the type of elements to append
     */
    public static <T, S extends T> void append(ArrayList<T> a, ArrayList<S> b)
    {
        a.addAll(b);
    }
}
