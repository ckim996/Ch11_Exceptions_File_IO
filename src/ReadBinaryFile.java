import java.io.*;

public class ReadBinaryFile
{
    public static void main(String[] args) throws IOException
    {
        int num;
        boolean endOfFile = false;

        FileInputStream fstream = new FileInputStream("src/" + "Numbers.dat");
        DataInputStream inputFile = new DataInputStream(fstream);

        System.out.println("Reading numbers from the file:");

        while(!endOfFile)
        {
            try{
                num = inputFile.readInt();
                System.out.print(num + " ");
            }catch(EOFException e)
            {
                endOfFile = true;
            }
        }

        System.out.println("\nDone.");
        inputFile.close();
    }
}
