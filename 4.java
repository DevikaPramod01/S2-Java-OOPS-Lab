import java.util.Scanner;
class matrix
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows of matrix ");
		int m=sc.nextInt();
		System.out.println("enter the no of columns in the matrix  ");
		int n=sc.nextInt();
		int i,j;
		int[][] a=new int[10][10];
		int[][] b=new int[10][10];
		int[][] c=new int[10][10];
		System.out.println("enter the first matrix ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("enter the second matrix  ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("the resulting matrix ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println(c[i][j]+"");
			}
			System.out.println(" ");
		}
	}
}
	
