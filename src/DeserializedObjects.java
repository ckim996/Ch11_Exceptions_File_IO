import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializedObjects
{
    public static void main(String[] args) throws Exception
    {
        double balance;
        final int NUM_ITEMS = 3;

        FileInputStream fStream = new FileInputStream("Objects.dat");
        ObjectInputStream oStream = new ObjectInputStream(fStream);

        BankAccount2[] acc = new BankAccount2[NUM_ITEMS];

        for(int i = 0 ; i < acc.length; i++)
        {
            acc[i] = (BankAccount2) oStream.readObject();
        }

        oStream.close();

        for(int i = 0; i < acc.length; i++)
        {
            System.out.println("Account " + (i+1) + ": $" + acc[i].getBalance());
        }
    }
}
