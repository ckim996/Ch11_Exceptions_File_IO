import java.io.Serializable;

public class TestScores implements Serializable
{
    private double[] scores;

    public TestScores(double[] s) throws InvalidTestScore {
        /*
        for(int i = 0; i < s.length; i++)
        {
            if (s[i] < 0 || s[i] > 100) {
                throw new IllegalArgumentException("Number must be between 0 to 100");
            }
        }

         */
        for(int i = 0; i < s.length; i++)
        {
            if (s[i] < 0 || s[i] > 100) {
                throw new InvalidTestScore();
            }
        }

        scores = s;
    }

    public double average(double[] s)
    {
        double sum = 0;
        double avg;

        for(int i = 0; i < s.length; i++)
        {
            sum += s[i];
        }
        avg = sum / s.length;

        return avg;
    }


}
