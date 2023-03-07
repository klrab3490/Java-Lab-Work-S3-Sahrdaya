import java.util.Scanner;
import java.io.*;

class file {
    private static void main(String[] args) 
    	throws IOException {
        File f = new File("Sample.txt");
        FileInputStream fread = new FileInputStream(f);
        InputStreamReader ir = new InputStreamReader(fread);
        BufferedReader br = new BufferedReader(ir);
        int line=0;
        int wordCount=0;
        int character=0;
        int para=0;
        String a;
        while ( (a = br.readLine())!=null ) {
            if ( a.equals("") ) {
                para++;
            }
            else {
                line++;
                character += a.length();				
                String words[] = a.split("\\s+"); 
                wordCount += words.length;
            }
        }
    }
}
