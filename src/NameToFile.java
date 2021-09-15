import java.io.*;

public class NameToFile
{
    public static void main(String[] args) throws IOException
    {
        String name = "Ericka";
        System.out.println("Storing the name " + name);
        FileOutputStream fstream = new FileOutputStream("src/" + "name.dat");
        DataOutputStream outputFile = new DataOutputStream(fstream);

        System.out.println("Writing the name to the file");
        outputFile.writeUTF(name);
        System.out.println("done.");
        outputFile.close();

    }
}
