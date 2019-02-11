import java.util.Scanner;
import java.lang.*;

public class diagnolDiff {

public static void main(String args[]) {
int r, c, i, j, d1=0, d2=0, diff=0;
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
		
// to calculate the sum elementscof secondary diagnol
 if((i+j)== (c-1))
 {
 d2 = d2+ matrix[i][j];
 }	 
		
	}
}

System.out.println("Sum of elements of left-right diagnol is :" +d1);
System.out.println("Sum of elements of right-left diagnol is :" +d2); 

diff = d1-d2;
System.out.println("Difference of sum between two diagonals are:" + Math.abs(diff ));


}
} 

 