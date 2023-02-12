import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizer
{
	public static void main(String args[])
	{
		int n,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("String Tokenizer\nEnter The String : ");
		String t=s.nextLine();
		StringTokenizer st = new StringTokenizer(t," ");
		while (st.hasMoreTokens()) 
		{
			String temp = st.nextToken();
			n = Integer.parseInt(temp);
			sum = sum+n;
			System.out.println(n);
		}
		System.out.print("Sum ="+sum);
		s.close();
	}
}
