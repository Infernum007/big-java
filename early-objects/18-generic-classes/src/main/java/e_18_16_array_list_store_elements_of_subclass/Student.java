package e_18_16_array_list_store_elements_of_subclass;

/**
 * {@code Student} class.
 */
public class Student extends Person
{
    private String course;

    public Student(final String firstName, final String lastName, final int age, final String course)
    {
        super(firstName, lastName, age);
        this.course = course;
    }

    public String getCourse()
    {
        return course;
    }
}
