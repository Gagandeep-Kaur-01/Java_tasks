import java.util.Scanner;

public class diagnolDiff {

public static void main(String args[]) {
int r, c, i, j, d1=0, d2;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows and columns:");
r = in.nextInt();
c = in.nextInt();

int matrix[][] = new int[r][c];
System.out.println("Elements of matrix:");
for(i=0; i<r; i++)
{
	for(j=0; j<c; j++)
	{
 matrix[i][j]=in.nextInt();
	}
}
System.out.print("Elements of matrix :");
for(i=0; i<r; i++)
{
	for(j=0;j<c;j++)
	{
		System.out.println(matrix[i][j]);
	}
}
for(i=0;i<r;i++)
{
	for(j=0;j<c;j++){
		if(i==j)
		{
			d1 = d1+matrix[i][j];
		}
	}
}

System.out.println("Sum of elements of diagnol is :" +d1);
 
 //System.out.println();
	

}
} 

 