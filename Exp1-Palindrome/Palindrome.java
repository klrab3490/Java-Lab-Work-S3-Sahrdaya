import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Check For Palindrome \nEnter The String: ");
//Input
		String word = s.nextLine();
		int a = word.length(),i=0,flag=0;
//Loop
		for(i=0;i<(a/2);i++)
		{
			if (word.charAt(i)!=word.charAt(a-i-1))
			{
				flag=1;	
				break;		
			}
		}
//Outut
		if (flag==1)
		{
			System.out.println("Not a palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
		s.close();
	}
}