import java.util.Scanner;

class bubblesort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int temp=0;
		System.out.print("Bubble Sort\n Enter size of array : ");
		int size = sc.nextInt();
/*
Read Array
	size = array length	
*/
		int arrayA[] = new int[size];
		for ( int i=0 ; i<size ; i++ ) {
			System.out.print("Element"+i+" : ");
			arrayA[i] = sc.nextInt();
		}
/*
Display Array
*/
		System.out.print("\nArray Before Sorting : ");
		for ( int i=0 ; i<size ; i++ ) {
			System.out.print(arrayA[i]+" ");
		}
/*
Bubble Sort
	size = array length
*/
		int arrayB[] = new int[size];
		arrayB=arrayA;
		for ( int i=0 ; i<size ; i++ ) {
			for ( int j=1 ; j<(size-i) ; j++ ) {
				if ( arrayB[j-1]>arrayB[j] ) {
					temp = arrayB[j-1];
					arrayB[j-1] = arrayB[j];
					arrayB[j] = temp;
				}
			}
		}
/*
Display Array
*/
		System.out.print("\nArray After Sorting : ");
		for ( int i=0 ; i<size ; i++ ) {
			System.out.print(arrayB[i]+" ");
		}		
		System.out.print("\n");
	}
}
