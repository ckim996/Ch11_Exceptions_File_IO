import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile
{
    public static void main(String[] args) throws IOException
    {
        int[] num = {2,4,6,8,10,12,14};

        FileOutputStream fstream = new FileOutputStream("src/" + "Numbers.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing the numbers to the file...");

        for(int i = 0; i < num.length; i++)
        {
            outputFile.writeInt(num[i]);
        }

        System.out.println("Done.");
        outputFile.close();
    }
}
