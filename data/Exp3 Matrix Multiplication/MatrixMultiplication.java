import java.util.Scanner;
public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		int i=0,j=0;
		Scanner sc = new Scanner(System.in);
/*Reading 1
 input m1,n1
 output A[m][n]
*/
		System.out.print("Matrix A:\n");
		System.out.print("Enter The Number Of Rows In Matrix :");
		int m1=sc.nextInt();
		System.out.print("Enter The Number Of Columns In Matrix :");
		int n1=sc.nextInt();
		int A[][]=new int[m1][n1];
		for (i=0;i<m1;i++)
		{
			for (j=0;j<n1;j++)
			{
				System.out.print("A["+i+"]["+j+"] =");
				A[i][j]=sc.nextInt();
			}
		}
/*Reading 2
 input m2,n2
 output B[o][p]
*/
		System.out.print("Matrix B :\n");
		System.out.print("Enter The Number Of Rows In Matrix :");
		int m2=sc.nextInt();
		System.out.print("Enter The Number Of Columns In Matrix :");
		int n2=sc.nextInt();
		int B[][]=new int[m2][n2];
		for (i=0;i<m2;i++)
		{
			for (j=0;j<n2;j++)
			{
				System.out.print("B["+i+"]["+j+"] =");
				B[i][j]=sc.nextInt();
			}
		}
//Printing 1
		System.out.println("Matrix A:");
		for (i=0;i<m1;i++)
		{
			if (i!=0){System.out.println("");}
			for (j=0;j<n1;j++)
			{
				System.out.print("\t"+A[i][j]);
			}
		}
		System.out.println("");
//Printing 2
		System.out.println("Matrix B:");
		for (i=0;i<m2;i++)
		{
			if (i!=0){System.out.println("");}
			for (j=0;j<n2;j++)
			{
				System.out.print("\t"+B[i][j]);
			}
		}
		System.out.println("");
/*Multipication
 inputA: m1,n1
 inputB: m2,n2
 Printing
*/
		if (m2==n1)
		{
			int C[][]=new int[m1][n2];
			for(i=0;i<m1;i++)
			{
				for(j=0;j<n2;j++)
				{
					C[i][j]=0;
					for (int k=0;k<n1;k++)
					{
						C[i][j]+=(A[i][k]*B[k][j]);
					}
				}
			}
			System.out.println("Multiplied Matrix:");			
			for (i=0;i<m1;i++)
			{
				if (i!=0){System.out.println("");}
				for (j=0;j<n2;j++)
				{
					System.out.print("\t"+C[i][j]);
				}
			}
			System.out.println("");
		}
		else
		{
			System.out.println("Matrix Multiplication Not Possible");
		}
	}
}
