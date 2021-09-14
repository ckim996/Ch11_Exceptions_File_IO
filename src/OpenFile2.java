import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile2
{
    public static void main(String[] args)
    {
        String fileName;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the file name you want to open: ");
        fileName = sc.nextLine();

        Scanner inputFile = openFile(fileName);
        //System.out.println(inputFile);

        if(inputFile == null)
        {
            System.out.print("File does not exist. Enter the file name: ");
            fileName = sc.nextLine();
            inputFile = openFile(fileName);
        }

    }

    public static Scanner openFile(String fileN)
    {
        Scanner sc;

        try{
            File file = new File("src/" + fileN);
            sc = new Scanner(file);
            System.out.println("File is found");
        }catch(FileNotFoundException e)
        {
            sc = null;
        }
        return sc;
    }
}
