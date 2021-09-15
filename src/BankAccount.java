public class BankAccount
{
    private double balance;

    public BankAccount()
    {
        balance = 0;
    }

    public BankAccount(double startBalance) throws NegativeStartingBalance
    {
        if(startBalance < 0)
            throw new NegativeStartingBalance(startBalance);

        balance = startBalance;
    }

    public BankAccount(String str) throws NegativeStartingBalance
    {
        balance = Double.parseDouble(str);
        if(balance < 0)
            throw new NegativeStartingBalance(balance);
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void deposit(String str)
    {
        balance += Double.parseDouble(str);
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void withdraw(String str)
    {
        balance -= Double.parseDouble(str);
    }

    public void setBalance(double d)
    {
        balance = d;
    }

    public void setBalance(String str)
    {
        balance = Double.parseDouble(str);
    }

    public double getBalance()
    {
        return balance;
    }
}
