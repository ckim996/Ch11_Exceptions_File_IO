import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/*
"Writes Hello to Append.dat file"
 */

public class Append
{
    public static void main(String[] args) throws Exception
    {
        // Writing data to a file
        FileOutputStream fStream = new FileOutputStream("Append.dat");
        DataOutputStream dStream = new DataOutputStream(fStream);

        dStream.writeUTF("Hello");
        dStream.close();
    }
}
