import java.io.IOException;
import java.io.RandomAccessFile;

/*

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17...
a b c d e f g h i j k  l  m  n  o  p  q  r ...

 */

public class ReadRandomLetters
{
    public static void main(String[] args) throws IOException
    {
        final int CHAR_SIZE = 2;    // 2 byte characters
        long byteNum;               // The byte number
        char ch;                    // A character from the file

        RandomAccessFile randomFile = new RandomAccessFile("Letters.dat","r");

        // Move to the character 5. This is the 6th character from the beginning of the file
        // should be letter f
        byteNum = CHAR_SIZE * 5;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);

        // Move to character 10 (the 11th character and display it)
        // should be letter k
        byteNum = CHAR_SIZE * 10;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);

        // Move to character 3 (the 4th character), read and display
        // should be letter d
        byteNum = CHAR_SIZE * 3;
        randomFile.seek(byteNum);
        ch = randomFile.readChar();
        System.out.println(ch);

        randomFile.close();
    }
}
