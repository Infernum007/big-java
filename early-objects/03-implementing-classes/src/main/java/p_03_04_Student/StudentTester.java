package p_03_04_Student;

/**
 * A class to test the {@code Student} class.
 */
public class StudentTester
{

    public static void main(String[] args)
    {
        Student student = new Student("Hacker, Harry");

        student.addQuiz(30);
        student.addQuiz(20);
        student.addQuiz(50);

        String studentName = student.getName();
        int totalScore = student.getTotalScore();
        int averageScore = student.getAverageScore();

        System.out.println(studentName + " total score: " + totalScore);
        System.out.println(studentName + " average score: " + averageScore);
    }
}
