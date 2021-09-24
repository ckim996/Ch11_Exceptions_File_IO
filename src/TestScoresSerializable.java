import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestScoresSerializable
{
    public static void main(String[] args) throws InvalidTestScore, IOException {
        final int num_test = 5;
        Scanner kb = new Scanner(System.in);

        double[] testScores = new double[num_test];
        TestScores t = new TestScores(testScores);

        for(int i = 0; i < testScores.length; i++)
        {
            System.out.print("Enter test score " + (i+1) + ": ");
            testScores[i] = kb.nextInt();
        }

        FileOutputStream fStream = new FileOutputStream("Test.dat");
        ObjectOutputStream oStream = new ObjectOutputStream(fStream);

        for(int j = 0 ; j < testScores.length; j++)
        {
            oStream.writeObject(testScores[j]);
        }

        oStream.close();
        System.out.println("Objects from testScores array were serialized to Test.dat file");
    }
}
