import java.util.Scanner;

class primecheck {
	public static void main(String args[]) {
		int i=0,prime=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("To Check Whether The Number Is Prime Or Not\n Enter The Number : ");
		int number = sc.nextInt();
		if ( number!=1 ) {
			for ( i=2 ; i<number ; i++ ) {
				if (( number%i ) ==0) {
					prime=0;
				}
			}
			if ( prime == 1 ) {
				System.out.print(number+" Is A Prime Number\n");
			}
			else {
				System.out.print(number+" Is Not A Prime Number\n");
			}
		}
		else {
			System.out.print("1 Is Either Prime Or Composite \n");
		}
	}
}
