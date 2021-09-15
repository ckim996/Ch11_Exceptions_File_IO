public class AccountTest
{
    public static void main(String[] args)
    {
        try
        {
            //BankAccount b = new BankAccount(123.0);
            BankAccount b = new BankAccount("-123.0");
        }catch(NegativeStartingBalance e)
        {
            System.out.println(e.getMessage());
        }
    }
}
