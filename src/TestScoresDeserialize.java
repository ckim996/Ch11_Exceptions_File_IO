import java.io.*;

public class TestScoresDeserialize
{
    public static void main(String[] args) throws Exception {
        FileInputStream fStream = new FileInputStream("Test.dat");
        ObjectInputStream oStream = new ObjectInputStream(fStream);

        TestScores[] t = new TestScores[5];

        for(int i = 0; i < t.length; i++)
        {
            t[i] = (TestScores) oStream.readObject();
        }
        oStream.close();

        for(int j = 0; j < t.length; j++)
        {
            System.out.println("Test score " + (j+1) + ": " + t[j].getScores());
        }

    }
}
