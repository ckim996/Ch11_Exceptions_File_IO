import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializableObj
{
    public static void main(String[] args) throws IOException
    {
        double balance;
        final int NUM_ITEMS = 3;

        Scanner kb = new Scanner(System.in);

        BankAccount2[] acc = new BankAccount2[NUM_ITEMS];

        for(int i = 0; i < acc.length; i++)
        {
            System.out.print("Enter the balance for account " + (i+1) + ": ");
            balance = kb.nextDouble();
            acc[i] = new BankAccount2(balance);
        }

        FileOutputStream fStream = new FileOutputStream("Objects.dat");
        ObjectOutputStream oStream = new ObjectOutputStream(fStream);

        // write the serialized objects to the file
        for(int i = 0; i < acc.length; i++)
        {
            oStream.writeObject(acc[i]);
        }

        oStream.close();

        System.out.println("The serialized objects were written to the Objects.dat file");
    }
}
