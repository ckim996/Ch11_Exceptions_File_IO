import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*

 */

public class Append3
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fStream = new FileOutputStream("Append.dat",true);
        DataOutputStream dStream = new DataOutputStream(fStream);

        dStream.writeUTF("World");
        dStream.close();
    }
}
