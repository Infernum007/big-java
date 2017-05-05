package p_03_04_Student;

/**
 * Implement a class {@code Student}. For the purpose of this exercise,
 * a student has a name and a total quiz score. Supply an appropriate
 * constructor and methods {@code getName()}, {@code addQuiz(int score)},
 * {@code getTotalScore()}, and {@code getAverageScore()}. To compute the
 * average, you also need to store the <em>number of quizzes</em> that the
 * student took.
 * <p>
 * Supply a {@code StudentTester} class that tests all methods.
 */
public class Student
{

    private String name;
    private int totalScore;
    private int quizNumber;

    /**
     * Constructs a student with a given name.
     *
     * @param aName student's name
     */
    Student(String aName)
    {
        name = aName;
        totalScore = 0;
        quizNumber = 0;
    }

    /**
     * Gets the name of the student.
     *
     * @return the name
     */
    String getName()
    {
        return name;
    }

    /**
     * Adds a score to the total score.
     *
     * @param score quiz score
     */
    void addQuiz(int score)
    {
        totalScore += score;
        quizNumber++;
    }

    /**
     * Gets total quiz score.
     *
     * @return total score
     */
    int getTotalScore()
    {
        return totalScore;
    }

    /**
     * Gets the average score dividing total score by number of quizzes taken.
     *
     * @return average score
     */
    int getAverageScore()
    {
        return totalScore / quizNumber;
    }
}
