import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        FileReader fr = new FileReader("Sample.txt");
        FileWriter fw = new FileWriter("NewSample.txt");
        
        while ((ch = fr.read())!=-1)
        {
            System.out.print((char)ch);
            fw.write((char)ch);
        }
        fr.close();
        fw.close();
    }

}

