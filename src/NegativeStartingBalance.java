public class NegativeStartingBalance extends Exception
{
    public NegativeStartingBalance()
    {
        super("ERROR: Negative starting balance");
    }

    public NegativeStartingBalance(double amount)
    {
        super("ERROR: Negative starting balance: " + amount);
    }
}
