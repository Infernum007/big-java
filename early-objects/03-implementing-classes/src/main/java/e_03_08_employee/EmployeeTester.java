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
public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee harry = new Employee("Hacker, Harry", 50_000);
        harry.raiseSalary(10);
        String harrySalary = String.format("%s current salary: $%,.2f",
                harry.getName(), harry.getSalary());

        Employee carl = new Employee("Cracker, Carl", 65_000);
        carl.raiseSalary(5);
        String carlSalary = String.format("%s current salary: $%,.2f",
                carl.getName(), carl.getSalary());

        Employee tony = new Employee("Tester, Tony", 45_000);
        tony.raiseSalary(8);
        String tonySalary = String.format("%s current salary: $%,.2f",
                tony.getName(), tony.getSalary());

        System.out.println(harrySalary);
        System.out.println(carlSalary);
        System.out.println(tonySalary);
    }
}
