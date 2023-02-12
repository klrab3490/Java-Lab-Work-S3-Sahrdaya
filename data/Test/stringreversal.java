import java.util.Scanner;

public class stringreversal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("String Reversal\nEnter The String : ");
        String a = sc.next();
        int b = a.length();
        System.out.print("Reversed String : ");
        for(int i=0;i<=b;i++)
        {
            System.out.print(a.charAt(i));
        }
        sc.close();
    }
}