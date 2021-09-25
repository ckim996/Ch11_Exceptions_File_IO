import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;

/*
"Reads content inside Append.dat file"
 */

public class Append2
{
    public static void main(String[] args) throws Exception
    {
        boolean endOfFile = false;
        String str;
        FileInputStream fStream = new FileInputStream("Append.dat");
        DataInputStream dStream = new DataInputStream(fStream);

        while(!endOfFile)
        {
            try
            {
                str = dStream.readUTF();
                System.out.print(str + " ");
            }catch(EOFException e)
            {
                endOfFile = true;
            }
        }
        dStream.close();
    }
}
