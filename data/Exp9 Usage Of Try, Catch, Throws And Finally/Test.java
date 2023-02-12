//Usage Of Try, Catch,throws and finally
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Program To Perform Devision:");
            System.out.print("Enter Number 1: ");
            int a = sc.nextInt();
            System.out.print("Enter Number 2: ");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("Result : "+c);            
        }
        catch ( ArithmeticException e )
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("End Of Operation");
        }
        sc.close();
    }
}