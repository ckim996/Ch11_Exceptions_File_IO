public class InvalidTestScore extends Exception
{
    public InvalidTestScore()
    {
        super("Error: Test scores should be between 0 to 100");
    }

}
