import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile
{
    public static void main(String[] args)
    {
        File file;
        Scanner sc = new Scanner(System.in);
        Scanner inputFile;
        String fileName;

        System.out.print("Enter name of file: ");
        fileName = sc.nextLine();

        try
        {
            file = new File("src/" + fileName);
            inputFile = new Scanner(file);
            System.out.println(fileName + " is found");
        }catch(FileNotFoundException e) // could also be catch(Exception e)
        {
            System.out.println(fileName + " is not found");
            System.out.println(e.getMessage());
        }

    }
}
