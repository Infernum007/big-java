package e_03_08_Employee;

/**
 * Implement a class {@code Employee}. An employee has a name (a string) and a
 * salary (a double). Provide a constructor with two arguments
 * <p><pre>
 *      public Employee(String employeeName, double currentSalary)</pre>
 * and methods
 * <p><pre>
 *      public String getName()
 *      public double getSalary()
 *      public void raiseSalary(double byPercent)</pre>
 * These methods return the name and salary, and raise the employee's salary by
 * a certain percentage. Sample usage:
 * <p><pre>
 *      Employee harry = new Employee("Hacker, Harry", 50000);
 *      harry.raiseSalary(10); // Harry gets a 10 percent raise</pre>
 * Supply an {@code EmployeeTester} class that tests all methods.
 */
public class Employee
{
    private String name;
    private double salary;

    /**
     * Constructs an Employee class with name and salary as parameters.
     *
     * @param employeeName  the employee name
     * @param currentSalary the salary
     */
    Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }

    /**
     * Gets the name of the employee.
     *
     * @return the name
     */
    String getName()
    {
        return name;
    }

    /**
     * Gets the salary of the employee.
     *
     * @return the salary
     */
    double getSalary()
    {
        return salary;
    }

    /**
     * Raises employee's salary by a given percent.
     *
     * @param byPercent the percent to raise the salary
     */
    void raiseSalary(double byPercent)
    {
        salary = salary + ((salary * byPercent) / 100);
    }
}
