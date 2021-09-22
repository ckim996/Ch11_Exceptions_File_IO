import java.util.Scanner;

public class TestScoreDemo
{
    public static void main(String[] args) throws InvalidTestScore {
        int num_test;
        Scanner kb = new Scanner(System.in);

        System.out.print("How many tests you take: ");
        num_test = kb.nextInt();

        double[] testScores = new double[num_test];

        for(int i = 0; i < testScores.length; i++)
        {
            System.out.print("Test " + (i+1) + ": ");
            testScores[i] = kb.nextDouble();
        }

        TestScores t = new TestScores(testScores);

        System.out.printf("Average score: %.2f",t.average(testScores));
    }
}
