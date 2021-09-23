import java.io.*;

public class FileArray
{

    public static void main(String[] args) throws IOException {
        int[] arr = {3,4,8,8,5450};
        File file = new File("src/Numbers.dat");

        System.out.println("Writing array to the file...");
        writeArray(file,arr);

        System.out.println("Reading array contents");
        readArray(file,arr);


    }

    public static void writeArray(File f,int[] arr) throws IOException {
        FileOutputStream fStream = new FileOutputStream(f);
        DataOutputStream dStream = new DataOutputStream(fStream);

        for(int i = 0; i < arr.length; i++)
        {
            dStream.writeInt(arr[i]);
        }

        dStream.close();
    }

    public static void readArray(File f, int[] arr) throws IOException {
        boolean endOfFile = false;
        int num;
        FileInputStream fStream = new FileInputStream(f);
        DataInputStream dStream = new DataInputStream(fStream);

        while(!endOfFile)
        {
            try
            {
                num = dStream.readInt();
                System.out.print(num + " ");
            } catch (EOFException e) {
                endOfFile = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        dStream.close();
    }
}
