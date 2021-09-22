import java.io.Serializable;

public class BankAccount2 implements Serializable
{
    private double balance;

    public BankAccount2()
    {
        balance = 0.0;
    }

    public BankAccount2(double startBalance)
    {
        balance = startBalance;
    }

    public BankAccount2(String str)
    {
        balance = Double.parseDouble(str);
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

    public void setBalance(double b)
    {
        balance = b;
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
