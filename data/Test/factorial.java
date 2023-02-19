import java.util.Scanner;

class factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int j=1;
		System.out.print("Factorial\n Enter The Number : ");
		int number = sc.nextInt();
		for ( int i=number ; i>1 ; i-- ) {
			j=j*number;
		}
		System.out.print("Factorial Of "+number+" is "+j+"\n");
	}
}
