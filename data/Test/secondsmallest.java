import java.util.Scanner;

class secondsmallest{
	public static void main(String args[]) {
		int temp=0,i=0,j=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Find The Second Smallest Number From the Given Array \n Enter the size of array : ");
		int size = sc.nextInt();
		int array[] = new int[size];
/*
Read Array
	size = Array Length
*/
		for( i=0 ; i<size ; i++ ) {
			System.out.print(" Element "+i+" : ");
			array[i] = sc.nextInt();
		}
/*
Display Read Array
*/
		System.out.print(" Array : ");
		for( i=0 ; i<size ; i++ ) {
			System.out.print( array[i]+"  " ); 
		}
/*
Sort Array 
*/
		for ( i=0 ; i<size ; i++ ) {
			for ( j=1 ; j<(size-i) ; j++ ) {
				if ( array[j-1]>array[j] ) {
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("\nThe Second Smallest Element In The Given Array Is : "+array[1]+"\n");
	}
}
