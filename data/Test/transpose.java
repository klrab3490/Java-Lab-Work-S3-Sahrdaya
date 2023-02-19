import java.util.Scanner;

public class transpose{
	public static void main(String args[]){
		int r=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Transpose Of Matrix\n Enter the number of rows : ");
		r = sc.nextInt();
		System.out.print(" Enter the number of colunm : ");
		c = sc.nextInt();
/*
Read Matrix
	r = rows
	c = columns
*/
		int matA[][] = new int[r][c];
		for ( int i=0 ; i<r ; i++ ) {
			for ( int j=0 ; j<c ; j++ ) {
				System.out.print("Mat["+i+"]["+j+"] = ");
				matA[i][j] = sc.nextInt();
			}
		}
/*
Display Matrix
	Read Matrix
*/
		System.out.println("Entered Matrix : ");
		for ( int i=0 ; i<r ; i++ ) {
			for ( int j=0 ; j<c ; j++ ) {
				System.out.print(" "+matA[i][j]);
			}
			System.out.print("\n");
		} 
//Transpose
		int matB[][] = new int[c][r];
		for ( int i=0 ; i<r ; i++ ) {
			for ( int j=0 ; j<c ; j++ ) {
				matB[j][i] = matA[i][j];
			}
		}
//Display Matrix
		System.out.println("Transpose Matrix : ");
		for ( int i=0 ; i<c ; i++ ) {
			for ( int j=0 ; j<r ; j++ ) {
				System.out.print(" "+matB[i][j]);
			}
			System.out.print("\n");
		}
	}
}
