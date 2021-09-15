import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadName
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fstream = new FileInputStream("src/" + "name.dat");
        DataInputStream inputFile = new DataInputStream(fstream);
        String name = inputFile.readUTF();
        System.out.println("The name on the file is " + name);
    }
}
