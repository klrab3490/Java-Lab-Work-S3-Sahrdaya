import java.util.Scanner;
public class FrequencyLetter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Frequency\nEnter the Word: ");
//Input
		String word=sc.nextLine();
		System.out.print("Enter the letter: ");
		char letter=sc.next().charAt(0);
		int a=word.length(),count=0,i=0;
//Loop
		for (i=0;i<a;i++)
		{
			if(word.charAt(i)==letter)
			{
				count++;			
			}
 		}
//Outut		
		System.out.println("The letter has repeated "+count +" time");
	}
}